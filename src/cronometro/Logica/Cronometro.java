/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro.Logica;

import java.util.HashSet;

/**
 *
 * @author Estudiantes
 */
public class Cronometro {
    private Unidaddetiempo decimas;
    private Unidaddetiempo segundos;
    private Unidaddetiempo minutos;
    private Unidaddetiempo horas;
    
    private ArrayList<Memoria>Memoria;

    public Cronometro (){
    
        decimas=new Unidaddetiempo (10);
        segundos=new Unidaddetiempo (60);
        minutos=new Unidaddetiempo (60);
        horas=new Unidaddetiempo (24);
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
    
    public void avanzar(){
        decimas.avanzar();
        if(decimas.getValor()==0){
            segundos.avanzar();
            if(segundos.getValor()==0){
                minutos.avanzar();
                if(minutos.getValor()==0){
                    horas.avanzar();
                }
            }
        }
        
    }
    
    public String obtenertiempo(){
        return horas.obtenerValorFormateado() + " : " +
               minutos.obtenerValorFormateado() + " : " +
               segundos.obtenerValorFormateado() + " : " +
               decimas.obtenerValorFormateado();
                   
    }
    public void guardarMemoria(){
        Memoria m = new Memoria();
        m.setDecimas(decimas);
        m.setSegundos(segundos);
        m.SetMinutos(minutos);
        m.setHoras(horas);
        System.out.println("Memoria : ");
        
        Memoria.add(m);
        
    }
    public void mostrarMemorias(){
        
        
    }
    }
