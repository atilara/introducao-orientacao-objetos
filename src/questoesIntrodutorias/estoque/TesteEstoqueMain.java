package questoesIntrodutorias.estoque;

public class TesteEstoqueMain {

    public static void main(String[] args) {

        // Instanciação de dois produtos
        Produto produto01 = new Produto("1", "Teclado");
        Produto produto02 = new Produto("2", "Mouse");

        // Instanciação de estoques relacionados ao produto01 e 02
        Estoque estoque01 = new Estoque(produto01, 20, 15);
        Estoque estoque02 = new Estoque(produto02, 30, 10);

        // Dar baixa não funcionará devido a quantidade mínima
        estoque01.darBaixa(10);
        // Repor estoque
        estoque02.reporEstoque(19);

        // Relatório dos estoque01 e 02
        estoque01.relatorio();
        estoque02.relatorio();

        // Utiliza o setNome para mudar o nome do primeiro produto
        produto01.mudarNome("Teclado virtual");

        // Relatório do estoque01 para comprovar mudança de nome
        estoque01.relatorio();
    }

}
