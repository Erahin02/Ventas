/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventasproductos;

import javax.swing.JOptionPane;

/**
 *
 * @author era
 */
public class CorteCaja {
    private double importeVenta;
    private double corte;
    
    int contador=0;
    String ventasTotales="";

    public CorteCaja() {
        importeVenta=0.0;
        corte=0.0;
    }

    public double getImporteVenta() {
        return importeVenta;
    }

    public void setImporteVenta(double importeVenta) {
        this.importeVenta = importeVenta;
    }

    public double getCorte() {
        return corte;
    }

    public void setCorte(double corte) {
        this.corte = corte;
    }
    
     public void ConcatenarVentasTotales(){
        contador++;
        ventasTotales+="Venta "+contador+"  "+importeVenta+"\n";  
        //JOptionPane.showMessageDialog(null,ventasTotales);
    }
    
     public void calcularIngreso(){
         corte+=importeVenta;
     }
    
    public String corteCaja(){
        String corteCaja="Ventas del dia: \n"+
                ventasTotales+"\n"+"ingresos del día: "+corte;
        return corteCaja;
    }
}
