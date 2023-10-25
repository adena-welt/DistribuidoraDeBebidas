package ifsuldeminas.bcc.PrimeiroProjeto.Endenty;

public class Cliente extends Individuo {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente(Long id, long ID, String nome, String cpf, String telefone, String dataNascimento, String endereco) {
        super(ID, nome, cpf, telefone, dataNascimento, endereco);
        this.id = id;
    }
}
