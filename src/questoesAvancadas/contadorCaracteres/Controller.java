package questoesAvancadas.contadorCaracteres;

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

    // Conta os caracteres presentes no TextArea utilizando método lenght
    // Antes de contar os caracteres remove todos os espaços utilizando replaceAll
    public void countCharacters() {
        setLabel("O texto tem " + getTextArea().replaceAll("\\s","").length() + " caracteres");
    }
}
