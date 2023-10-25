package ifsuldeminas.bcc.PrimeiroProjeto.Endenty;

public class DesempenhoFuncionario {
    private Long id;
    private double tempoMEdioReparo;
    private double eficienciaPecas;
    private Funcionario funcionario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTempoMEdioReparo() {
        return tempoMEdioReparo;
    }

    public void setTempoMEdioReparo(double tempoMEdioReparo) {
        this.tempoMEdioReparo = tempoMEdioReparo;
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


    public DesempenhoFuncionario(Long id) {
        this.id = id;
    }
}
