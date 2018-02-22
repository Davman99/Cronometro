/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro.Logica;

/**
 *
 * @author Estudiantes
 */
public class Memoria {
     private Unidaddetiempo decimas;
     private Unidaddetiempo segundos;
     private Unidaddetiempo minutos;
     private Unidaddetiempo horas;
    
    public Memoria(){
        decimas = new Unidaddetiempo(10);
        segundos = new Unidaddetiempo(60);
        minutos = new Unidaddetiempo(60);
        horas = new Unidaddetiempo(24);
        
       
    }

    public Unidaddetiempo getDecimas() {
        return decimas;
    }

    public void setDecimas(Unidaddetiempo decimas) {
        this.decimas = decimas;
    }

    public Unidaddetiempo getSegundos() {
        return segundos;
    }

    public void setSegundos(Unidaddetiempo segundos) {
        this.segundos = segundos;
    }

    public Unidaddetiempo getMinutos() {
        return minutos;
    }

    public void setMinutos(Unidaddetiempo minutos) {
        this.minutos = minutos;
    }

    public Unidaddetiempo getHoras() {
        return horas;
    }

    public void setHoras(Unidaddetiempo horas) {
        this.horas = horas;
    }
    
    
}
