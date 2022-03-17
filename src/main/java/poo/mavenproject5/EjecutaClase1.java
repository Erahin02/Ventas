package poo.mavenproject5;

import javax.swing.*;

public class EjecutaClase1{   
    public static void main(String[] args){
        boolean bandera=true;
     do{
         
        try{
     int numero=Integer.parseInt(JOptionPane.showInputDialog("numero1"));     
     Validaciones.validarNumeros(numero);
     
     
     do{
         try{
         int numero2=Integer.parseInt(JOptionPane.showInputDialog("numero2"));
        Validaciones.validarNumeros(numero2);
        bandera=false;
         }
         catch(Validaciones e){
         JOptionPane.showMessageDialog(null,"Dato incorrecto en numero 2"+e.getMessage()+ " "+e.getClass());
     }
         catch(Exception e){
         JOptionPane.showMessageDialog(null,"Dato incorrecto en numero 2"+e.getMessage()+ " "+e.getClass());
     }
         //bandera=true;
     }
     while(bandera);
     
     bandera=true;
     
     String usuario=JOptionPane.showInputDialog("msg");
     Validaciones.validarTexto(usuario);
     Validaciones.validarTexto2(usuario);
     
     /*
     Clase1 objc1;
     objc1=null;
     objc1.ejemplo();
     */
     
     char sexo='x';
     sexo=JOptionPane.showInputDialog("introduce tu sexo").charAt(0);
     //Validaciones.validarSexo(sexo);
     Validaciones.validarCampoCaracater(sexo);
     
     
     
     }
    
        catch(Validaciones e){
         JOptionPane.showMessageDialog(null,e.getMessage()+ " "+e.getClass());
     }
        catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null,"EL campo está vacío o no es un valor "+e.getMessage()+ " "+e.getClass());
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"Debes introducir un valor"+e.getMessage()+ " "+e.getClass());
     }
        /*
     catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null,"no se permiten letras o vacío"+e.getCause());
     }
     catch(Exception e){
         JOptionPane.showMessageDialog(null,"burro "+e.getMessage());
     }*/
        
     }
     while(bandera);
     }
    
    /*
    public static void validar(int valor, int valor2) throws Exception{
       if(valor<0 || valor2<0)
            throw new Exception("No se permiten valores negativos");
        
        
    }*/
    
}

 
