package questoesAvancadas.controladorFinanceiro.receitas;

public class LicencaBasica extends Receita {

    private int totalContas;

    public int getTotalContas() {
        return totalContas;
    }

    public void setTotalContas(int totalContas) {
        this.totalContas = totalContas;
    }

    @Override
    public double calcularTotal() {
        return totalContas * 20;
    }
}
