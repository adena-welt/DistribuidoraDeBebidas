package ifsuldeminas.bcc.PrimeiroProjeto.Model.Services;

import ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity.Cliente;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity.Filial;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository.ClienteRepository;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository.FilialRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clientRepository;

    public List<Cliente> getAllClientes() {
        return clientRepository.findAll();
    }

    public Cliente getClienteById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Funcionario not found with id: " + id));
    }

    public Cliente createCliente(Cliente cliente) {
        return clientRepository.save(cliente);
    }

    public Cliente updateCliente(Long id, Cliente newCliente) {
        Cliente existingCliente = getClienteById(id);
        existingCliente = newCliente;
        return clientRepository.save(existingCliente);
    }

    public void deleteCliente(Long id) {
        clientRepository.deleteById(id);
    }
}

