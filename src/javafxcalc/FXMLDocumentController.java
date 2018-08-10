/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcalc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author jroa
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    
    private boolean digito = false;
    private boolean punto = false;
    private int numOperandos = 0;
    private double operando1, operando2;
    private char operador = ' ';
    
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clic_Siete(ActionEvent event) {
    }

    @FXML
    private void clic_Dos(ActionEvent event) {
    }

    @FXML
    private void clic_Div(ActionEvent event) {
    }

    @FXML
    private void clic_Mult(ActionEvent event) {
    }

    @FXML
    private void clic_Cuatro(ActionEvent event) {
    }

    @FXML
    private void clic_Tres(ActionEvent event) {
    }

    @FXML
    private void clic_Seis(ActionEvent event) {
    }

    @FXML
    private void clic_Mas(ActionEvent event) {
    }

    @FXML
    private void clic_Cero(ActionEvent event) {
    }

    @FXML
    private void clic_Igual(ActionEvent event) {
    }

    @FXML
    private void clic_Resta(ActionEvent event) {
    }

    @FXML
    private void clic_Punto(ActionEvent event) {
    }

    @FXML
    private void clic_Cinco(ActionEvent event) {
    }

    @FXML
    private void clic_Ocho(ActionEvent event) {
    }

    @FXML
    private void clic_Uno(ActionEvent event) {
    }
    
}
