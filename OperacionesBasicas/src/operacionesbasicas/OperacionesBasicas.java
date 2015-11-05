/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasicas;

/**
 *
 * @author Xtratech
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Multiplicacion m = new Multiplicacion();
          m.multi();
        
        Suma aplicacion=new Suma();
        aplicacion.sumar();
        
        Raiz r = new Raiz ();
        r.Raiz();
        
        Potencia p = new Potencia();
        p.potenciaa();
        
        RestaDesarrollo res = new RestaDesarrollo();
        res.restar();
        System.out.println("Fin del trabajo")
        
        
    }
    
}
