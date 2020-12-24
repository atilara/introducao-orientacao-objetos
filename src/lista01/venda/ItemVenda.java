package questao05;

public class ItemVenda {

    Produto produtoVendido;

    private int quantidade;

    public ItemVenda(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(Produto produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    double calcularTotal() {
       return produtoVendido.getPreco() * quantidade;
    }
    
}
