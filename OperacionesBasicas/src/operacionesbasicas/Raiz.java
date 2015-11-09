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
 
Scanner num= new Scanner (System.in);
int numero,raiz;
String resultado;

public void ingresedatos(){
System.out.println("ingrese el numero");
numero=num.nextInt();
}
public void calcular(){
raiz=(int) Math.sqrt(numero);
}
public String Muestradatos(){
return("la raiz cuadrada de"+numero+"\n\n"+"es: "+raiz+"\n\n");

}
    
}
