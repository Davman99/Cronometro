/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal c = new Principal();
        
        for(int i = 0; i< 10000; i++){
            c.avanzar();
            System.out.println(c.obtenerTiempo());
            if( i % 100 == 0);
            c.guardarMemoria;
            
        }
        // TODO code application logic here
    }
    
}
