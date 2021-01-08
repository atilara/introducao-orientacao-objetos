package questoesAvancadas.controladorFinanceiro.despesas;

import java.time.LocalDateTime;

public class DespesaComInternet extends Despesa {

    private double dadosTrafegados;

    public DespesaComInternet(LocalDateTime data, String descricao, double dadosTrafegados) {
        this.data = data;
        this.descricao = descricao;
        this.dadosTrafegados = dadosTrafegados;
    }

    public double getDadosTrafegados() {
        return dadosTrafegados;
    }

    public void setDadosTrafegados(double dadosTrafegados) {
        this.dadosTrafegados = dadosTrafegados;
    }

    @Override
    public double calcularTotal() {
        double valorFinal = 0;

        if (dadosTrafegados <= 20) valorFinal = 90.9;
        else if (dadosTrafegados < 100) valorFinal = 90.9 + ((dadosTrafegados - 20) * 3.9);
        else if (dadosTrafegados >= 100) valorFinal = 240.9  + ((dadosTrafegados - 100) * 4.4);
        else if (dadosTrafegados >= 500) valorFinal = 590.9 + ((dadosTrafegados - 500) * 5.1);

        return valorFinal;
    }
}
