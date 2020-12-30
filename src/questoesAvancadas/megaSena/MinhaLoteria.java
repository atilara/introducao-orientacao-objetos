package questoesAvancadas.megaSena;

import java.util.ArrayList;

public class MinhaLoteria {

    public static void main(String[] args) {
        // Instância do bilhete premiado
        BilheteLoteria bilhetePremiado = new BilheteLoteria(6);

        // Instância do ArrayList que irá armazenar os bilhetes, fiz fora do loop para não criar um
        // ArrayList diferente sempre que o loop fosse executado
        ArrayList<BilheteLoteria> bilhetes = new ArrayList<>();

        // Laço Externo, que varia de 6 a 15
        int i;
        for (i = 6; i <= 15; i++) {

            // Variáveis auxiliares
            boolean ganhou = false;
            int quantApostas = 0;
            int quantQuadras = 0;
            int quantQuinas = 0;

            // Enquanto ganhou for falso, o laço interno continuará rodando
            while (!ganhou){
                // Criação de um novo bilhete sorteado até que o jogador ganhe
                BilheteLoteria bilheteSorteado = new BilheteLoteria(i);
                // Caso os 6 números do bilhete premiado estão contidos no bilhete sorteado
                if (bilhetePremiado.qtdNumerosContidos(bilheteSorteado) == 6) {
                    // Realizei o armazenamento dos bilhetes que ganharam o jogo no ArrayList
                    // Infelizmente caso eu armazenasse todos (como foi solicitado)
                    // a quantidade de memória utilizada pelo sistema estourava dava erro
                    bilhetes.add(bilheteSorteado);
                    ganhou = true;
                } else if (bilhetePremiado.qtdNumerosContidos(bilheteSorteado) == 5) {
                    quantQuinas++;
                } else if (bilhetePremiado.qtdNumerosContidos(bilheteSorteado) == 4) {
                    quantQuadras++;
                }

                // Aumento da quantidade de apostas
                quantApostas++;
            }
            System.out.println("\nJogos de " + i + " números: você apostou " + quantApostas + " vezes" +
                    " para ganhar na mega-sena. Dentre esses jogos, você acertou " + quantQuadras +
                    " quadras e " + quantQuinas + " quinas.");

        }
    }

}