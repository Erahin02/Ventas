/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventasproductos;
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
        // TODO code application logic here
        int cantidad;
        double costo;
        double totalCompra;
        String nombre;
        int opc;
        int opcCliente;
        
        do{
            
            Ventas objVenta=new Ventas();
            nombre=JOptionPane.showInputDialog("Introduce el nombre del Cliente");
            Clientes.setNombre(nombre);
       // Clientes objCliente=new Clientes();
        
        do{            
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad del prodcuto a comprar:"));
            costo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el costo del producto: "));   
            objVenta.setCantidad(cantidad);
            objVenta.setCosto(costo);
            objVenta.calcularSubtotal();
            objVenta.calcularTotal();            
            objVenta.concatenarValores();            
            opc=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra compra?");
            //0 si    1 no    2 cancelar
        }
        while(opc==0);
        
        
        
        
        
        JOptionPane.showMessageDialog(null,objVenta.toString());
        opcCliente=JOptionPane.showConfirmDialog(null,"¿Deseas Vender a otro cliente?");
        //aqui preguntar
        }
        while(opcCliente==0);
        
       
    }
    
    
}
