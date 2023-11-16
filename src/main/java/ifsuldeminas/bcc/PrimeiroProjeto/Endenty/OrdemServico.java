package ifsuldeminas.bcc.PrimeiroProjeto.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class OrdemServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @ManyToMany
    private List<Funcionario> funcionarios;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Carro carro;

    @ManyToMany
    private List<Pagamento> pagamentos;

    @ManyToMany
    private List<Peca> pecas;

    public OrdemServico(Long id, String descricao, List<Funcionario> funcionarios, Cliente cliente, Carro carro,
                        List<Pagamento> pagamentos, List<Peca> pecas) {
        this.id = id;
        this.descricao = descricao;
        this.funcionarios = funcionarios;
        this.cliente = cliente;
        this.carro = carro;
        this.pagamentos = pagamentos;
        this.pecas = pecas;
    }
}
