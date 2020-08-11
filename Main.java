/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario_libros;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karasu
 */
public class Main {
    public static void main(String[] args) {
        
        Inventario_Libros inventario = new Inventario_Libros();

       
        Menu(inventario.lb, inventario);
    }
    
    public static void Menu(ArrayList<Libros> lb, Inventario_Libros inventario ){
        Scanner sc = new Scanner (System.in);
        System.out.println("\nMENU");
    System.out.println("1.Añadir datos del libros ");
    System.out.println("2.Vender libro");
    System.out.println("3.Consultar datos");
    System.out.println("4.Consultar libro mas caro");
    System.out.println("5.Salir");
    System.out.println("Elija opcion\n");
    
    int op=0;
    try{
      op=sc.nextInt();
    }catch(Exception e){
      System.out.println("ERROR, INGRESE NUEVAMENTE");
      Menu(inventario.lb, inventario);
    }
    switch(op){
      case 1:inventario.almacenarLibro();
      Menu(inventario.lb, inventario);
      case 2:inventario.venderLibro();Menu(inventario.lb, inventario);
      case 3:inventario.solicitarDatos();  Menu(inventario.lb, inventario);
      case 4:inventario.Precio(); Menu(inventario.lb, inventario);
      case 5: System.exit(0); 
    }
  }
    
    
}
