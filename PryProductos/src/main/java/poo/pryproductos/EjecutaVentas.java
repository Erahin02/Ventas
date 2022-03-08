/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.pryproductos;
import javax.swing.*;
/**
 *
 * @author era
 */
public class EjecutaVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double costo;
        int cantidad;
        double totalPago;
        
        Ventas objVenta1=new Ventas();
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad del producto a comprar"));
            
        do{
            costo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo del producto: "));
            objVenta1.setCantidad(cantidad);
            objVenta1.setCosto(costo);
            objVenta1.calcularSubtotal();
            objVenta1.calcularTotalPago();
            objVenta1.guardarDatosTicket();
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad del producto a comprar"));
            
        }
        while(cantidad!=-1);
        
        JOptionPane.showMessageDialog(null,objVenta1.toString());
    }
    
}
