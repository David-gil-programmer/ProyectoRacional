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
    
    
    
}
