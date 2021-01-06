package questoesAvancadas.controladorFinanceiro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class FluxoCaixa {

    private final ArrayList<Transacao> transacoes;

    private String nomeEmpresa;

    private String cnpj;

    public FluxoCaixa(String nomeEmpresa, String cnpj) {
        transacoes = new ArrayList<>();
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    void adicionarTransacao (Transacao transacao) {
        transacoes.add(transacao);
    }

    double calcularDespesas (LocalDate inicio, LocalDate fim) {
        double valorDespesas = 0;
        LocalDateTime inicioTime = inicio.atTime(0, 0);
        LocalDateTime fimTime = fim.atTime(23, 59);
        for (Transacao t : transacoes) {
            if (t.getData().isAfter(inicioTime) && t.getData().isBefore(fimTime)){
                valorDespesas += t.calcularTotal();
            }
        }
        return valorDespesas;
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
