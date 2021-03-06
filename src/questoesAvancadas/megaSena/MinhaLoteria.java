package questoesAvancadas.megaSena;

import java.util.ArrayList;

public class MinhaLoteria {

    public static void main(String[] args) {
        // Instância do bilhete premiado
        BilheteLoteria bilhetePremiado = new BilheteLoteria(6);

        // Vars auxiliares
        boolean ganhou = false;
        int quantQuadras = 0;
        int quantQuinas = 0;

        // Laço Externo, que varia de 6 a 15
        int i;
        for (i = 6; i <= 15; i++) {

            // Zerando valor das vars auxiliares
            ganhou = false;
            quantQuadras = 0;
            quantQuinas = 0;

            // Instância do ArrayList que iria armazenar os bilhetes, comentado devido a memória
            // ArrayList<BilheteLoteria> bilhetes = new ArrayList<>();

            // Quantidade de apostas feitas em cada quant de numeros, substituindo o arraylist devido a
            // problemas na memória
            int quantApostas = 0;

            // Enquanto ganhou for falso, o laço interno continuará rodando
            while (!ganhou){
                // Criação de um novo bilhete sorteado até que o jogador ganhe
                BilheteLoteria bilheteSorteado = new BilheteLoteria(i);
                // Caso os 6 números do bilhete premiado estão contidos no bilhete sorteado
                if (bilhetePremiado.qtdNumerosContidos(bilheteSorteado) == 6) {
                    ganhou = true;
                } else if (bilhetePremiado.qtdNumerosContidos(bilheteSorteado) == 5) {
                    quantQuinas++;
                } else if (bilhetePremiado.qtdNumerosContidos(bilheteSorteado) == 4) {
                    quantQuadras++;
                }

                // Adição dos bilhetes no ArrayList comentado devido a problemas na memória
                // bilhetes.add(bilheteSorteado);
                // Utilizando variável aux para contar
                quantApostas++;
            }
            // Utilizando var em vez de bilhetes.size para contar a quant de apostas, devido a memória
            System.out.println("\nJogos de " + i + " números: você apostou " + quantApostas + " vezes" +
                    " para ganhar na mega-sena. Dentre esses jogos, você acertou " + quantQuadras +
                    " quadras e " + quantQuinas + " quinas.");
            // Limpeza do ArrayList caso fosse utilizado
            // bilhetes.clear(bilhetes);

        }
    }

}
