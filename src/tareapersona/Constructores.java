/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapersona;

/**
 *
 * @author GALATEA
 */
public class Constructores {
    String Nombre;
    String Apellido;
    int DNI;
    
    public Constructores(){
        System.out.println("Buscando Información en la Base de Datos...");
    }
    
    public Constructores(int DNI){
        this();
       System.out.println("El DNI es: "+DNI);
    }
    
   public Constructores(int DNI,String Nombre){
       this();
       System.out.println("El DNI es: "+DNI+" y el nombre es "+ Nombre);
   }
   
   public Constructores(int DNI,String Nombre,String Apellido){
       this();
       System.out.println("El DNI es: "+DNI+", el nombre es "+Nombre+" y su apellido es "+Apellido);
   }
    
   public void IrDatos(int DNI,String Nombre,String Apellido){
       System.out.println("Los datos encontrados son: NOMBRE y APELLIDO = "+ Nombre +" "+Apellido+", DNI= "+DNI);
    }
    
}
