package questoesAvancadas.loja;

import java.time.LocalDate;

public class Funcionario  extends Pessoa {

    private double SALARIO_TETO_IMPOSTO;

    private double salario;

    public Funcionario(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
    }

    public Funcionario(String nome, LocalDate dataNascimento, double salario, double SALARIO_TETO_IMPOSTO) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.SALARIO_TETO_IMPOSTO = SALARIO_TETO_IMPOSTO;
    }

    public double getSALARIO_TETO_IMPOSTO() {
        return SALARIO_TETO_IMPOSTO;
    }

    public void setSALARIO_TETO_IMPOSTO(double SALARIO_TETO_IMPOSTO) {
        this.SALARIO_TETO_IMPOSTO = SALARIO_TETO_IMPOSTO;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                " nome=" + getNome() +
                ", dataNascimento=" + getDataNascimento() +
                ", SALARIO_TETO_IMPOSTO=" + SALARIO_TETO_IMPOSTO +
                ", salario=" + salario +
                ", salario descontando impostos=" + calcularImposto();
    }

    public double calcularImposto() {
        if (salario <= SALARIO_TETO_IMPOSTO) {
            return salario - (salario * 0.05);
        } else {
            return salario - (salario * 0.75);
        }
    }
}
