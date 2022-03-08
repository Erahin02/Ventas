/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PO2B;

import javax.swing.JOptionPane;

/**
 *
 * @author era
 */
public class EjecutaVentas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad;
        double precio;
        double total;
        
        Ventas3 objVenta=new Ventas3();
        
        int opcion=0;
        do{
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a comprar: "));
            precio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo del producto: "));
            objVenta.setCantidad(cantidad);
            objVenta.setCosto(precio);
            objVenta.calcularSubtotal();
            objVenta.calcularTotal();
            //cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a comprar: "));
        
            opcion=JOptionPane.showConfirmDialog(null,"Deseas realizar otra compra?");
            JOptionPane.showMessageDialog(null,opcion);
        }
        while(opcion==0);
        
        
        
        JOptionPane.showMessageDialog(null,objVenta.getTotal());
        
        
    }
    
}
