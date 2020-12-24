package questao05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {

    private ItemVenda[] itemVenda;

    private LocalDateTime data;

    private String atendente;

    private Cliente cliente;

    public Venda(LocalDateTime data, String atendente) {
        this.itemVenda = new ItemVenda[10];
        this.data = data;
        this.atendente = atendente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
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
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("kk:mm - dd/MM/yyyy");

        // Imprimindo informações iniciais
        System.out.printf("%nData da venda: %s%n" +
            "Nome do Cliente: %s | CPF: %s | Idade: %d%n" +
            "Atendente: %s%n" +
            "%18s | %11s | %10s | %10s%n" +
            "----------------------------------------------------------------%n",
            data.format(formatador), cliente.getNome(), cliente.getCpf(), cliente.calcularIdade(), atendente,
            "Nome do produto", "Preço", "Quantidade", "Total");

        // Imprimindo todos os itens vendidos usando um loop
        int i;
        for (i = 0; i < itemVenda.length; i++) {
            if (itemVenda[i] != null) {
                System.out.printf("%18s | R$ %8.2f | %10d | R$ %10.2f%n",
                    itemVenda[i].getProdutoVendido().getNome(),
                    itemVenda[i].getProdutoVendido().getPreco(),
                    itemVenda[i].getQuantidade(),
                    itemVenda[i].calcularTotal());
            }
        }

        // Imprimindo total
        System.out.printf("----------------------------------------------------------------%n" +
            "Total da Venda: %38s %2.2f", "R$", calcularTotal());

    }
}
