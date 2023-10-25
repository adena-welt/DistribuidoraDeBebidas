package ifsuldeminas.bcc.PrimeiroProjeto.Endenty;

public class Individuo {
    private long ID;
    private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    private String endereco;

    public Individuo(long id, String nome, String cpf, String telefone, String dataNascimento, String endereco) {
        this.ID = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

}
