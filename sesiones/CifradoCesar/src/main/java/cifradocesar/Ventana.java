/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lawliet
 */public class Ventana extends JFrame {

    private final JLabel resultado;
    private final JLabel etiqueta2;
    private final JLabel etiqueta;
    private final JButton boton;
    private final JTextField codificador;
    private final JTextField cuadroTexto;
    
    public Ventana() throws HeadlessException {
     this.setTitle("CIFRADO DE CESAR");
     this.setSize(500, 300);//tamaño ventana
          setLocation(500, 250);// posicion inicial
     this.setVisible(true);
     FlowLayout layout = new FlowLayout();
     this.setLayout(layout);
        cuadroTexto = new JTextField(20);
        codificador =new JTextField(20);
        boton =new JButton("Codificar");
        etiqueta =new JLabel("Ingrese el texo a codirficar");
        etiqueta2 =new JLabel("ingrese el numero de despasamiento");
        resultado =new JLabel(" El texto codificado es: ");
              
        this.getContentPane().add(etiqueta);
        this.getContentPane().add(cuadroTexto);    
        this.getContentPane().add(etiqueta2);    
        this.getContentPane().add(codificador);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        //this.pack();
        //this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {   
            System.exit(0);
          }
        
        });
        
   this.boton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
             String min= "abcdefghijklmnñopqrstuvwxyz";
             String fraseC;//string ddonde se almacenara la frase cifrada
             fraseC = "";
             String frase;//string que almacenen el texto de el usuario
             frase =cuadroTexto.getText();
             int desplazamiento = Integer.parseInt(codificador.getText());
             
             for (int i=0;i<frase.length(); i++){
                for (int j=0;j<min.length(); j++){
                    if(frase.charAt(i)==min.charAt(j)){
                        if(j+desplazamiento >=min.length()){
                        }
                        
                        else{
                        
                         fraseC +=min.charAt(j+desplazamiento);
                        }
                    }
                 
                }
                  
             }
             
             resultado.setText("Mensaje codificado es: "+ fraseC); //aqui se muestra el texto codificado
         } 
   });   
    }    
}
