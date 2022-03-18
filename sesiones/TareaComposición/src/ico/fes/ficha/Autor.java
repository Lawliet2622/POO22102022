/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ficha;

/**
 *
 * @author Lawliet
 */
public class Autor {
    String nombre;
    String nacionalidad;
    boolean vivo;

    public Autor() {
    }

    public Autor(String nombre, String nacionalidad, boolean vivo ) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.vivo = vivo;
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     *
     * @return
     */
    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", vivo=" + vivo + '}';
    }

   
    
    
    
}
