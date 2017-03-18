/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alopaisa;
import java.util.*;
/**
 *
 * @author Dario Arango
 */

public class Necesidad {
    
 Calendar fecha = new GregorianCalendar();
//**  El objetivo es que se reporten las necesidades del negocio con el fin de saber cuales son las urgencias de corto plazo   
//*
        
private String Nombre;
//**  Determinar si es de urgencia alta, media o baja  
//*
private String Urgencia;
//**  Determinar el dia mes  para cumplirse 
//*
private int Dia;

private int mes;
//**  El estado determina si se cumplió o no  
//*
private String Estado;

/**
 Permite crear la necesidad que se deba agregar
 **/
public void NecesidadC(String Id, String Urgencialevel, int Day, int month, String state){
this.Nombre=Id;
this.Urgencia=Urgencialevel;
this.Dia=Day;
this.mes=month;
this.Estado=state;

}
/**
 Cambia el estado de la necesidad
 **/
public void Cumplir(){
this.Estado="Cumplida";
}
/**
 Indica el estado de la necesidad
 **/
public void Avisar(){
 int anno = fecha.get(Calendar.YEAR);
 int mmes = fecha.get(Calendar.MONTH)+1;
 int ddia = fecha.get(Calendar.DAY_OF_MONTH);
 int hora = fecha.get(Calendar.HOUR_OF_DAY);
 int minuto = fecha.get(Calendar.MINUTE);
    System.out.println("Ud tiene "+this.Estado+" su necesidad "+this.Nombre+" de Urgencia "+this.Urgencia );
 int Mfaltante,Dfaltante;
 /*Se calculan los meses y los días restantes para suplir la necesidad
 */
 if (this.Estado!="Cumplida"){
 Mfaltante=this.mes-mmes;
 Dfaltante=this.Dia-ddia;
 if (Mfaltante<0){
     if(Dfaltante>0){
     System.out.println("Le quedan "+Dfaltante+" dias ara  cumplirla");
     }
     else{
         System.out.println("Se le venció el plazo establecido");}
 }
 else{
 Dfaltante=Dfaltante+Mfaltante*30;
   System.out.println("Le quedan "+Dfaltante+" dias para  cumplirla");
 
 }

}
}

}
