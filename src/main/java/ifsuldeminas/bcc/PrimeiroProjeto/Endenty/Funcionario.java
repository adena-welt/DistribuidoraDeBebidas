
package ifsuldeminas.bcc.PrimeiroProjeto.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@PrimaryKeyJoinColumn(referencedColumnName = "ID")

public class Funcionario extends Individuo {
    @OneToMany(mappedBy = "funcionarios")
    private List<OrdemServico> ordensServico;

    @OneToOne(mappedBy = "funcionario")
    private DesempenhoFuncionario desempenho;

    public Funcionario(Long id, String nome, List<OrdemServico> ordensServico, DesempenhoFuncionario desempenho,
                       Long ID, String cpf, String telefone, String dataNascimento, String endereco) {
        super(ID, nome, cpf, telefone, dataNascimento, endereco);
        this.ordensServico = ordensServico;
        this.desempenho = desempenho;
    }
}
