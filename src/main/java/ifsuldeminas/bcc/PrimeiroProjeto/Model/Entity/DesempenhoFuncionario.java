

package ifsuldeminas.bcc.PrimeiroProjeto.Model.Entity;

import jakarta.persistence.*;
import lombok.*;
@EqualsAndHashCode(of = "id")
@Entity
public class DesempenhoFuncionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double tempoMedioReparo;
    private double eficienciaPecas;

    @OneToOne
    private Funcionario funcionario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTempoMedioReparo() {
        return tempoMedioReparo;
    }

    public void setTempoMedioReparo(double tempoMedioReparo) {
        this.tempoMedioReparo = tempoMedioReparo;
    }

    public double getEficienciaPecas() {
        return eficienciaPecas;
    }

    public void setEficienciaPecas(double eficienciaPecas) {
        this.eficienciaPecas = eficienciaPecas;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
