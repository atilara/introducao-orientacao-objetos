package questoesAvancadas.controladorFinanceiro.despesas;

import questoesAvancadas.controladorFinanceiro.Transacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Despesa implements Transacao {

    protected LocalDateTime data;

    protected String descricao;

    @Override
    public LocalDateTime getData() {
        return data;
    }

    @Override
    public String getTipo() {
        return "DESPESA";
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public abstract double calcularTotal();


    @Override
    public String toString() {
        DateTimeFormatter ft = DateTimeFormatter.ofPattern("kk:mm - dd/MM/yyyy");

        return "Despesa{" +
                "data=" + data.format(ft) +
                ", descricao='" + descricao + '\'' +
                ", total=" + calcularTotal() +
                '}';
    }
}
