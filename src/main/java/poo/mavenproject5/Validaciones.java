package poo.mavenproject5;
import javax.swing.JOptionPane;

public class Validaciones extends Exception{
    public Validaciones (String msg) {        
    super(msg);
}    
   public static void validarNumeros(int valor) throws Exception{
       if(valor<0)
            throw new Validaciones("No se permiten valores negativos");
       else
       {  String cant=Integer.toString(valor);
           if(cant.length()!=5){
               throw new Validaciones("introduce 5 dígitos");
           }    
       }
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
   public static void validarSexo(char s) throws Validaciones{  
       char sexo=Character.toUpperCase(s);
       if (Character.compare(sexo, 'M')==0 || Character.compare(sexo, 'H')==0){   
       }
       else
          throw new Validaciones("Introduce M o F");                 
   }
   public static void validarCampoCaracater(char s) throws Validaciones{       
       if(Character.isSpaceChar(s) || Character.isDigit(s))  {
           throw new Validaciones("Introducir la inicial de tu sexo H o M ");   
       }
   }
}