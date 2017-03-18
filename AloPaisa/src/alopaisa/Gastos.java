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
public class Gastos{
    
 /** La fecha se guardará en cada caso 
 // según sea necesario **/
  Calendar fecha = new GregorianCalendar();

/**
 Cada columna de la matriz histoingresos, dará la fecha
 * oredenada por hora, minuto, dia, mes y año
 **/

private int[][] HistoGastos= new int[100][6];

int j=0;



/**
 * El constructor del empleado va a pedir que 
 * se ingrese el nombre y el  numero de cedula 
 * y el rol que tendrá el mismo
 * */
/**
 * Este método registrará la fecha y el valor del gasto
 * */
public void ReportarGasto(int Costo){
    
 int año = fecha.get(Calendar.YEAR);
 int mes = fecha.get(Calendar.MONTH)+1;
 int dia = fecha.get(Calendar.DAY_OF_MONTH);
 int hora = fecha.get(Calendar.HOUR_OF_DAY);
 int minuto = fecha.get(Calendar.MINUTE);
 this.HistoGastos[j][0]=hora;
 this.HistoGastos[j][1]=minuto;
 this.HistoGastos[j][2]=dia;
 this.HistoGastos[j][3]=mes;
 this.HistoGastos[j][4]=año;
 this.HistoGastos[j][5]=Costo;
 
 this.j=j+1;
 
}

/**
 *Este metodo imprime el historial de gastos desde el origen de los tiempos hasta la fecha
 **/
public void ImprimirHistorial(){
int fila=this.j;
for(int k=0;k<=j-1;k++){  
    
 System.out.println("Se hizo el gasto a las " +this.HistoGastos[j-1][0]+" : "+
 this.HistoGastos[j-1][1]+ " del dia "+
 this.HistoGastos[j-1][2]+"  "+
 this.HistoGastos[j-1][3]+" "+
 this.HistoGastos[j-1][4]+" por un valor de:  "+
 this.HistoGastos[j-1][5]+" pesos"
 );

}
}

public void ReportarPago(Empleado empleado){
    
int año = fecha.get(Calendar.YEAR);
 int mes = fecha.get(Calendar.MONTH)+1;
 int dia = fecha.get(Calendar.DAY_OF_MONTH);
 int hora = fecha.get(Calendar.HOUR_OF_DAY);
 int minuto = fecha.get(Calendar.MINUTE);
 this.HistoGastos[j][0]=hora;
 this.HistoGastos[j][1]=minuto;
 this.HistoGastos[j][2]=dia;
 this.HistoGastos[j][3]=mes;
 this.HistoGastos[j][4]=año;
 this.HistoGastos[j][5]=empleado.getPago();
 
 this.j=j+1;
 
}
/**
 *Este metodo permite acceder al historial de ventas
 **/
public int[][] getHistoGastos(){
return this.getHistoGastos();
}
}
