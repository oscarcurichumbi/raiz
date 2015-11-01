/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Suma {
      public void sumar()
    {
    Scanner entrada=new Scanner(System.in);
    
    int valor1=entrada.nextInt();
    int valor2=entrada.nextInt();
    
    int suma= valor1+valor2;
    
    System.out.println("La suma es: "+suma);
    }
}
