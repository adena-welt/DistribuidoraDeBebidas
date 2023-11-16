package ifsuldeminas.bcc.PrimeiroProjeto.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "ID")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Individuo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    private String endereco;

    // Construtores, getters e setters...

    public Individuo() {
        // Construtor padrão
    }

    public Individuo(Long ID, String nome, String cpf, String telefone, String dataNascimento, String endereco) {
        this.ID = ID;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}
