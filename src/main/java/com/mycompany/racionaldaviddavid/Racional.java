/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionaldaviddavid;

/**
 *
 * @author david
 */
public class Racional {
    
    private int a; 
    private int b;

    public Racional() {
        this.a = 1;
        this.b = 1;
    }
    
    /*
    B. Constructor parametrizado. Se debe controlar que el denominador no es cero, 
    en tal caso se asignará el valor 1 y se mostrará un mensaje por consola indicando 
    que el denominador no es válido y se asigna el valor 1.
    */
    
    public Racional(int a, int b){
        if(this.b == 0){
            this.b = 1;
            System.out.println("Error: el denominador no puede ser 0 (se ha inicializado a 1)");
        }
        this.a = a;
    }
    
    // Métodos get

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        if(b == 0){
            System.out.println("Es incorrecto y se establece como valor 1");
        this.b = 1;
        }
        this.b = b;
    }
    public void imprimirConsola(){
        System.out.println("Numero racional "+a+"/"+b);
    }

    @Override
    public String toString() {
        return a + "/" + b;
    }
    
    /*
    B. Método suma(Racional x), que sumará al racional que llama al método el 
    valor del número racional que recibe como argumento. 
    Hay que tener en cuenta la siguiente información:
    */
    
    // relacional1.suma(relacional2)
    
    public void suma(Racional racional2){
        if(this.b != racional2.b){
            this.a = this.a*racional2.b + this.b*racional2.a;
            this.b = this.b*racional2.b;
        }
        this.a = this.a+racional2.a;
        //this.b = this.b;
    }
    
}
