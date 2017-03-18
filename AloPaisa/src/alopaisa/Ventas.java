/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alopaisa;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Dario Arango
 */
public class Ventas {
    
    /** La fecha se guardará en cada caso 
 // según sea necesario **/
  Calendar fecha = new GregorianCalendar();

/**
 Cada columna de la matriz histoingresos, dará la fecha
 * oredenada por hora, minuto, dia, mes y año
 **/

private int[][] HistoVentas= new int[100][7];
/**
 * 
 **/


int j=0;
int numcuenta=0;


/**
 * El constructor del empleado va a pedir que 
 * se ingrese el nombre y el  numero de cedula 
 * y el rol que tendrá el mismo
 * */
/**
 * Este método registrará la fecha y el valor de la venta y un numero de venta
 * */
public void ReportarVenta(int Costo){
    
 int año = fecha.get(Calendar.YEAR);
 int mes = fecha.get(Calendar.MONTH)+1;
 int dia = fecha.get(Calendar.DAY_OF_MONTH);
 int hora = fecha.get(Calendar.HOUR_OF_DAY);
 int minuto = fecha.get(Calendar.MINUTE);
 this.HistoVentas[j][0]=hora;
 this.HistoVentas[j][1]=minuto;
 this.HistoVentas[j][2]=dia;
 this.HistoVentas[j][3]=mes;
 this.HistoVentas[j][4]=año;
 this.HistoVentas[j][5]=Costo;
  this.HistoVentas[j][6]=numcuenta;
  numcuenta=numcuenta+1;
  
 
 this.j=j+1;
 
}
/**
 *Este metodo permite acceder al historial de ventas
 **/
public int[][] getHistoVentas(){
return this.HistoVentas;
}

/**
 *Este metodo imprime el historial de venta desde el origen de los tiempos hasta la fecha
 **/
public void ImprimirHistorial(){
int fila=this.j;
for(int k=0;k<=j-1;k++){  
    
 System.out.println("Se hizo venta a las " +this.HistoVentas[j-1][0]+" : "+
 this.HistoVentas[j-1][1]+ " del dia "+
 this.HistoVentas[j-1][2]+"  "+
 this.HistoVentas[j-1][3]+" "+
 this.HistoVentas[j-1][4]+" por un valor de:  "+
 this.HistoVentas[j-1][5]+" pesos al numero de cuenta"+
 this.HistoVentas[j-1][6]        
 );

}
}
    
}
