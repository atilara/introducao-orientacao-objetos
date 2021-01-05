package questoesAvancadas.loja;

import java.time.LocalDate;
import java.util.Objects;

public class Funcionario extends Pessoa {

    protected static final double SALARIO_TETO_IMPOSTO = 1100;

    protected double salario;

    public Funcionario(String nome, LocalDate dataNascimento, double salario) {
        super(nome, dataNascimento);
        this.salario = salario;
    }

    public static double getSalarioTetoImposto() {
        return SALARIO_TETO_IMPOSTO;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        if (!super.equals(o)) return false;

        Funcionario funcionario = (Funcionario) o;

        return Objects.equals(salario, funcionario.salario);
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "Teto salarial=" + SALARIO_TETO_IMPOSTO +
                ", Valor do salário com imposto=" + calcularImposto() +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                "}";
    }

    public double calcularImposto() {
        if (salario <= SALARIO_TETO_IMPOSTO) {
            return salario - (salario * 0.05);
        } else {
            return salario - (salario * 0.075);
        }
    }
}
