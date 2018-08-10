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
    
    /*
    Mostrar numeros en la pantalla
    Si es la primera vez que se presiona un digito o un numero.
    
    
    */
    private void digitoPantalla(String numero){
        if(!digito && numero.equals("0")){
        return;
        }
        //Limpiar la pantalla
        if(!digito){
        label.setText("");
        punto = false;
        }
        
        String velActual = label.getText();
        label.setText(velActual + numero);
        digito = true;
    }
    
    
    
    
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

     @FXML
    private void clic_Div(ActionEvent event) {
        //digitoPantalla("/");
    }

    @FXML
    private void clic_Mult(ActionEvent event) {
    }
    
     @FXML
    private void clic_Igual(ActionEvent event) {
    }

    @FXML
    private void clic_Resta(ActionEvent event) {
    }
    
     @FXML
    private void clic_Mas(ActionEvent event) {
        
    }
    
       @FXML
    private void clic_Punto(ActionEvent event) {
        if(!punto && !digito){
        label.setText("0.");
        digito = true;
        
        }else if(!punto){
        String valActual = label.getText();
        label.setText(valActual + ".");
        }
        punto = true;
        
    }
    
    @FXML
    private void clic_Siete(ActionEvent event) {
        digitoPantalla("7");
        
    }

    @FXML
    private void clic_Dos(ActionEvent event) {
        digitoPantalla("2");
    }

    @FXML
    private void clic_Cuatro(ActionEvent event) {
        digitoPantalla("4");
    }

    @FXML
    private void clic_Tres(ActionEvent event) {
        digitoPantalla("3");
    }

    @FXML
    private void clic_Seis(ActionEvent event) {
        digitoPantalla("6");
    }
    
    @FXML
    private void clic_Cero(ActionEvent event) {
        digitoPantalla("0");
    }

    @FXML
    private void clic_Cinco(ActionEvent event) {
        digitoPantalla("5");
    }

    @FXML
    private void clic_Ocho(ActionEvent event) {
        digitoPantalla("8");
    }

    @FXML
    private void clic_Uno(ActionEvent event) {
        digitoPantalla("1");
    }
    
}
