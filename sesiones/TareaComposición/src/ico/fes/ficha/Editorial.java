/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ficha;

/**
 *
 * @author Lawliet
 */
public class Editorial {
    String titulo;
    String ciudad;
    int añopublicacion;
    int nopaguinas;

    public Editorial() {
    }

    public Editorial(String titulo, String ciudad, int añopublicacion, int nopaguinas) {
        this.titulo = titulo;
        this.ciudad = ciudad;
        this.añopublicacion = añopublicacion;
        this.nopaguinas = nopaguinas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAñopublicacion() {
        return añopublicacion;
    }

    public void setAñopublicacion(int añopublicacion) {
        this.añopublicacion = añopublicacion;
    }

    public int getNopaguinas() {
        return nopaguinas;
    }

    public void setNopaguinas(int nopaguinas) {
        this.nopaguinas = nopaguinas;
    }

    @Override
    public String toString() {
        return "Editorial{" + "titulo=" + titulo + ", ciudad=" + ciudad + ", a\u00f1opublicacion=" + añopublicacion + ", nopaguinas=" + nopaguinas + '}';
    }
    
    
}
