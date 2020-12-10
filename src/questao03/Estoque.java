package questao03;

public class Estoque {

    private Produto produto;

    private int qtdAtual;

    private int qtdMinima;

    // Construtor vazio
    Estoque() {
        produto = null;
        qtdAtual = 0;
        qtdMinima = 0;
    }
    // Construtor com parâmetros
    Estoque(Produto produto, int qtdAtual, int qtdMinima) {
        this.produto = produto;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    // setQtdMinima
    public void mudarQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    // Repor estoque atual
    public void reporEstoque(int qtd) {
        qtdAtual += qtd;
    }

    // Dar baixa no estoque, apenas quando a quantidade não se torna menor que a mínima
    public void darBaixa(int qtd) {
        if (qtdAtual - qtd < qtdMinima) {
            System.out.println("Não é possível dar baixa!");
        } else {
            qtdAtual -= qtd;
        }
    }

    // Pega e imprime todos os valores necessários
    public void relatorio() {
        System.out.println("Código: " + produto.pegarCodigo());
        System.out.println("Nome: " + produto.pegarNome());
        System.out.println("Quantidade atual: " + qtdAtual);
        System.out.println("Quantidade mínima: " + qtdMinima);
    }

}
