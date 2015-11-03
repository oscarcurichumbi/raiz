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
    public static void main(String[] args) {
        int result, a, n;
        Scanner num = new Scanner(System.in);
        System.out.print("Numero (a): ");
        a = num.nextInt();
        System.out.print("Potencia (n): ");
        n = num.nextInt();
        result = potencia(a, n);
        System.out.println("El resultado es " + a + " exp " + n + " = " + result);
       
    }
    static int potencia(int a, int n){
        int result;
        if(n == 0){
            result = 1;
        }
        else{
            
            result = a * potencia(a, n - 1);
        }      
        return result;
    }
}
