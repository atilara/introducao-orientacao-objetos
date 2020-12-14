package questao05;

import java.time.LocalDate;

public class Venda {

    private ItemVenda[] itemVenda;

    private LocalDate data;

    private String atendente;

    private Cliente cliente;

    public Venda(LocalDate data, String atendente) {
        this.itemVenda = new ItemVenda[10];
        this.data = data;
        this.atendente = atendente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(ItemVenda item) {
        int i;
        for (i = 0; i<itemVenda.length; i++) {
            if (itemVenda[i] == null) {
                itemVenda[i] = item;
                break;
            }
        }
    }

    public double calcularTotal() {
        double valorTotal = 0;
        int i;
        for (i = 0; i<itemVenda.length; i++) {
            if (itemVenda[i] != null) {
                valorTotal += itemVenda[i].calcularTotal();
            }
        }
        return valorTotal;
    }

    public void listarItensVenda() {
        // Testando as informações
        System.out.println(data);
        System.out.println(cliente.getCpf() + "\n" + cliente.getNome() + "\n" + cliente.calcularIdade());
        System.out.println(atendente);
        System.out.println(itemVenda[0].getProdutoVendido().getNome() + "\n" + itemVenda[0].getProdutoVendido().getPreco() + "\n" + itemVenda[0].getQuantidade());
        System.out.println(itemVenda[0].calcularTotal());
        System.out.println(calcularTotal());
    }
}
