package questao05;

import java.time.LocalDate;

public class TesteVendaMain {

    public static void main(String[] args) {

        // Instância dos produtos
        Produto produto01 = new Produto(1, "Produto 01", "Primeiro produto criado", 10);
        Produto produto02 = new Produto(2, "Produto 02", "Segundo produto criado", 5);
        Produto produto03 = new Produto(3, "Produto 03", "Terceiro produto criado", 20);
        Produto produto04 = new Produto(4, "Produto 04", "Quarto produto criado", 15);

        // Instância das vendas relacionadas aos produtos criados anteriormente
        ItemVenda itemVenda01 = new ItemVenda(10);
        ItemVenda itemVenda02 = new ItemVenda(5);
        ItemVenda itemVenda03 = new ItemVenda( 10);
        ItemVenda itemVenda04 = new ItemVenda( 2);

        itemVenda01.setProdutoVendido(produto01);
        itemVenda02.setProdutoVendido(produto02);
        itemVenda03.setProdutoVendido(produto03);
        itemVenda04.setProdutoVendido(produto04);

        // Instância do cliente
        Cliente cliente = new Cliente("123456", "José Maria Marques", LocalDate.of(1994, 1, 1));

        // Instância da venda e associação do cliente
        Venda venda = new Venda(LocalDate.of(2020, 12, 23), "Maria Dolores Sampaio");
        venda.setCliente(cliente);

        // Adicionando itens
        venda.adicionarItem(itemVenda01);
        venda.adicionarItem(itemVenda02);
        venda.adicionarItem(itemVenda03);
        venda.adicionarItem(itemVenda04);

        // Listando
        venda.listarItensVenda();

    }

}
