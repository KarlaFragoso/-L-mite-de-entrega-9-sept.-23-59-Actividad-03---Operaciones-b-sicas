/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author JESS
 */
public class ModelCalculadora {
    
    private float numero1=0;
    private float numero2=0;
    private float resultado=0;

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

   
    
    
   public float sumar(){
       this.resultado = this.numero1 + this.numero2;
       return this.resultado;
   }
    
    public float restar(){
       this.resultado = this.numero1 - this.numero2;
       return this.resultado;
   }
    
     public float multiplicacion(){
       this.resultado = this.numero1 * this.numero2;
       return this.resultado;
   }
    
      public float diviision(){
       this.resultado = this.numero1 / this.numero2;
       return this.resultado;
   }
    
       public float modulo(){
       this.resultado = this.numero1 % this.numero2;
       return this.resultado;
   }
}

    
