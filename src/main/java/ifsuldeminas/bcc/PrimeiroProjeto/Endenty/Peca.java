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
public class Peca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String valor;
    private String marca;
    private String codigoOriginal;
    private String aplicacao;
    private String descricao;

    @ManyToMany(mappedBy = "pecas")
    private List<OrdemServico> ordensServico;

    public Peca(Long id, String nome, String valor, String marca, String codigoOriginal, String aplicacao,
                String descricao, List<OrdemServico> ordensServico) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
        this.codigoOriginal = codigoOriginal;
        this.aplicacao = aplicacao;
        this.descricao = descricao;
        this.ordensServico = ordensServico;
    }
}
