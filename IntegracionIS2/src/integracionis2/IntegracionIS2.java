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
        double diesel=2.00, gasolina=3.00,precio=0;
        double iva=12,calculoiva = 0;
        double total = 0,subtotal = 0;
        
        System.out.println("Gasolinera");
        System.out.println("Bienvenidos a PetroEcuador");
        System.out.println("1)Gasolina $3.00 \n2)Diesel   $2.00");
        opciones=ingreso.nextInt();
        System.out.println("ingrese la cantidad en Galones");
        galones=ingreso.nextInt();
        
        if (opciones==1) {
            tipo="Gasolina";
            precio=gasolina;
            subtotal=galones*gasolina;
            calculoiva=subtotal*iva/100;
            total=subtotal+calculoiva;
        }
        if (opciones==2) {
            tipo="Diesel";
            precio=diesel;
            subtotal=galones*diesel;
            calculoiva=subtotal*iva/100;
            total=subtotal+calculoiva;
        }
        System.out.println("*******Factura*******");
        System.out.println("Combustible :"+tipo);
        System.out.println("Cantidad    :"+galones);
        System.out.println("Precio      :"+precio);
        System.out.println("Subtotal    :"+subtotal);
        System.out.println("Iva         :"+calculoiva);
        System.out.println("Total       :"+total);
        
    }
    
}
