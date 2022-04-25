/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ico.fes.PruebaEjemplos;
/**
 *
 * @author Lawliet
 */
public class Cuentahambiente {

   private String NombreCliente;
    private int ide;
    private int balance;

    public Cuentahambiente() {
    }

    public Cuentahambiente(String NombreCliente, int ide, int balance) {
        this.NombreCliente = NombreCliente;
        this.ide = ide;
        this.balance = balance;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Cuentahambiente{" + "NombreCliente=" + NombreCliente + ", ide=" + ide + ", balance=" + balance + '}';
    }
    
   @SuppressWarnings("empty-statement")
    public void retirarDinero( float monto ){
          
          System.out.println("el balance totoal es de : " );
                 System.out.println(this.balance - 10000); ;
          if(balance < 50000){
              System.out.println("Cliente regular y el nombre del usuario es : " + this.NombreCliente);
          }else{
              System.out.println("Cliente PREMIUM, su Nombre es: "+ this.NombreCliente);
              
              
          }
         // System.out.println("el nombre del cliente premium es es  "+this.NombreCliente);
      
   
  }
  
    
}
