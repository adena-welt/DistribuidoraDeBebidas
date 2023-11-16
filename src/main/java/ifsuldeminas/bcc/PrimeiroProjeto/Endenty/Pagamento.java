package ifsuldeminas.bcc.PrimeiroProjeto.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double valor;

    private String dataPagamento;

    @ManyToOne
    private OrdemServico ordemServico;

    public Pagamento(Long id, double valor, String dataPagamento, OrdemServico ordemServico) {
        this.id = id;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.ordemServico = ordemServico;
    }
}
