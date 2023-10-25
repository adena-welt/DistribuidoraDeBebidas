package ifsuldeminas.bcc.PrimeiroProjeto.Endenty;
import java.util.List;

public class OrdemServico {
    private Long id;
    private String descricao;
    private List<Funcionario> funcionario;
    private Cliente cliente;
    private Carro carro;
    private List<Pagamento> pagamentos;
    private List<Peca> pecas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(List<Peca> pecas) {
        this.pecas = pecas;
    }

    public OrdemServico(Long id, String descricao, List<Funcionario> funcionario, Cliente cliente, Carro carro, List<Pagamento> pagamentos, List<Peca> pecas) {
        this.id = id;
        this.descricao = descricao;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.carro = carro;
        this.pagamentos = pagamentos;
        this.pecas = pecas;
    }

}
