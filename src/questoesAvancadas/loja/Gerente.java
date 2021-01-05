package questoesAvancadas.loja;

import java.time.LocalDate;
import java.util.Objects;

public class Gerente extends Funcionario {

    private String areaAtuacao;

    public Gerente(String nome, LocalDate dataNascimento, double salario, String areaAtuacao) {
        super(nome, dataNascimento, salario);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gerente)) return false;
        if (!super.equals(o)) return false;

        Gerente gerente = (Gerente) o;

        return Objects.equals(areaAtuacao, gerente.areaAtuacao);
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "Teto salarial=" + SALARIO_TETO_IMPOSTO +
                ", salario=" + salario +
                ", Salário com imposto descontado=" + calcularImposto() +
                ", areaAtuacao='" + areaAtuacao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                "}";
    }
}
