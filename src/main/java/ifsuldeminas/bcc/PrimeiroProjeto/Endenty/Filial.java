package ifsuldeminas.bcc.PrimeiroProjeto.Endenty;

public class Filial {
    private Long id;
    private String nomeFilial;
    private String endereco;
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
  void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
