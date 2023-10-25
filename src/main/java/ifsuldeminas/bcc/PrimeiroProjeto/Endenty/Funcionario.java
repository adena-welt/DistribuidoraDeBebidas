package ifsuldeminas.bcc.PrimeiroProjeto.Endenty;

import java.util.List;

public class Funcionario extends Individuo {
    public Long id;
    public String nome;
    public List<OrdemServico> ordensServico;
    public DesempenhoFuncionario desempenho;

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

    public List<OrdemServico> getOrdensServico() {
        return ordensServico;
    }

    public void setOrdensServico(List<OrdemServico> ordensServico) {
        this.ordensServico = ordensServico;
    }

    public DesempenhoFuncionario getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(DesempenhoFuncionario desempenho) {
        this.desempenho = desempenho;
    }

    public Funcionario(Long id, String nome, List<OrdemServico> ordensServico, DesempenhoFuncionario desempenho,
                       long ID, String nomeIndividuo, String cpf, String telefone, String dataNascimento, String endereco) {
        super(ID, nomeIndividuo, cpf, telefone, dataNascimento, endereco);
        this.id = id;
        this.nome = nome;
        this.ordensServico = ordensServico;
        this.desempenho = desempenho;
    }
}
