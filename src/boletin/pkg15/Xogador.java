/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg15;

/**
 *Esta clase describe un tipo de personal de una seleccion, esta se encarga de describir
 * los Jugadores y lo que estos hacen durante una seleccion, ya sea viajar, entrenar, etc.
 * Esta clase hereda de la clase seleccion.
 * @author bhernandezsouto
 */
public class Xogador extends Seleccion {
    private int dorsal;
    private String demarcacion;
    
    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param edad
     * @param dorsal
     * @param demarcacion
     */
    public Xogador (int id, String nombre,String apellido,int edad, int dorsal, String demarcacion){
        super (id,nombre,apellido,edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    /**
     *
     * @return dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Modifica el valor del atributo dorsal
     * @param dorsal
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
     *
     * @return demarcacion
     */
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
     * Modifica el valor de el atributo demarcacion
     * @param demarcacion
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    /**
     * Indica que el jugador esta jugando un partido
     */
    public void jugarPartido (){
        System.out.println("El "+ super.getNombre() + " esta jugando un partido");
    }

    /** 
     * indica que el jugador esta entrenando
     */
    public void entrenar (){
        System.out.println("El " + super.getNombre() + " esta entrenando");
    }
    /**
     * 
     * @return Retorna una descripcion con todos los datos del jugador
     */
    @Override
    public String toString(){
        return ( super.toString()+ " Dorsal: " + dorsal + " Demarcacion: " + demarcacion);
    }

    /**
     * indica que los jugadores estan de viaje.
     */
    @Override
    public void viaxar (){
        System.out.println("viaxan os xogadores");
    }
}
