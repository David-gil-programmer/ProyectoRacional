/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionaldaviddavid;
import java.util.Random;

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
        this.b = b;  
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

    public void resta(Racional racional2) {
        if (this.b != racional2.b) {
            this.a = this.a * racional2.b - this.b * racional2.a;
            this.b = this.b * racional2.b;
        }
        this.a = this.a - racional2.a;
        //this.b = this.b;
    }


    /*
    Método producto(Racional x), que guardará en los atributos del objeto que hace la 
    llamada la siguiente información: en el numerador almacenará el valor del producto 
    de los numeradores y en el denominador almacenará el valor del producto de los denominadores.
    */
    
    public void multiplicar(Racional racional2){
        this.a *= racional2.a;
        this.b *= racional2.b;
    }
    

    public static Racional division(Racional racional1, Racional racional2){
        Racional r2  = new Racional ();
        r2.a = racional1.a * racional2.b;
        r2.b = racional1.b * racional2.a;
        
        return r2;

    }
    
    /*
    Método de clase igualdad(Racional x, Racional y) que devolverá si el Racional x 
    es igual al Racional y, siguiendo la siguiente equivalencia
    Numerador del 1º multiplicado por Denom del 2º = denomin del 1º por num del 2º
    */
    
    public static boolean igualdad(Racional x, Racional y){
        return x.a * y.b == x.b * y.a;
    }
    public static Racional aleatorio(){
        Racional r3 = new Racional();
        
    Random aleatorioA = new Random();
        r3.a = aleatorioA.nextInt();
        do{
    Random aleatorioB = new Random();
        r3.b = aleatorioB.nextInt();
        }while(r3.b==0);
        return r3;
    }
    
    
}
