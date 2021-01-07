package questoesAvancadas.controladorFinanceiro.despesas;

import java.time.LocalDateTime;

public class DespesaComEnergia extends Despesa {

    private double kWh;

    public DespesaComEnergia(LocalDateTime data, String descricao, double kWh) {
        this.data = data;
        this.descricao = descricao;
        this.kWh = kWh;
    }

    public double getkWh() {
        return kWh;
    }

    public void setkWh(double kWh) {
        this.kWh = kWh;
    }

    @Override
    public double calcularTotal() {
        double valorFinal = kWh * 0.5;

        if (valorFinal <= 50) valorFinal += 2;
        if (valorFinal > 50 && valorFinal <= 200) valorFinal += 15;
        if (valorFinal > 200) valorFinal += 35;
        if (valorFinal % 100 == 0) valorFinal += valorFinal*(valorFinal / 100);

        return valorFinal;
    }
}
