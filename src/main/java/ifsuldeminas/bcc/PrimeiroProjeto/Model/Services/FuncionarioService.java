package ifsuldeminas.bcc.PrimeiroProjeto.Model.Services;

import ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity.Funcionario;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getAllFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario getFuncionarioById(Long id) {
        return funcionarioRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Funcionario not found with id: " + id));
    }

    public Funcionario createFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario updateFuncionario(Long id, Funcionario newFuncionario) {
        Funcionario existingFuncionario = getFuncionarioById(id);
        existingFuncionario = newFuncionario;
        return funcionarioRepository.save(existingFuncionario);
    }

    public void deleteFuncionario(Long id) {
        funcionarioRepository.deleteById(id);
    }
}

