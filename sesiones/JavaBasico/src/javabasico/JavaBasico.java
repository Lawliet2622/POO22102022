/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico;

/**
 *
 * @author Lawliet
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
   int edad=22;
   Integer edad2 = new Integer(2);
   float x = edad2.floatValue();
    System.out.println(x);
    String dias = "23";
    System.out.println((dias +3));
    int temp = Integer.parseInt(dias);
    System.out.println("Dias = " + (temp +3));
    
   
           
    System.out.println("-------");
    edad = 15;
    res = (edad >= 18)?"Mayor de edad":"Menor de edad";
    System.out.println("Eres : " + res );
    
    int  val1 = 1;
        int  val2 = 2;
        System.out.println( val1 | val2);
        /*
        val1 = 000...0001
        val2 = 000...0010
     ----------------------
               000...0010   // 2 decimal

// desplazamiento a nivel bits  */
        int val3 = 1;
        int val4 = val3<<1;
        
        System.out.println(val4);
        val4 = val4<<1;
        System.out.println(val4);
        
        System.ouy.println("--- arreglos ---");
        
        int [] edades; //aqui solo se declara
        int [] edades2 = new int[5];
        int [] edades3 = {22,21,28,19,18};
        
        edades2[0]=33;
        System.out.println( edades2[0] ); //33
        System.out.println( edades2[1] ); //0
        
        // Ahora imprimimos las edades 3 
        System.out.println("Edades 3 a mano");
         System.out.println( edades3[0] );
         System.out.println( edades3[1] );
         System.out.println( edades3[2] );
         System.out.println( edades3[3] );
         System.out.println( edades3[4] );
         
         //ahora lo combinamos con FOR
         System.out.println("Automatizado");
         for (int i = 0; i < edades2.length; i++) {
              System.out.println(edades3[i]);
         }
// Orden inverso 
         System.out.println("-----------------");
         for (int j=4; j >= 0; j = j -1) {
             System.out.println(edades3[i]);
         }
        System.out.println("orden inverso ");
        for (int i = edades3.length-1; i >= 0; i--) {
            System.out.println(edades3[i]);
        }
        
        System.out.println("eades a 18");
        for (int i = 0; i < edades3.length; i++) {
            edades3[i] = edades3[2];
            System.out.println(edades3[i]);
        } 

 //for Each es simplificar la forma de recorrer arreglos

        System.out.println("con for each");
        for (int ed : edades3) {
           System.out.println( ed );
    }
    // lo comparamos VS el original 
    System.out.println("Automatizado");
    for (int i = 0; i < edades3.length; i++) {
        System.out.println(edades3[i]);
    }
    
    
    System.out.println("Arreglo de la clase perro");
    
    }
    
    
}
