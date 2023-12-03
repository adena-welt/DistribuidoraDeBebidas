package ifsuldeminas.bcc.PrimeiroProjeto.Model.Services;

import ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity.Filial;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class FilialService {

    @Autowired
    private FilialRepository filialRepository;

    public List<Filial> getAllFiliais() {
        return filialRepository.findAll();
    }

    public Filial getFilialById(Long id) {
        return filialRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Filial not found with id: " + id));
    }

    public Filial createFilial(Filial filial) {
        return filialRepository.save(filial);
    }

    public Filial updateFilial(Long id, Filial newFilial) {
        Filial existingFilial = getFilialById(id);
        existingFilial.setNomeFilial(newFilial.getNomeFilial());
        existingFilial.setEndereco(newFilial.getEndereco());
        existingFilial.setTelefone(newFilial.getTelefone());
        return filialRepository.save(existingFilial);
    }

    public void deleteFilial(Long id) {
        filialRepository.deleteById(id);
    }
}
