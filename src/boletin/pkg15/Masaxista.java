/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg15;

/**
 * Esta clase describe un tipo de personal de una seleccion, esta se encarga de describir
 * los Masagistas y lo que estos hacen durante una seleccion, ya sea viajar, etc.
 * Esta clase hereda de la clase seleccion.
 * @author bhernandezsouto
 * @version 2.1
 */
public class Masaxista extends Seleccion{
    private String titulacion;
    private int añosExperiencia;
    
    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param edad
     * @param titulacion
     * @param añosExperiencia
     */
    public Masaxista (int id, String nombre, String apellido, int edad, String titulacion, int añosExperiencia){
        super (id,nombre,apellido,edad);
        this.titulacion=titulacion;
        this.añosExperiencia=añosExperiencia;
    }
    /**
     * Es un metodo que hace una descripcion completa del objeto.
     * @return retorna todos los datos que tiene el objeto.
     */
    @Override
    public String toString(){
        return ( super.toString()+ " Titulacion: " + titulacion + " Años de Experiencia: " + añosExperiencia);
    }
    
    /**
     * Indica que el masajista esta dando un masaje.
     */
    public void darMasaxes (){
        System.out.println("El masajista " + super.getNombre() +" esta dando un masaje");
    }

    /**
     * Indica que los masajistas estan de viaje.
     */
    @Override
    public void viaxar (){
        System.out.println("viaxan os masaxista");
    }
}

