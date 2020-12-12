package questao05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Cliente {
    private String cpf;

    private String nome;

    private LocalDateTime dataNascimento;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    long calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.until(dataNascimento, ChronoUnit.YEARS);
    }
}
