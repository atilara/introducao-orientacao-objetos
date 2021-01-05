package questoesAvancadas.controladorFinanceiro.despesas;

public class DespesaComAgua extends Despesa {

    private double totalM3;

    public double getTotalM3() {
        return totalM3;
    }

    public void setTotalM3(double totalM3) {
        this.totalM3 = totalM3;
    }

    @Override
    public double calcularTotal() {
        double valorFinal = 45;

        if (totalM3 > 10 && totalM3 <= 20) valorFinal += (totalM3 - 10) * 5;
        if (totalM3 > 20) valorFinal += (totalM3 - 20) * 6;

        return valorFinal;
    }
}
