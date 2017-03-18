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
public class Indicador {

private String Ordentomada="no";
private String Pizzaarmandose="no";
private String Pizzaenhorno="no";
private String Prepareseparacomer="no";

public void MostrarEstado(){

    System.out.println("Orden tomada: "+Ordentomada);   
    System.out.println("Pizza armandose: "+Pizzaarmandose); 
    System.out.println("Pizza en horno: "+Pizzaenhorno); 
    System.out.println("Preparese para comer: "+Prepareseparacomer);   
}
public void TomarOrden(){
this.Ordentomada="si";
MostrarEstado();
}
public void ArmarPizza(){
this.Pizzaarmandose="si";
MostrarEstado();
}
public void Meteralhorno(){
this.Pizzaenhorno="si";
MostrarEstado();
}
public void Prepararse(){
this.Prepareseparacomer="si";
MostrarEstado();
}


}