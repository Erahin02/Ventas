package poo.mavenproject5;

import javax.swing.*;

public class EjecutaClase1{   
    public static void main(String[] args){
        boolean bandera=true;
     do{
         
        try{
     int numero=Integer.parseInt(JOptionPane.showInputDialog("numero1"));
     
     int numero2=0;
     Validaciones.validarNumeros(numero, numero2);
     
     String usuario=JOptionPane.showInputDialog("msg");
     Validaciones.validarTexto(usuario);
     Validaciones.validarTexto2(usuario);
     
     Clase1 objc1;
     objc1=null;
     objc1.ejemplo();
     
         bandera=false;
     }
    
        catch(Validaciones e){
         JOptionPane.showMessageDialog(null,e.getMessage()+ " "+e.getClass());
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"Dato incorrecto"+e.getMessage()+ " "+e.getClass());
     }
        /*
     catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null,"no se permiten letras o vacío"+e.getCause());
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"burro "+e.getMessage());
     }*/
        
     }
     while(bandera==true);
     }
    
    /*
    public static void validar(int valor, int valor2) throws Exception{
       if(valor<0 || valor2<0)
            throw new Exception("No se permiten valores negativos");
        
        
    }*/
    
}

 
