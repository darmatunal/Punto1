/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alopaisa;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *Esta clase permite registar ls gastos y las ventas
 * @author Dario Arango
 */
public class Cuentas {
/** La fecha se guardará en cada caso 
 // según sea necesario **/
    Calendar fecha = new GregorianCalendar();
    
/** La fecha se guardará en cada caso 
 // según sea necesario **/           
private int [][] Gastototal;
private int [][] Ventatotal;
private int[][] HistoBeneficio= new int[100][5];

int i=0;
public void IngresarVenta(Ventas venta){
 
this.Ventatotal= venta.getHistoVentas();


}
public void IngresarGasto(Gastos gasto){
    
this.Gastototal=gasto.getHistoGastos();


}
//** Periteclacular el benedicio para un hstiral de gasto y de ventas
//**registrados 
public int  CalcularBeneficio(){
int Beneficio=0;
for(int k=0;k<=10;k++){  

 Beneficio=Beneficio+ this.Ventatotal[k][5]-this.Gastototal[k][5];

}
return Beneficio;


}

}
