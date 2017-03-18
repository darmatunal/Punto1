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
public class Menu2 {

    private float CostoQueso;
    private float Costochampi;
    private float Costosalami;
    private float Costopollo;
    private float Costopiña;
    private float Costojamon;
    private float Costoalmejas;
    private float Costotal;
public void Mostraropciones(){
 
    System.out.println("Puede elegir entre los siguientes sabores: ");
    System.out.println("1) Queso");
    System.out.println("2) Champiñon");
    System.out.println("3) Salami");
    System.out.println("4) Jamóm");
    System.out.println("5) Almejas");
    System.out.println("6) Pollo");
    
}    
public void AgregarIngrediente(){
    // Se le pedirá al cliente que cada elija sus ingredientes
    //Las variables costo se actualizará cada vez que ingrese un ingrediente
    // dependiendo del valor del caracter que ingrese se actualizará el valor
    // del ingrediente.
    float costo;
    int w;
    // variable auxiliar para leer ingredientes
    int i=1;
    while(i==1){   
        
    
    // Se le pide ingresar el ingrediente
    System.out.println("Ingrese literal para ingrediente");
    java.util.Scanner Leer=new java.util.Scanner(System.in);
    w=Leer.nextInt();
    System.out.println("Ingrese cantidad en pesos que quiere");
    costo=Leer.nextFloat();
    switch (w) {
        case 1:
        this.CostoQueso=costo;
        break;
        case 2:  
        this.Costochampi=costo;
        break;
        case 3:
        this.Costosalami=costo;
        break;
        case 4:  
        this.Costojamon=costo;
        break;
        case 5:
        this.Costoalmejas=costo;
        break;
        case 6:
        this.Costopollo=costo;
        break;
        default:
       System.out.println("Ingrese de nuevo una letra");
        break;   }
    System.out.println("¿Quiere ingresar otro ingrediente? Si=1 NO=0");
    i=Leer.nextInt();
    }    
          
}
public float getCosto(){
Costotal= CostoQueso+Costochampi+Costosalami+Costopollo+ Costopiña+Costojamon+Costoalmejas;

return Costotal;
}
}
