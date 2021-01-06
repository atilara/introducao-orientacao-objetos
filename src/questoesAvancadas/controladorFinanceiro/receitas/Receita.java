package questoesAvancadas.controladorFinanceiro.receitas;

import questoesAvancadas.controladorFinanceiro.Transacao;

import java.time.LocalDateTime;

public abstract class Receita implements Transacao {

    protected LocalDateTime data;

    protected String descricao;

    @Override
    public LocalDateTime getData() {
        return data;
    }

    @Override
    public String getTipo() {
        return "RECEITA";
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

}
