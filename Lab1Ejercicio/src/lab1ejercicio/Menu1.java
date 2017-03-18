package lab1ejercicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dario Arango
 */
public class Menu1 {
    private int eleccion;

public  void MostrarMenu(){
    System.out.println("Bienvenido a la Pizzeria PizzaBase"); 
    System.out.println("Por favor eliga:");
    
}
public  int ingresareleccion(){
    int w;
    System.out.println("1)Quiero Armar mi pizza    2)Quiero ver opciones");
    java.util.Scanner Leer=new java.util.Scanner(System.in);
    w=Leer.nextInt();
    this.eleccion=w;
    return eleccion;
}
    
}
