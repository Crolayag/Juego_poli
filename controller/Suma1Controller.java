/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.suma;

/**
 * FXML Controller class
 *
 * @author camio
 */
public class Suma1Controller implements Initializable {

    @FXML
    private RadioButton rdbOpcion2;
    @FXML
    private RadioButton rdbOpcion1;

    @FXML
    private RadioButton rdbOpcion3;
    @FXML
    private Button BtnGuardar;
    @FXML
    private ImageView imagNumeros;

    private String SumaCorrecto;
    private int ConteoRespuestasCorrectas = 0;
    private int ConteoRespuestasIncorrectas = 0;
    @FXML
    private ToggleGroup Opciones;
     /**
     * Initializes the controller class.
     * @param url    
     * @param rb    
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 1) + 1) + 1;
        List<String> DatosSuma = suma.ObtenerDatosSuma(randomNum);

        rdbOpcion1.setText(DatosSuma.get(0));
        rdbOpcion2.setText(DatosSuma.get(1));
        rdbOpcion3.setText(DatosSuma.get(2));

        Image image = new Image(DatosSuma.get(3));
        imagNumeros.setImage(image);
        imagNumeros.setCache(true);

        SumaCorrecto = DatosSuma.get(4);
    }
    @FXML
    private void siguiente(ActionEvent event) {

        RadioButton selectedRadioButton = (RadioButton) Opciones.getSelectedToggle();

        if (selectedRadioButton != null) {
            String toogleGroupValue = selectedRadioButton.getText();

            if (SumaCorrecto.equals(toogleGroupValue)) {
                ConteoRespuestasCorrectas = ConteoRespuestasCorrectas + 1;
                Random rand = new Random();
                int randomNum = rand.nextInt((10 - 1) + 1) + 1;
                List<String> DatosSuma = suma.ObtenerDatosSuma(randomNum);

                rdbOpcion1.setText(DatosSuma.get(0));
                rdbOpcion2.setText(DatosSuma.get(1));
                rdbOpcion3.setText(DatosSuma.get(2));

                Image image = new Image(DatosSuma.get(3));
                imagNumeros.setImage(image);
                imagNumeros.setCache(true);

                SumaCorrecto = DatosSuma.get(4);

                if (ConteoRespuestasCorrectas == 10) {
                    Alert alertConfirmacion = new Alert(Alert.AlertType.INFORMATION);
                    alertConfirmacion.setHeaderText(null);
                    alertConfirmacion.setTitle("GANASTE");
                    alertConfirmacion.setContentText("GANASTE");

                    Optional<ButtonType> result = alertConfirmacion.showAndWait();
                    if (result.get() == ButtonType.OK) {
                        Stage stage = (Stage) this.BtnGuardar.getScene().getWindow();
                        stage.close();
                    }
                }
            } else {
                ConteoRespuestasIncorrectas = ConteoRespuestasIncorrectas + 1;
                if (ConteoRespuestasIncorrectas == 3) {
                    Alert alertConfirmacion = new Alert(Alert.AlertType.WARNING);
                    alertConfirmacion.setHeaderText(null);
                    alertConfirmacion.setTitle("PERDISTE");
                    alertConfirmacion.setContentText("PERDISTE");

                    Optional<ButtonType> result = alertConfirmacion.showAndWait();
                    if (result.get() == ButtonType.OK) {
                        Stage stage = (Stage) this.BtnGuardar.getScene().getWindow();
                        stage.close();
                    }
                } else {
                    Alert alertEr = new Alert(Alert.AlertType.ERROR);
                    alertEr.setHeaderText(null);
                    alertEr.setTitle("Error");
                    alertEr.setContentText("wrong answer,you have " + (3 - ConteoRespuestasIncorrectas) + " attempts left. ");
                    alertEr.showAndWait();
                }
            }
        } else {

            Alert alertEr = new Alert(Alert.AlertType.ERROR);
            alertEr.setHeaderText(null);
            alertEr.setTitle("Error");
            alertEr.setContentText("Debes seleccionar una respuesta, por favor.");
            alertEr.showAndWait();
        }
    }
}
