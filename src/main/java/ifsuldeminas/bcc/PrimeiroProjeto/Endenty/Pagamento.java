package ifsuldeminas.bcc.PrimeiroProjeto.Endenty;

public class Pagamento {
    private Long id;
    private double valor;
    private String DataPagamento;
    private OrdemServico ordemServico;

    public Pagamento(Long id, double valor, String DataPagamento, OrdemServico ordemServico) {
        this.id = id;
        this.valor = valor;
        this.DataPagamento = DataPagamento;
        this.ordemServico = ordemServico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataPagamento() {
        return DataPagamento;
    }

    public void setDataPagamento(String DataPagamento) {
        this.DataPagamento = DataPagamento;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }

}

