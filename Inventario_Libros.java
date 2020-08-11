/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario_libros;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karasu
 */
public class Inventario_Libros {
Scanner sc = new Scanner(System.in);
 ArrayList<Libros> lb = new ArrayList<>();
 
 
// public void librosAlmacenados(){
//     lb.add(new Libros(1, "Bloodborne", "Miyasaki", 25, 1));
//     lb.add(new Libros(2, "One Piece", " Eichiro Oda", 10, 5000));
//     lb.add(new Libros(3, "Harry Potter", "J. K. Rowling" , 20, 7));
//     lb.add(new Libros(4, "Bajo la misma estrella ", "John Green", 15, 5));
//     lb.add(new Libros(5, "Dark Souls", "Miyasaki", 25, 10));
//     lb.add(new Libros(6, "Karmaland", "Veguetta777", 17.7f , 7));
//     
//     
// }
 public void almacenarLibro(){
     Libros l= new Libros();
     try{
     Scanner sc = new Scanner (System.in); 
     System.out.println("Ingrese la siguiente informacion del libro:");
          System.out.println("Titulo: ");
          l.setTitulo(sc.nextLine());
          System.out.println("Autor: ");
          l.setAutor(sc.nextLine());
          System.out.println("Codigo: ");
          l.setCodigo(sc.nextInt());
          System.out.println("Cantidad");
          l.setCantidad(sc.nextInt());
          System.out.println("precio");
          l.setPrecio(sc.nextFloat());
     lb.add(l);
     }catch(Exception e){
         System.out.println("error no se registro");
     }
 
 }
 
 public void solicitarDatos(){
     
     try{
     Scanner sc = new Scanner (System.in); 
     System.out.println("Ingrese codigo :");
     int codigo=sc.nextInt();
     for (int i = 0; i < lb.size(); i++) {
         if(lb.get(i).getCodigo()== codigo){   
             System.out.println("Datos del libro : " + "\nTitulo " + lb.get(i).getTitulo() + "\nAutor "+ lb.get(i).getAutor() + "\nCantidad " + lb.get(i).getCantidad()+ "\nPrecio " + lb.get(i).getPrecio());
         }
     }
     }catch(Exception e){
         System.out.println("ERROR");
     }
 }
 
 public void actualizarInventario(){
     for (int i = 0; i < lb.size(); i++) {
         System.out.println("Datos del libro : " + "\nCodigo: "+lb.get(i).getCodigo()+"\nTitulo: " + lb.get(i).getTitulo() + "\nAutor: "+ lb.get(i).getAutor() + "\nCantidad: " + lb.get(i).getCantidad()+ "\nPrecio: " + lb.get(i).getPrecio());
         
     }
 }
 
 public void venderLibro(){
     try{
     System.out.println("Ingrese el codigo del libro que desea comprar: ");
     int codigo = sc.nextInt();
     for (int i = 0; i < lb.size(); i++) {
         if(lb.get(i).getCodigo()== codigo){   
             if(lb.get(i).getCantidad()==0){
                 System.out.println("El libro esta agotado");
            }else{
                 System.out.println("COMPRO EL LIBRO "+lb.get(i).getTitulo());    
                lb.get(i).setCantidad(lb.get(i).getCantidad()-1);
         }
         
                  
         }
     }
     }catch(Exception e){
                   System.out.println("ingrese datos");
     }
 }
 
 public void Precio(){
      try{
        Libros aux;
        
        for (int i=0; i<lb.size();i++)
        {
            for (int j=0; j<lb.size(); j++)
            {
                if(lb.get(i).getPrecio()>lb.get(j).getPrecio())
                {
                    aux=lb.get(i);
                    lb.set(i,lb.get(j)) ;
                    lb.set(j, aux);
                }
            }
        } 
        
        for (int i=0; i<3;i++)
        {
            System.out.print(lb.get(i).getTitulo()+"  "+"\t");
            
        }
      }catch(Exception e){
          System.out.println("ingrese datos");
      }     
   
    
 
 
    
 }
}
