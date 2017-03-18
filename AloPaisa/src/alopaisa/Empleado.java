/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alopaisa;
import java.util.*;
/**
 *La clase permite definir un empleado
 * @author Dario Arango
 */
public class Empleado {
  
 /** La fecha se guardará en cada caso 
 // según sea necesario **/
  Calendar fecha = new GregorianCalendar();
     
       
private String Nombre;
private String Rol;
private int Documento;
private int Pago;
/**
 Cada columna de la matriz histoingresos, dará la fecha
 * oredenada por hora, minuto, dia, mes y año
 **/
private int[][] HistoIngresos= new int[100][5];
private int[][] HistoSalidas= new int[100][5];
private int[][] HistoTotal= new int[100][7];

int j=0;
int i=0;


/**
 * El constructor del empleado va a pedir que 
 * se ingrese el nombre y el  numero de cedula 
 * y el rol que tendrá el mismo
 * */

public void CrearEmpleado(String Name, String Role,int CC){
    
this.Nombre=Name;
this.Documento=CC;
this.Rol=Role;

}
/**
 * Este método registrará la hora de ingreso del empleado
 * */
public void Ingreso(){
    
 int año = fecha.get(Calendar.YEAR);
 int mes = fecha.get(Calendar.MONTH)+1;
 int dia = fecha.get(Calendar.DAY_OF_MONTH);
 int hora = fecha.get(Calendar.HOUR_OF_DAY);
 int minuto = fecha.get(Calendar.MINUTE);
 this.HistoIngresos[i][0]=hora;
 this.HistoIngresos[i][1]=minuto;
 this.HistoIngresos[i][2]=dia;
 this.HistoIngresos[i][3]=mes;
 this.HistoIngresos[i][4]=año;
 this.i=i+1;
 
}
/**
 * Este método registrará la hora de salida del empleado
 * */
public void Salida(){
    
 int año = fecha.get(Calendar.YEAR);
 int mes = fecha.get(Calendar.MONTH)+1;
 int dia = fecha.get(Calendar.DAY_OF_MONTH);
 int hora = fecha.get(Calendar.HOUR_OF_DAY);
 int minuto = fecha.get(Calendar.MINUTE);
 this.HistoSalidas[j][0]=hora;
 this.HistoSalidas[j][1]=minuto;
 this.HistoSalidas[j][2]=dia;
 this.HistoSalidas[j][3]=mes;
 this.HistoSalidas[j][4]=año;
  
 this.HistoTotal[j][0]=this.HistoIngresos[i-1][0];
 this.HistoTotal[j][1]= this.HistoIngresos[i-1][1];
 this.HistoTotal[j][2]=hora;
 this.HistoTotal[j][3]=minuto;
 this.HistoTotal[j][4]=dia;
 this.HistoTotal[j][5]=mes;
 this.HistoTotal[j][6]=año;
 this.j=j+1;
 
}
/**
 *Este metodo imprime el historial de ingresos desde el origen de los tiempos hasta la fecha
 **/
public void ImprimirHistorial(){
int fila=this.j;
for(int k=0;k<=j-1;k++){  
    
 System.out.println("Entro a las " +this.HistoTotal[j-1][0]+" : "+
 this.HistoTotal[j-1][1]+ " y salio a las  "+
 this.HistoTotal[j-1][2]+" : "+
 this.HistoTotal[j-1][3]+" el dia "+
 this.HistoTotal[j-1][4]+" "+
 this.HistoTotal[j-1][5]+" "+
 this.HistoTotal[j-1][6]);

}
}
public void Pagar(int pago){
this.Pago=pago;
}
 /**Este metodo permite encontrar el pago
 **/
public int[][] getHistoVentas(){
return this.HistoIngresos;
}
public int getPago(){
return this.Pago;

}
public static void main(String [] args){
    // Se ingresaempleado
    Empleado Dario=new Empleado();
    Dario.CrearEmpleado("Dario Mateo Arango","Chef", 1015433946);
    //Se registran horas de entrada y de salida
    Dario.Ingreso();
    Dario.Salida();
    Dario.Ingreso();
    Dario.Salida();
    Dario.Ingreso();
    Dario.Salida();
    Dario.Ingreso();
    Dario.Salida();
    Dario.ImprimirHistorial();
    // Se crea la variable impuesto
    Gastos Impuestos=new Gastos();
    Impuestos.ReportarGasto(31500);
    Impuestos.ImprimirHistorial();
    Gastos Carne=new Gastos();
    Carne.ReportarGasto(100000);
    Carne.ReportarGasto(130000);
    Carne.ImprimirHistorial();
    // se crea una nnecesidad
    Necesidad Verdura=new Necesidad();
    Verdura.NecesidadC("Comprarverdura","Media",28,8,"Sin cumplir");
    Verdura.Avisar();
    Verdura.Cumplir();
    Verdura.Avisar();
    // iNGRESA VENTA
    Ventas venta1=new Ventas();
    venta1.ReportarVenta(10000);
    //se estima beneficio para algunas ventas y gastos
    
    
    
}
}
