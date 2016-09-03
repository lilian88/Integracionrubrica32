/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracionis2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class IntegracionIS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola mundo");
        Scanner ingreso=new Scanner(System.in);
        int galones, opciones;
        String tipo = null;
        double diesel=1.50, gasolina=3.00,precio=0;
        double iva=12,calculoiva = 0;
        double total = 0,subtotal = 0;
        
        System.out.println("Gasolinera");
        System.out.println("Bienvenidos a PetroEcuador");
        System.out.println("1)Gasolina $3.00 \n2)Diesel   $1.50");
        opciones=ingreso.nextInt();
        System.out.println("ingrese la cantidad en Galones");
        galones=ingreso.nextInt();
    }
    
}
