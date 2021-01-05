package questoesAvancadas.controladorFinanceiro.despesas;

import questoesAvancadas.controladorFinanceiro.Transacao;

import java.time.LocalDate;

public abstract class Despesa implements Transacao {

    @Override
    public LocalDate getData() {
        return null;
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public String getDescricao() {
        return null;
    }

    @Override
    public String calcularTotal() {
        return null;
    }

}
