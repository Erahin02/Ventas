/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PO2B;

/**
 *
 * @author era
 */
public class Ventas3 {
    private int cantidad;
    private double costo;
    private double subtotal;
    private double total;
    
    public Ventas3(){
        cantidad=0;
        costo=0.0;
        subtotal=0.0;
        total=0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void calcularSubtotal(){
        subtotal=cantidad*costo;
    }
    
    public void calcularTotal(){
        //total=total+subtotal;
        total+=subtotal;
    }
    
}
