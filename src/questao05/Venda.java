package questao05;

import java.time.LocalDateTime;

public class Venda {

    private LocalDateTime data;

    private String atendente;

    public Venda(LocalDateTime data, String atendente) {
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

    void adicionarItem(ItemVenda item) {
        item.calcularTotal();
    }

}
