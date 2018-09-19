/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelCalculadora;
import views.ViewCalculadora;
import extras.DataValidation;

public class ControllerCalculadora  implements ActionListener  {
    
    private ModelCalculadora modelCalculadora;
     private ViewCalculadora viewCalculadora;
     
     private DataValidation dataValidation = new DataValidation();
     

    public ControllerCalculadora(ModelCalculadora modelCalculadora, ViewCalculadora viewCalculadora) {
        this.modelCalculadora = modelCalculadora;
        this.viewCalculadora = viewCalculadora;
        
        this.viewCalculadora.jb_suma.addActionListener(this);
        this.viewCalculadora.jb_resta.addActionListener(this);
        this.viewCalculadora.jb_multiplicacion.addActionListener(this);
        this.viewCalculadora.jb_division.addActionListener(this);
        this.viewCalculadora.jb_modulo.addActionListener(this);
        
        this.viewCalculadora.jb_limpiar.addActionListener(this);
    }
     
    public void iniciar(){
        viewCalculadora.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        modelCalculadora.setNumero1(dataValidation.string2Int(viewCalculadora.jtf_numero1.getText()));
        modelCalculadora.setNumero2(dataValidation.string2Int(viewCalculadora.jtf_numero2.getText()));
        
    if(e.getSource()==viewCalculadora.jb_suma) modelCalculadora.sumar();
    if(e.getSource()==viewCalculadora.jb_resta) modelCalculadora.restar();
    if(e.getSource()==viewCalculadora.jb_multiplicacion) modelCalculadora.multiplicacion();
    if(e.getSource()==viewCalculadora.jb_division) modelCalculadora.diviision();
    if(e.getSource()==viewCalculadora.jb_modulo) modelCalculadora.modulo();
    if(e.getSource()==viewCalculadora.jb_limpiar) ;
    
    viewCalculadora.jl_resultadototal.setText(String.valueOf(modelCalculadora.getResultado()));
    
    if(e.getSource() == viewCalculadora.jb_limpiar){
        viewCalculadora.jtf_numero1.setText("");
        viewCalculadora.jtf_numero2.setText("");
        viewCalculadora.jl_resultadototal.setText("");
  }
   
    }
    
    private void initComponets() {
         viewCalculadora.setVisible(true);
        viewCalculadora.setVisible(true);
    }
}
   

     
    

