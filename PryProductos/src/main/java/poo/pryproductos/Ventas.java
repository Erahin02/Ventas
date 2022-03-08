/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pryproductos;

/**
 *
 * @author era
 */
public class Ventas {
    private double costo;
    private int cantidad;
    private double subtotal;
    private double totalPago;
    
    String ticket="Datos de la compra: \n cantidad ----------$ costo -------Subtotal\n";
    
    public Ventas(){
        costo=0.0;
        cantidad=0;
        subtotal=0.0;
        totalPago=0.0;
        
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }
    
    public void calcularSubtotal(){
        subtotal=cantidad*costo;
    }
    
    public void calcularTotalPago(){
        totalPago+=subtotal;
    }
    
    public void guardarDatosTicket(){
        ticket+="               "+cantidad+"----------"+costo+"-----------"+subtotal+"\n";    
    }
    @Override
    public String toString(){  
        ticket+="\n total: "+totalPago;
        return ticket;
    }
}
