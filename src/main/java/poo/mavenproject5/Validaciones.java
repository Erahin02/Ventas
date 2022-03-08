package poo.mavenproject5;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author era
 */
public class Validaciones extends Exception{
    
    public Validaciones (String msg) {        
    super(msg);
}

   public static void validarNumeros(int valor, int valor2) throws Validaciones{
       if(valor<0 || valor2<0)
            throw new Validaciones("No se permiten valores negativos");        
    }
   
   public static void validarTexto(String msg) throws Validaciones{
       if(msg.isEmpty() || msg.isBlank())
            throw new Validaciones("debes introducir un dato");        
    }
   public static void validarTexto2(String msg) throws Validaciones{
       if(msg.equals("erahin"))
       {
           JOptionPane.showMessageDialog(null,"Sesión iniciada");
       }
       else
            throw new Validaciones("El usuario no existe");        
    }
}
