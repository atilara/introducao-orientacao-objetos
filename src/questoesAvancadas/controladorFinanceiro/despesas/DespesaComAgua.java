package questoesAvancadas.controladorFinanceiro.despesas;

import java.time.LocalDateTime;

public class DespesaComAgua extends Despesa {

    private double totalM3;

    public DespesaComAgua(LocalDateTime data, String descricao, double totalM3) {
        this.data = data;
        this.descricao = descricao;
        this.totalM3 = totalM3;
    }


    public double getTotalM3() {
        return totalM3;
    }

    public void setTotalM3(double totalM3) {
        this.totalM3 = totalM3;
    }

    @Override
    public double calcularTotal() {
        final double VALOR_FIXO = 45;
        double valorFinal = 0;
        if (totalM3 < 10) valorFinal = VALOR_FIXO;
        if (totalM3 <= 20) valorFinal = VALOR_FIXO + 5 * (totalM3 - 10);
        else valorFinal = VALOR_FIXO + 5 * 10 + 6 * (totalM3 - 20);

        return valorFinal;
    }
}
