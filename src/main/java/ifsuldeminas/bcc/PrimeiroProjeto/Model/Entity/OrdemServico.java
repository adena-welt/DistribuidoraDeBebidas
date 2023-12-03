package ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@EqualsAndHashCode(of = "id")
@Entity
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_Funcionario")
    private Funcionario funcionario;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Carro carro;

    @ManyToMany
    private List<Pagamento> pagamentos;

    @ManyToMany
    private List<Peca> pecas;

    public OrdemServico() {
    }
    public OrdemServico(Long id, String descricao, Funcionario funcionario, Cliente cliente, Carro carro,
                        List<Pagamento> pagamentos, List<Peca> pecas) {
        this.id = id;
        this.descricao = descricao;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.carro = carro;
        this.pagamentos = pagamentos;
        this.pecas = pecas;
    }

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

    public Funcionario getFuncionarios() {
        return funcionario;
    }

    public void setFuncionarios(Funcionario funcionario) {
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
}
