/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import models.ModelCalculadora;
import views.ViewCalculadora;
import controllers.ControllerCalculadora;
public class Main {

    
    public static void main(String[] args) {
        
      
        
        ModelCalculadora modelCalculadora = new ModelCalculadora();
        ViewCalculadora viewCalculadora = new ViewCalculadora();
        ControllerCalculadora controllerCalculadora = new ControllerCalculadora(modelCalculadora, viewCalculadora);
        
        controllerCalculadora.iniciar();
        viewCalculadora.setVisible(true);
        
        
    }
    
}
