package questoesAvancadas.controladorFinanceiro;

import questoesAvancadas.controladorFinanceiro.despesas.DespesaComAgua;
import questoesAvancadas.controladorFinanceiro.despesas.DespesaComEnergia;
import questoesAvancadas.controladorFinanceiro.despesas.DespesaComInternet;
import questoesAvancadas.controladorFinanceiro.receitas.LicencaBasica;
import questoesAvancadas.controladorFinanceiro.receitas.LicencaPlus;
import questoesAvancadas.controladorFinanceiro.receitas.LicencaEnterprise;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TesteControladorFinanceiro {

    public static void main(String[] args) {

        FluxoCaixa f = new FluxoCaixa("Blitzwolf", "0000-0");

        DespesaComAgua despesaComAgua = new DespesaComAgua(
                LocalDateTime.of(2014, 12, 10, 12, 10),
                "Conta de dezembro de 2014",
                27
        );

        DespesaComInternet despesaComInternet = new DespesaComInternet(
                LocalDateTime.of(2018, 12, 10, 12, 10),
                "Conta de dezembro de 2014",
                27
        );

        DespesaComEnergia despesaComEnergia = new DespesaComEnergia(
                LocalDateTime.of(2017, 12, 10, 12, 10),
                "Conta de dezembro de 2014",
                27
        );

        System.out.println("despesaComAgua: " + despesaComAgua.calcularTotal());

        System.out.println("despesaComInternet: " + despesaComInternet.calcularTotal());

        System.out.println("despesaComEnergia: " + despesaComEnergia.calcularTotal());

        f.adicionarTransacao(despesaComAgua);
        f.adicionarTransacao(despesaComInternet);
        f.adicionarTransacao(despesaComEnergia);

        System.out.println(
                "calcularTotalDespesas: " +
                f.calcularDespesas(
                        LocalDate.of(2014, 10, 10),
                        LocalDate.of(2014, 12, 20)
                )
        );

        LicencaBasica licencaBasica = new LicencaBasica(
                LocalDateTime.of(2020, 9, 13, 3, 5),
                "Licenças básicas",
                10
        );

        LicencaPlus licencaPlus = new LicencaPlus(
                LocalDateTime.of(2019, 9, 13, 3, 5),
                "Licenças plus",
                5
        );

        LicencaEnterprise licencaEnterprise = new LicencaEnterprise(
                LocalDateTime.of(2015, 9, 13, 3, 5),
                "Licenças básicas",
                3
        );

        System.out.println("licencaBasica: " + licencaBasica.calcularTotal());

        System.out.println("licencaPlus: " + licencaPlus.calcularTotal());

        System.out.println("licencaEnterprise: " + licencaEnterprise.calcularTotal());

        f.adicionarTransacao(licencaBasica);
        f.adicionarTransacao(licencaPlus);
        f.adicionarTransacao(licencaEnterprise);

        System.out.println(
                "calcularTotalReceitas: " +
                f.calcularReceitas(
                        LocalDate.of(2019, 1, 1),
                        LocalDate.of(2020, 12, 31)
                )
        );

        System.out.println("percentualDespesasNoMes: " + f.percentualDespesasNoMes(12, 2014));

        System.out.println("percentualReceitasNoMes: " + f.percentualReceitasNoMes(12, 2014));

        System.out.println("saldoAtual: " + f.saldoAtual());

        System.out.println("listaDeTransacoesNoMes: " + f.listarTransacoesNoMes(12, 2014));

    }

}
