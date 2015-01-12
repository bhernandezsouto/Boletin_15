/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg15;

/**
 * Esta es la clase main donde se realiza la aplicacion.
 * @author bhernandezsouto
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Xogador xog = new Xogador (80,"Juan","Souto",22,5,"delantero");
        Adestrador ades = new Adestrador (80,"Maria","Perez",22,"Federacion... ");
        Masaxista mas = new Masaxista (80,"antonio","Souto",22,"titulacion",5);
        Seleccion xog1 = new Xogador(90,"pedro","Souto",22,5,"delantero");
        xog.concentrarse();
        ades.concentrarse();
        mas.concentrarse();
        xog.viaxar();
        ades.viaxar();
        mas.viaxar();
        
    }
    
}
