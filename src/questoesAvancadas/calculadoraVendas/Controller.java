package questoesAvancadas.calculadoraVendas;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField descricao;

    @FXML
    private TextField valor;

    @FXML
    private TextField quantidade;

    @FXML
    private Button calcular;

    public String getDescricao() {
        return descricao.getText();
    }

    public String getValor() {
        return valor.getText();
    }

    public String getQuantidade() {
        return quantidade.getText();
    }

    public void buttonClick() {
        Dialogo dialogo = new Dialogo();
        if (getDescricao().equals("") || getValor().equals("") || getQuantidade().equals("")) {
            String aviso = "Os campos a seguir estão vazios: ";
            if (getDescricao().equals("")) {
                aviso = aviso.concat("\n- Descrição do produto");
            } if (getValor().equals("")) {
                aviso = aviso.concat("\n- Valor");
            } if (getQuantidade().equals("")) {
                aviso = aviso.concat("\n- Quantidade");
            }
            dialogo.aviso(aviso);
        } else {
            Produto produto = new Produto
                    (getDescricao(), Double.parseDouble(getValor()), Integer.parseInt(getQuantidade()));
            dialogo.informacao("O valor calculado para a venda do produto "
                    + getDescricao() + " é R$ " + produto.calcularTotal());
        }
    }

}
