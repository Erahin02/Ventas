/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventasproductos;

/**
 *
 * @author era
 */
public class Clientes {
    protected static String nombre;
    
    /*
    public Clientes(){
        nombre="";
    }
    */
    public static void setNombre(String nom){
        nombre=nom;   
    }
    
    public static String getNombre(){
            return nombre;
        }
    
}
