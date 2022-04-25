/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.PruebaEjemplos;

/**
 *
 * @author Lawliet
 */
public class PruebaEjemplo {
    
    public static void main(String[] args) {
        
        Cuentahambiente usuario1 = new Cuentahambiente("Clon", 19122018, 60000);
        Cuentahambiente usuario2 = new Cuentahambiente("Pana Miguel", 04022020, 30000);
        Cuentahambiente usuario3 = new Cuentahambiente("Felix", 03022020, 30000);
       
        System.out.println(usuario1);
        
      usuario1.retirarDinero(50000);
      
      
      System.out.println(usuario2);

      
       usuario2.retirarDinero(20000);
       
       
       System.out.println(usuario3);
       
       usuario3.retirarDinero(30000);
    
    
       System.out.println("--------------LISTA DEL  ARREGLO----------- ");
      
      Cuentahambiente[] lista =  new Cuentahambiente[5];
         
      lista[0] =new Cuentahambiente("Tobi", 5232132, 90000);
      
      lista[1] =new Cuentahambiente("YOKO", 12345432, 80000);
      lista[2] =new Cuentahambiente("Savitar", 87645673, 54000);
      lista[3] =new Cuentahambiente("Gula", 220822122, 78000);
      lista[4] =new Cuentahambiente("Misifus", 28221228, 92000);
      
      
        for (Cuentahambiente cuentahabiente : lista) {
            cuentahabiente.retirarDinero(70000);
        }
            
           
        }
    
}
