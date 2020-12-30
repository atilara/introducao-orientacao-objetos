package questoesAvancadas.megaSena;

import java.util.Arrays;
import java.util.Random;

public class BilheteLoteria {

    private int[] jogo;

    public BilheteLoteria(int tamanho) {
        // Define o tamanho do vetor como parâmetro
        jogo = new int[tamanho];

        // Random
        Random r = new Random();

        // Roda o loop até o tamanho máximo do vetor
        int i = 0;
        do {
            // Escolhe um numero entre 1 e 60.
            int numeroSorteado = r.nextInt(60) + 1;

            boolean adicionar = true;

            // Verifica se o numero já esta no Array.
            for(int numeroContido: jogo){
                if (numeroContido == numeroSorteado) {
                    adicionar = false;
                    break;
                }
            }

            // Se adicionar ainda estiver true adiciona o numero.
            if(adicionar){
                jogo[i] = numeroSorteado;
                i++;
            }

        } while (i < jogo.length);

        // Ordena os números em ordem crescente
        Arrays.sort(jogo);

    }

    // Getters and setters
    public int[] getVetorInteiros() {
        return jogo;
    }

    public void setVetorInteiros(int[] jogo) {
        this.jogo = jogo;
    }

    @Override
    public String toString() {
        return Arrays.toString(jogo);
    }

    public int qtdNumerosContidos(BilheteLoteria outroBilhete) {
        int i;
        int qtdNumerosContidos = 0;
        // roda o loop de acordo com o tamanho do vetor (this)
        for (i = 0; i < this.jogo.length; i++) {
            for (int numeroContido: outroBilhete.jogo) {
                if (this.jogo[i] == numeroContido) {
                    qtdNumerosContidos++;
                }
            }
        }
        return qtdNumerosContidos;
    }

}
