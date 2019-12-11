/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.racionaldaviddavid;

/**
 *
 * @author ramos-drh
 */
public class AppRacional {

    public static void main(String[] args) {
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);

        Racional racAleatorio;
        racAleatorio = Racional.aleatorio();

        // mostrar los tres resultados
        z.imprimirConsola();
        k.imprimirConsola();
        racAleatorio.imprimirConsola();

        // comparar z y k y mostrarlo por pantalla
        if (Racional.igualdad(z, k)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        
        System.out.println("El resultado de sumar " + z + " y " + k + " es: ");
        z.suma(k);
        System.out.println(z);
        
        System.out.println("El resultado de dividir " + z + " entre " + k + " es: ");
        System.out.println(Racional.division(z,k));
        
        System.out.println("El resultado de multiplicar " + z + " por " + k + " es: ");
        z.multiplicar(k);
        System.out.println(z);
    }

}
