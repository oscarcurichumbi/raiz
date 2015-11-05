/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author Xtratech
 */
public class Multiplicacion {

    public void multi() {
        Scanner tecla = new Scanner(System.in);
        int num1, num2, total;
        System.out.println("==============================================");
     
        System.out.println("Ingrese el numero 1");
        num1 = tecla.nextInt();

        System.out.println("Ingrese el numero 2");
        num2 = tecla.nextInt();

        total = num1 * num2;

        System.out.println("El resultado de la  Multiplicacion es ==>    " + total);
     

    }
}
