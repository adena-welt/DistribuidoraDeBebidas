package ifsuldeminas.bcc.PrimeiroProjeto.Endenty;

import java.util.Date;

public class Agenda {
    private Long id;
    private Date dataCompromisso;
    private Cliente cliente;
    private Funcionario funcionario;
    private Carro carro;
    private String Descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCompromisso() {
        return dataCompromisso;
    }

    public void setDataCompromisso(Date dataCompromisso) {
        this.dataCompromisso = dataCompromisso;
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

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    public Agenda(Date dataCompromisso, Cliente cliente, Funcionario funcionario, Carro carro) {
        this.dataCompromisso = dataCompromisso;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.carro = carro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
