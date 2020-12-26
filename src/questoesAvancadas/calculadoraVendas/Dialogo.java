package questoesAvancadas.calculadoraVendas;

import javafx.scene.control.Alert;

public class Dialogo {

    private Alert aviso = new Alert(Alert.AlertType.WARNING);

    private Alert informacao = new Alert(Alert.AlertType.INFORMATION);

    public void aviso(String texto) {
        aviso.setTitle("Aviso!");
        aviso.setHeaderText(null);
        aviso.setContentText(texto);
        aviso.showAndWait();
    }

    public void informacao(String texto) {
        informacao.setTitle("Informação");
        informacao.setHeaderText(null);
        informacao.setContentText(texto);
        informacao.showAndWait();
    }

}
