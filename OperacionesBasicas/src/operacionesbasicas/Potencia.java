/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author J Geovanny Vega
 */
public class Potencia {

    public void potenciaa() 
    {
         System.out.println("==============================================");
        double result, a, n;
        Scanner num = new Scanner(System.in);
        System.out.print("Numero (a): ");
        a = num.nextInt();
        System.out.print("Potencia (n): ");
        n = num.nextInt();
        
        result = Math.pow(a, n);
        
        System.out.println("El resultado de la potencia es==>"+result);
       
    }
}
