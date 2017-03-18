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
public class Menu4 {
// Variables propias de la clase
private int Corteza;    
private int Bebida;    
private int Tamaño;    
private float CostoTotalpizza;
private float costoTotal;
private float cbebida;
// Variables de las otras clases
Menu1 PASO1=new Menu1();
Menu2 PASO2a=new Menu2();
Menu3 PASO2b=new Menu3();


public void Llegada(){
    PASO1.MostrarMenu();
    int e=PASO1.ingresareleccion();
    if (e==1){
    PASO2a.Mostraropciones();
    PASO2a.AgregarIngrediente();
    this.CostoTotalpizza=PASO2a.getCosto();
    }
    else{
    PASO2b.Mostraropciones();
    PASO2b.Elegiropcion();
    this.CostoTotalpizza=PASO2b.getcosto();
    }
}


public void ElegirCorteza(){
System.out.println("Elija Corteza: ");
System.out.println("1)Delgada y crujiente");
System.out.println("2) Gruesa");
java.util.Scanner Leer=new java.util.Scanner(System.in);
this.Corteza=Leer.nextInt();
}
public void ElegirBebida(){
System.out.println("Elija Bebida: ");
System.out.println("1)Coca cola");
System.out.println("2) Limonada");
System.out.println("3) Ninguna");

java.util.Scanner Leer=new java.util.Scanner(System.in);
this.Bebida=Leer.nextInt();
this.cbebida=30;

}
public void ElegirTamaño(){
System.out.println("Elija Tamaño: ");
System.out.println("1)Grande");
System.out.println("2)Mediano");
System.out.println("3)Pequeño");

java.util.Scanner Leer=new java.util.Scanner(System.in);
this.Tamaño=Leer.nextInt();
}
public void Darcosto(){
    this.costoTotal=this.CostoTotalpizza*(Tamaño+1)+this.cbebida;
    System.out.println("El valor de su cuenta es:  " +costoTotal);
}

public static void main(String [] args){

 Menu4 Menus=new Menu4();
 Menus.Llegada();
 Menus.ElegirCorteza();
 Menus.ElegirBebida();
 Menus.ElegirTamaño();
 Menus.Darcosto();
 Indicador pasoFinal=new Indicador();
 pasoFinal.MostrarEstado();
 pasoFinal.TomarOrden();
 pasoFinal.Meteralhorno();
 pasoFinal.Prepararse();
 
}

}
