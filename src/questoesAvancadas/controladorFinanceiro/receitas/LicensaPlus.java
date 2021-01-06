package questoesAvancadas.controladorFinanceiro.receitas;

import java.time.LocalDateTime;

public class LicensaPlus extends Receita {

    private int totalContas;

    public LicensaPlus(LocalDateTime data, String descricao, int totalContas) {
        this.data = data;
        this.descricao = descricao;
        this.totalContas = totalContas;
    }

    public int getTotalContas() {
        return totalContas;
    }

    public void setTotalContas(int totalContas) {
        this.totalContas = totalContas;
    }

    @Override
    public double calcularTotal() {
        return totalContas * 35;
    }

}
