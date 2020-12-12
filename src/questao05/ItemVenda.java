package questao05;

public class ItemVenda {

    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    double calcularTotal() {
        return produto.getPreco() * quantidade;
    }
    
}
