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
public class Menu3 {
    
    //La opción elegida tendrá asociada un costo 
    private float Opcionelegida;
    
    
    
    
    public float getcosto(){
    return this.Opcionelegida;

}

public void Mostraropciones(){
 
    System.out.println("Puede elegir entre los siguientes sabores: ");
    System.out.println("1) Queso, pollo, Champiñones");
    System.out.println("2) Queso, salami, piña");
    System.out.println("3) Jamon, almejas, queso");
    System.out.println("4) Pollo, almejas, champiñon");
    System.out.println("5) Queso, almejas, champiñon");
    System.out.println("6) Queso, salami, pollo,almejas");
    
}    
public void Elegiropcion(){
    // Se le pedirá al cliente que cada elija sus ingredientes
    //Las variables costo se actualizará cada vez que ingrese un ingrediente
    // dependiendo del valor del caracter que ingrese se actualizará el valor
    // del ingrediente.
    
    int w;
    // variable auxiliar para leer ingredientes
   
           // Se le pide ingresar el ingrediente
    System.out.println("Ingrese literal para ingrediente");
    java.util.Scanner Leer=new java.util.Scanner(System.in);
    w=Leer.nextInt();
    
    switch (w) {
        case 1:
        this.Opcionelegida=1000;
        break;
        case 2:  
        this.Opcionelegida=1200;
        break;
        case 3:
        this.Opcionelegida=1400;
        break;
        case 4:  
        this.Opcionelegida=1600;
        break;
        case 5:
        this.Opcionelegida=1800;
        break;
        case 6:
        this.Opcionelegida=2000;
        break;
        default:
       System.out.println("Ingrese de nuevo una letra");
        break;   }  
          
}
    
}
