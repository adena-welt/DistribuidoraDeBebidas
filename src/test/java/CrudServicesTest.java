import ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity.*;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository.FuncionarioRepository;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository.ClienteRepository;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository.CarroRepository;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Repository.FilialRepository;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Services.FuncionarioService;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Services.ClienteService;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Services.CarroService;
import ifsuldeminas.bcc.PrimeiroProjeto.Model.Services.FilialService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CrudServicesTest {

    @Mock
    private FuncionarioRepository funcionarioRepository;

    @Mock
    private ClienteRepository clienteRepository;

    @Mock
    private FilialRepository filialRepository;

    @InjectMocks
    private FuncionarioService funcionarioService;

    @InjectMocks
    private ClienteService clienteService;

    @InjectMocks
    private FilialService filialService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    // Métodos CRUD para Funcionario

    @Test
    void getAllFuncionarios() {
        List<Funcionario> mockFuncionarios = new ArrayList<>();
        when(funcionarioRepository.findAll()).thenReturn(mockFuncionarios);

        List<Funcionario> result = funcionarioService.getAllFuncionarios();

        assertEquals(mockFuncionarios, result);
    }

    @Test
    void getFuncionarioById() {
        Long id = 1L;
        Funcionario mockFuncionario = criarMockFuncionario(id);
        when(funcionarioRepository.findById(id)).thenReturn(Optional.of(mockFuncionario));

        Funcionario result = funcionarioService.getFuncionarioById(id);

        assertEquals(mockFuncionario, result);
    }

    @Test
    void getFuncionarioByIdNotFound() {
        Long id = 1L;
        when(funcionarioRepository.findById(id)).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> funcionarioService.getFuncionarioById(id));
    }

    @Test
    void createFuncionario() {
        Long id = 1L;
        Funcionario mockFuncionario = criarMockFuncionario(id);
        when(funcionarioRepository.save(any(Funcionario.class))).thenReturn(mockFuncionario);
        Funcionario result = funcionarioService.createFuncionario(mockFuncionario);
        assertEquals(mockFuncionario, result);
    }

    @Test
    void updateFuncionario() {
        Long id = 1L;
        Funcionario existingFuncionario = criarMockFuncionario(id);
        Funcionario newFuncionario = criarMockFuncionarioAtualizado(id);

        when(funcionarioRepository.findById(id)).thenReturn(Optional.of(existingFuncionario));
        when(funcionarioRepository.save(any(Funcionario.class))).thenReturn(newFuncionario);

        Funcionario result = funcionarioService.updateFuncionario(id, newFuncionario);

        assertEquals(newFuncionario.getNome(), result.getNome());
    }

    @Test
    void updateFuncionarioNotFound() {
        Long id = 1L;
        Funcionario newFuncionario = criarMockFuncionarioAtualizado(id);

        when(funcionarioRepository.findById(id)).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> funcionarioService.updateFuncionario(id, newFuncionario));
    }

    @Test
    void deleteFuncionario() {
        Long id = 1L;
        funcionarioService.deleteFuncionario(id);
        verify(funcionarioRepository).deleteById(id);
    }

    @Test
    void getAllClientes() {
        List<Cliente> mockClientes = new ArrayList<>();
        when(clienteRepository.findAll()).thenReturn(mockClientes);

        List<Cliente> result = clienteService.getAllClientes();

        assertEquals(mockClientes, result);
    }

    @Test
    void getClienteById() {
        Long id = 1L;
        Cliente mockCliente = criarMockCliente(id);
        when(clienteRepository.findById(id)).thenReturn(Optional.of(mockCliente));

        Cliente result = clienteService.getClienteById(id);

        assertEquals(mockCliente, result);
    }

    @Test
    void getClienteByIdNotFound() {
        Long id = 1L;
        when(clienteRepository.findById(id)).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> clienteService.getClienteById(id));
    }

    @Test
    void createCliente() {
        Long id = 1L;
        Cliente mockCliente = criarMockCliente(id);
        when(clienteRepository.save(any(Cliente.class))).thenReturn(mockCliente);

        Cliente result = clienteService.createCliente(mockCliente);

        assertEquals(mockCliente, result);
    }

    @Test
    void updateCliente() {
        Long id = 1L;
        Cliente existingCliente = criarMockCliente(id);
        Cliente newCliente = criarMockClienteAtualizado(id);

        when(clienteRepository.findById(id)).thenReturn(Optional.of(existingCliente));
        when(clienteRepository.save(any(Cliente.class))).thenReturn(newCliente);

        Cliente result = clienteService.updateCliente(id, newCliente);

        assertEquals(newCliente.getNome(), result.getNome());
    }

    @Test
    void updateClienteNotFound() {
        Long id = 1L;
        Cliente newCliente = criarMockClienteAtualizado(id);
        when(clienteRepository.findById(id)).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> clienteService.updateCliente(id, newCliente));
    }

    @Test
    void deleteCliente() {
        Long id = 1L;
        Cliente newCliente = criarMockClienteAtualizado(id);
        clienteService.createCliente(newCliente);
        clienteService.deleteCliente(id);
        verify(clienteRepository).deleteById(id);
    }

    @Test
    void getAllFiliais() {
        List<Filial> mockFiliais = new ArrayList<>();
        when(filialRepository.findAll()).thenReturn(mockFiliais);

        List<Filial> result = filialService.getAllFiliais();

        assertEquals(mockFiliais, result);
    }

    @Test
    void getFilialById() {
        Long id = 1L;
        Filial mockFilial = criarMockFilial(id);
        when(filialRepository.findById(id)).thenReturn(Optional.of(mockFilial));

        Filial result = filialService.getFilialById(id);

        assertEquals(mockFilial, result);
    }

    @Test
    void createFilial() {
        Long id = 1L;
        Filial mockFilial = criarMockFilial(id);
        when(filialRepository.save(any(Filial.class))).thenReturn(mockFilial);

        Filial result = filialService.createFilial(mockFilial);

        assertEquals(mockFilial, result);
    }

    @Test
    void updateFilial() {
        Long id = 1L;
        Filial existingFilial = criarMockFilial(id);
        Filial newFilial = criarMockFilialAtualizado(id);

        when(filialRepository.findById(id)).thenReturn(Optional.of(existingFilial));
        when(filialRepository.save(any(Filial.class))).thenReturn(newFilial);

        Filial result = filialService.updateFilial(id, newFilial);

        assertEquals(newFilial.getNomeFilial(), result.getNomeFilial());
    }

    @Test
    void updateFilialNotFound() {
        Long id = 1L;
        Filial newFilial = criarMockFilialAtualizado(id);

        when(filialRepository.findById(id)).thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> filialService.updateFilial(id, newFilial));
    }

    @Test
    void deleteFilial() {
        Long id = 1L;
        filialService.deleteFilial(id);
        verify(filialRepository).deleteById(id);
    }

    // Funções auxiliares para criar mocks
    private Funcionario criarMockFuncionario(Long id) {
        return new Funcionario(id, "Nome",  new ArrayList<>(), new DesempenhoFuncionario(), "456-456-456-57", "35997379360", "05/08/2001", "Rua teste");
    }

    private Funcionario criarMockFuncionarioAtualizado(Long id) {
        return new Funcionario(id, "Nome Atualizado", new ArrayList<>(), new DesempenhoFuncionario(), "456-456-456-57", "35997379360", "05/08/2001", "Rua teste atualizada");
    }

    private Cliente criarMockCliente(Long id) {
        return new Cliente(id, "Nome", "123-456-789-01", "35991234567", "01/01/1990", "Rua Cliente");
    }

    private Cliente criarMockClienteAtualizado(Long id) {
        return new Cliente(id, "Nome Atualizado", "123-456-789-01", "35991234567", "01/01/1990", "Rua Cliente Atualizada");
    }

    private Filial criarMockFilial(Long id) {
        return new Filial(id, "NomeFilial", "EnderecoFilial", "TelefoneFilial");
    }

    private Filial criarMockFilialAtualizado(Long id) {
        return new Filial(id, "NomeFilialAtualizado", "EnderecoFilialAtualizado", "TelefoneFilialAtualizado");
    }
}
