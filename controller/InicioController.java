/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class InicioController implements Initializable {

    @FXML
    private Button BtonIniciar;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void iniciar(ActionEvent event) throws IOException {
        // Cargo la vista
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/opciones.fxml"));

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
