/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO2A;

/**
 *
 * @author era
 */
public class Ventas2 {
    private double precio;
    private int cantProd;
    private double subTotal;
    private double totalPago;
    
    String cadenaVentas="";
    
    public Ventas2(){
        precio=0.0;
        cantProd=0;
        subTotal=0.0;
        totalPago=0.0;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantProd() {
        return cantProd;
    }

    public void setCantProd(int cantProd) {
        this.cantProd = cantProd;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    public void calcularSubtotal(){
        subTotal=cantProd*precio;
    }
    public void calcularTotalPago(){
        totalPago+=subTotal;
    }
    
    public void concatenar(){
        cadenaVentas+=cantProd+"-------"+precio+"------"+subTotal+"\n";
    }
    
    public String toString(){
        String datos="";
        datos+="Micelanea ITVO\n"+
                "CANTIDAD ------COSTO-----SUBTOTAL\n"+cadenaVentas+
                "Total ventas: "+totalPago;
                return datos;
    }
}
