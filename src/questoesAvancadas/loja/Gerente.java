package questoesAvancadas.loja;

import java.time.LocalDate;

public class Gerente extends Funcionario {

    private String areaAtuacao;

    public Gerente(String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
    }

    public Gerente(String nome, LocalDate dataNascimento, double salario, double SALARIO_TETO_IMPOSTO) {
        super(nome, dataNascimento, salario, SALARIO_TETO_IMPOSTO);
    }

    public Gerente(String nome, LocalDate dataNascimento, double salario, double SALARIO_TETO_IMPOSTO, String areaAtuacao) {
        super(nome, dataNascimento, salario, SALARIO_TETO_IMPOSTO);
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String toString() {
        return "Gerente: " +
                " nome=" + getNome() +
                ", dataNascimento=" + getDataNascimento() +
                ", SALARIO_TETO_IMPOSTO=" + getSALARIO_TETO_IMPOSTO() +
                ", salario=" + getSalario() +
                ", salario descontando impostos=" + calcularImposto() +
                ", areaAtuacao=" + areaAtuacao;
    }
}
