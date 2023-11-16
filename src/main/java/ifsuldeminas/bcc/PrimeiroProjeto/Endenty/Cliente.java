package ifsuldeminas.bcc.PrimeiroProjeto.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@PrimaryKeyJoinColumn(referencedColumnName = "ID")
public class Cliente extends Individuo {
    // Construtores, getters e setters...

    public Cliente() {
        // Construtor padrão
    }

    public Cliente(Long id, Long ID, String nome, String cpf, String telefone, String dataNascimento, String endereco) {
        super(ID, nome, cpf, telefone, dataNascimento, endereco);
    }

    // Outras anotações, getters e setters...
}
