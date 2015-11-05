/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Raiz {
    
    public void Raiz(){
    
    System.out.println("==============================================");
    double result, val;
        Scanner num = new Scanner(System.in);
        System.out.print("Ingrse el numero : ");
        val = num.nextInt();
        
        result = Math.sqrt(val);
        
        System.out.println("El resultado de la radicacion  es==>"+result);
    
    }
    
}
