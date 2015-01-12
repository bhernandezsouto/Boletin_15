/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg15;

/**
 * En esta clase se tienen todos los metodos y atributos que describen a cada tipo de 
 * personal de la seleccion, en esta se encuentran todos los datos en comun que tienen
 * los jugadores, adiestradores y masajistas.
 * @author bhernandezsouto
 */
public class Seleccion {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    
    /**
     *
     * @param id
     * @param nombre
     * @param apellido
     * @param edad
     */
    public Seleccion (int id, String nombre, String apellido, int edad){
        this.id=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica el valor de id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el valor del atributo nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Modifica el valor de el atributo apellido
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica el valor del atributo edad.
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return Retorna una descripcion general de un miembro de la seleccion
     */
    @Override
    public String toString(){
        return ("Id: " + id +" nombre: " + nombre + " apellido: " + apellido + " edad: " + edad);
    }
    
    /**
     * indica que la seleccion se esta concentrando
     */
    public void concentrarse (){
        System.out.println("concentrase a selección");
    }
    
    /** 
     * indica que la seleccion esta de viaje
     */
    public void viaxar (){
        System.out.println("viaxa a selección");
    }
}
