/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposición;

import ico.fes.ficha.Autor;
import ico.fes.ficha.Editorial;
import ico.fes.libros.Libro;
/**
 *
 * @author Lawliet
 */
public class TareaComposición {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib= new Libro();
        lib.setTritulo("IT");
        lib.setIdioma("Ingles");
        lib.setAutor(new Autor (" Stephen King", " Estado Unidense", true));
        lib.setEditor(new Editorial(" ESO"," New York", 1986, 1504));
      System.out.println( lib);
        
        
        
        
        
        
    }
   
    
}
