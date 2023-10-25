package ifsuldeminas.bcc.PrimeiroProjeto.Endenty;

public class AgendamentoAutomatico {

    private Long id;
    private Cliente cliente;
    private String dataHora;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public AgendamentoAutomatico(Long id) {
        this.id = id;
    }
    private String servico;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

