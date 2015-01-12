package boletin.pkg15;

/**
 * Esta clase describe un tipo de personal de una seleccion, esta se encarga de describir
 * los Adiestradores y lo que estos hacen durante una seleccion, ya sea viajar, adiestrar, etc.
 * Esta clase hereda de la clase seleccion.
 * @author bhernandezsouto
 * @version 2.1
 */
public class Adestrador extends Seleccion {
    private String idFederacion;
    /**
     * Este constructor inicia todos los atributos que tiene la clase.
     * @param id
     * @param nombre
     * @param apellido
     * @param edad
     * @param idFederacion 
     */
    public Adestrador (int id, String nombre, String apellido, int edad, String idFederacion){
        super (id,nombre,apellido,edad);
        this.idFederacion=idFederacion;
    }
    /**
     * 
     * @return Este metodo devuelve el atributo idFederacion.
     */
    public String getIdFederacion() {
        return idFederacion;
    }
    /**
     * Recibe como parametro una variable de tipo String y la asigna al atributo idFederacion.
     * @param idFederacion 
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    /**
     * Es un metodo que hace una descripcion completa del objeto.
     * @return retorna todos los datos que tiene el objeto.
     */
    @Override
    public String toString(){
        return ( super.toString()+ " Id Federacion: " + idFederacion);
    }
    /**
     * indica que un adiestrador esta dirigiendo el partido.
     */
    public void dirigirPartido (){
        System.out.println("El adestrador " + super.getNombre() + " esta dirigiendo un partido" );
    }
    /**
     * indica que el entrenador esta dirigiendo un entrenamiento
     */
    public void dirigirEntrenamiento (){
        System.out.println("El adestrador " + super.getNombre() + " esta dirigiendo un Entrenamiento" );
    }
    /**
     * Este metodo indica que los adiestradores estan de viaje.
     */
    @Override
    public void viaxar (){
        System.out.println("viaxan os adestradores");
    }
}
