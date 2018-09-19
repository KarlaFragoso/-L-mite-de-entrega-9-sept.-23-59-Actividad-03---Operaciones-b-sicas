/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import javax.swing.JOptionPane;

/**
 *
 * @author JESS
 */
public class DataValidation {
    
    public int string2Int(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor");
            result = 0;
        }
        return result;
    }
    
        public int string2Float(String value){
        float result = 0;
        try{
            result = Float.parseFloat(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor");
            result = 0;
        }
        return (int) result;
    }
        
        public int string2Double(String value){
        double result = 0;
        try{
            result = Double.parseDouble(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor");
            result = 0;
        }
        return (int) result;
    }
        
        
    
    
}
