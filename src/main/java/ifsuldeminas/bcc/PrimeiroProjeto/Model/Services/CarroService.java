package ifsuldeminas.bcc.PrimeiroProjeto.Model.Services;

import ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity.Carro;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    @Autowired
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> getAllCarros() {
        return carroRepository.findAll();
    }

    public Carro getCarroById(Long id) {
        return carroRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Carro not found with id: " + id));
    }

    public Carro createCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    public Carro updateCarro(Long id, Carro newCarro) {
        Carro existingCarro = getCarroById(id);
        existingCarro = newCarro;

        return carroRepository.save(existingCarro);
    }

    public void deleteCarro(Long id) {
        carroRepository.deleteById(id);
    }
}

