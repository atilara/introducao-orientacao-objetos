package lista02.contadorCaracteres;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Instanciação da janela, buscando layout do FXML, definindo seu tamanho, etc
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        primaryStage.setScene(new Scene(root, 600, 400));

        // Título da janela
        primaryStage.setTitle("Contador de Caracteres");
        // Torna a janela impossível de redimensionar
        primaryStage.setResizable(false);
        // Mostra a janela
        primaryStage.show();
    }
}
