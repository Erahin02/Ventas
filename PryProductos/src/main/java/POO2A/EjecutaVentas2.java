/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO2A;

import javax.swing.JOptionPane;

/**
 *
 * @author era
 */
public class EjecutaVentas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio;
        int cantidad;
        double total;
        
        Ventas2 objVenta=new Ventas2();
        cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a comprar: "));
       
        do{
            precio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto: "));
            objVenta.setCantProd(cantidad);
            objVenta.setPrecio(precio);
            objVenta.calcularSubtotal();
            objVenta.calcularTotalPago();
            objVenta.concatenar();
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a comprar: "));
        }
        while(cantidad>0);
        
         JOptionPane.showMessageDialog(null,objVenta);
            
        
        
    }
    
}
