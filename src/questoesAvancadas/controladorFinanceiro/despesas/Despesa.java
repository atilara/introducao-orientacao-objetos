package questoesAvancadas.controladorFinanceiro.despesas;

import questoesAvancadas.controladorFinanceiro.Transacao;

import java.time.LocalDateTime;

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
    public double calcularTotal() {
        return 1;
    }

}
