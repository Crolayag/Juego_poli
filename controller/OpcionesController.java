
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author camio
 */
public class OpcionesController implements Initializable {
    @FXML
    private Button BotnSuma;
    @FXML
    private Button BotnResta;
    @FXML
    private Button BotnMultiplicacion;
    @FXML
    private Button BotnDivision;
    @Override
     /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private void click_suma(ActionEvent event) throws IOException {
        // Cargo la vista
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/suma1.fxml"));

        // Cargo la ventana
        Parent root = loader.load();

        // Creo el Scene
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }
    @FXML
    private void clickResta(ActionEvent event) throws IOException {
        // Cargo la vista
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/resta.fxml"));

        // Cargo la ventana
        Parent root = loader.load();

        // Creo el Scene
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }
    @FXML
    private void clickMultiplicacion(ActionEvent event) throws IOException {
        // Cargo la vista
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Multiplicacion.fxml"));

        // Cargo la ventana
        Parent root = loader.load();

        // Creo el Scene
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }
    @FXML
    private void clickDivision(ActionEvent event) throws IOException {
        // Cargo la vista
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/division.fxml"));

        // Cargo la ventana
        Parent root = loader.load();

        // Creo el Scene
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }
}
