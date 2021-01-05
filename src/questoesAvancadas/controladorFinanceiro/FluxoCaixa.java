package questoesAvancadas.controladorFinanceiro;

import java.time.LocalDate;
import java.util.List;

public class FluxoCaixa {

    private String nomeEmpresa;

    private String cnpj;

    void adicionarTransacao (Transacao transacao) {}

    double calcularDespesas (LocalDate inicio, LocalDate fim) {
        return 1;
    }

    double calcularReceitas (LocalDate inicio, LocalDate fim) {
        return 1;
    }

    double percentualDespesasNoMes(int mes, int ano) {
        return 1;
    }

    double percentualReceitasNoMes(int mes, int ano) {
        return 1;
    }

    double saldoAtual() {
        return 1;
    }

//    List<Transacao> listarTransacoesNoMes(int mes, int ano) {
//        List<Transacao> transacoes = new List<>();
//    }

}
