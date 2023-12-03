
package ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@EqualsAndHashCode(of = "id")
@PrimaryKeyJoinColumn(referencedColumnName = "ID")

public class Funcionario extends Individuo {
    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<OrdemServico> ordensServico;

    @OneToOne(mappedBy = "funcionario")
    private DesempenhoFuncionario desempenho;

    public Funcionario() {
    }
    public Funcionario(Long ID, String nome, List<OrdemServico> ordensServico, DesempenhoFuncionario desempenho,
                       String cpf, String telefone, String dataNascimento, String endereco) {
        super(ID, nome, cpf, telefone, dataNascimento, endereco);
        this.ordensServico = ordensServico;
        this.desempenho = desempenho;
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
}
