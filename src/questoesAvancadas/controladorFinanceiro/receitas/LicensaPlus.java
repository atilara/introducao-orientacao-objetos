package questoesAvancadas.controladorFinanceiro.receitas;

public class LicensaPlus extends Receita {

    private int totalContas;

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
