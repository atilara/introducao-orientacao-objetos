package lista02.contadorpalavras;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {

    // Define os componentes presentes na janela, declarados no FXML
    @FXML
    private TextArea textArea;

    @FXML
    private Button button;

    @FXML
    private Label label;

    // Métodos
    public String getTextArea() {
        return textArea.getText();
    }

    public Button getButton() {
        return button;
    }

    public String getLabel() {
        return label.getText();
    }

    public void setLabel(String text) {
        label.setText(text);
    }

    // Conta as palavras presentes no TextArea utilizando método split
    // Depois altera o texto presente no label
    public void countWords() {
        String[] numero = getTextArea().split("\\s+");
        setLabel("O texto tem " + numero.length + " palavras");
    }
}
