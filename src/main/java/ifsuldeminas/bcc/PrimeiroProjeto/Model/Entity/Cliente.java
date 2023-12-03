package ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@EqualsAndHashCode(of = "id")
@PrimaryKeyJoinColumn(referencedColumnName = "ID")
public class Cliente extends Individuo {
    public Cliente() {
    }
    public Cliente(Long ID, String nome, String cpf, String telefone, String dataNascimento, String endereco) {
        super(ID, nome, cpf, telefone, dataNascimento, endereco);
    }
}
