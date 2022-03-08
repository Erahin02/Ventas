/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventasproductos;
import java.text.DecimalFormat;
/**
 *
 * @author era
 */
public class Ventas {
    private int cantidad;
    private double costo;
    private double subtotal;
    private double total;
    
    String concatenarImportes="";
    double cambio=0;
    double dinero=0;
    
    public Ventas(){
        cantidad=0;
        costo=0.0;
        subtotal=0.0;
        total=0.0;
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
        total+=subtotal;
    }
    
    
    public void concatenarValores(){
        concatenarImportes+="          "+cantidad+"***********"+formatoMoneda(costo)+"***********"+formatoMoneda(subtotal)+"\n";
    }
    
    public String toString(){        
        String datos="SISTEMA DE VENTAS MISEITVO";        
        datos+="\nNombre del cliente: "+Clientes.nombre+"\n CANTIDAD ***** COSTO ***** SUBTOTAL\n"+
                concatenarImportes+
                "\n Total Venta: "+formatoMoneda(total)+
                "\n Efectivo: "+dinero+
                "\n Cambio: "+cambio;
        return datos;
    }
    
    
    public double determinarCambio(double dinero){
        this.dinero=dinero;
        cambio=dinero-total;
        return cambio;
    }
    
    
    public String formatoMoneda(double valor){
        String valorConvertido;
        DecimalFormat df = new DecimalFormat("$,###.00");
       valorConvertido=df.format(valor);
       return valorConvertido;
    }
}
