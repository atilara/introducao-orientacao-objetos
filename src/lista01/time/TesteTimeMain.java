package lista01.time;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TesteTimeMain {

    public static void main(String[] args) {

        // Scanner para ler String
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a data no formato dd/MM/yyyy: ");
        String data = leitor.next();

        // Incluindo formatação da data solicitada
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Transformando String em LocalDate
        LocalDate dataLida = LocalDate.parse(data, formatador);

        // Armazenando data atual
        LocalDate dataAtual = LocalDate.now();

        // Calculando período entre data lida e data atual
        System.out.println("\nNúmero de dias entre " + dataAtual.format(formatador) + " e "
                + dataLida.format(formatador) + " é: " + Math.abs(dataAtual.until(dataLida, ChronoUnit.DAYS)));

        // Somando 110 dias a data lida
        System.out.println(dataLida.format(formatador) + " + 110: " + dataLida.plusDays(110).format(formatador));

        // Alterando mês da data informada para agosto
        System.out.println("Alterando mês para agosto: " + dataLida.withMonth(8).format(formatador));


        // Leitura das datas
        System.out.print("\nQuantidade de Dias Úteis entre Datas:\nInforme a primeira data no formato dd/MM/yyyy: ");
        String dtInicial = leitor.next();
        LocalDate dataInicial = LocalDate.parse(dtInicial, formatador);

        System.out.print("Informe a segunda data no formato dd/MM/yyyy: ");
        String dtFinal = leitor.next();
        LocalDate dataFinal = LocalDate.parse(dtFinal, formatador);

        // Cálculo e impressão da quantidade de dias
        System.out.println("A quantidade de dias úteis entre " + dataInicial.format(formatador)
        + " e " + dataFinal.format(formatador) + " é: " + qtdDiasUteis(dataInicial, dataFinal));

    }

    // Responsável por calcular a quant de dias úteis entre duas datas
    static int qtdDiasUteis(LocalDate dataInicial, LocalDate dataFinal) {
        // 0 como valor inicial
        int qtdDiasUteis = 0;

        // quantidade de dias existentes entre as duas datas
        long qtdDias = dataInicial.until(dataFinal, ChronoUnit.DAYS);
        // loop rodará de acordo com a qtd de dias
        for (int i = 1; i < qtdDias; i++) {
            // se for sábado ou domingo nada é feito
            if (dataInicial.plusDays(i).getDayOfWeek().getValue() != 6 &&
                dataInicial.plusDays(i).getDayOfWeek().getValue() != 7){
                qtdDiasUteis++;
            }
        }
        return Math.abs(qtdDiasUteis + 1);
    }
    
}
