package ifsuldeminas.bcc.PrimeiroProjeto.Endenty;
import java.util.List;
public class Peca {
    private Long id;
    private String nome;
    private String valor;
    private String marca;
    private String codigoOriginal;
    private String aplicacao;
    private String descricao;
    private List<OrdemServico> ordensServico;

    public Peca(Long id, String nome, String valor, String marca, String codigoOriginal, String aplicacao, String descricao, List<OrdemServico> ordensServico) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
        this.codigoOriginal = codigoOriginal;
        this.aplicacao = aplicacao;
        this.descricao = descricao;
        this.ordensServico = ordensServico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigoOriginal() {
        return codigoOriginal;
    }

    public void setCodigoOriginal(String codigoOriginal) {
        this.codigoOriginal = codigoOriginal;
    }

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<OrdemServico> getOrdensServico() {
        return ordensServico;
    }

    public void setOrdensServico(List<OrdemServico> ordensServico) {
        this.ordensServico = ordensServico;
    }

}
