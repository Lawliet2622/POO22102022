/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizaciondecodigo;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.equipos.Computadora;
import ico.fes.herencia.Alumno;
import ico.fes.iu.MiVentana;

/**
 *
 * @author Lawliet
 */
public class ReutilizacionDeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   //     String facultad = new String("FES Aragón");
   //       char letra = facultad.charAt(4);
   //     System.out.println( letra );
        
       // MiVentana v1 = new MiVentana();
        Computadora compu= new Computadora();
        compu.setMarca("Asus");
        compu.setModelo("VivoBook 2");
        compu.setCpu( new Procesador("Intel", "i9", 5.0f) );
        Mouse raton =new Mouse();
        raton.setMarca("Logitech");
        compu.setRaton(raton);
        
        compu.getRaton().setModelo("G5400");
        compu.setPantalla(new Monitor("Samusg", "LED", 45f));
        compu.getPantalla().setMarca("LG"); //Cambio de marca
        System.out.println( compu );
        
        System.out.println("---- Herencia ------");
        Alumno alu1=new Alumno();
        alu1.setNombre(" Eric");
        alu1.setEdad( 18 );
        System.out.print(alu1); 
        
        Alumno alu2= new Alumno("319328635", " ING Computación", 2 , "BENIJU" , 19);
        System.out.print(alu2);
                
    }
    
}
