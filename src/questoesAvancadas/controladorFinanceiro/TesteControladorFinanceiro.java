package questoesAvancadas.controladorFinanceiro;

import questoesAvancadas.controladorFinanceiro.despesas.DespesaComAgua;
import questoesAvancadas.controladorFinanceiro.despesas.DespesaComEnergia;
import questoesAvancadas.controladorFinanceiro.despesas.DespesaComInternet;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TesteControladorFinanceiro {

    public static void main(String[] args) {

        DespesaComAgua a = new DespesaComAgua(
                LocalDateTime.of(2014, 12, 10, 12, 10),
                "Conta de dezembro de 2014",
                27
        );

        DespesaComInternet i = new DespesaComInternet(
                LocalDateTime.of(2018, 12, 10, 12, 10),
                "Conta de dezembro de 2014",
                27
        );

        DespesaComEnergia e = new DespesaComEnergia(
                LocalDateTime.of(2017, 12, 10, 12, 10),
                "Conta de dezembro de 2014",
                27
        );

        System.out.println(a.calcularTotal());

        System.out.println(i.calcularTotal());

        System.out.println(e.calcularTotal());

        FluxoCaixa f = new FluxoCaixa("Blitzwolf", "0000-0");

        f.adicionarTransacao(a);
        f.adicionarTransacao(i);
        f.adicionarTransacao(e);

        System.out.println(
                f.calcularDespesas(
                        LocalDate.of(2014, 10, 10),
                        LocalDate.of(2014, 12, 20)
                )
        );
    }

}
