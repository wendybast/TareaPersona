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
public class TareaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Constructores Pa,Pb,Pc,Pd;
        
        
        Pa = new Constructores(30981244);
        Pa.DNI=30981244;
        Pa.Nombre="Jack";
        Pa.Apellido="Sparrow";
       
        Pb = new Constructores(20114633,"Viktor");
        Pb.DNI=20114633;
        Pb.Nombre="Viktor";
        Pb.Apellido="Krum";
              
        Pc = new Constructores(40229711,"Axel","Bastidas");
        Pc.DNI=40229711;
        Pc.Nombre="Axel";
        Pc.Apellido="Bastidas";
        
        Pd = new Constructores(36001341,"Wendy Moira Angela","Darling");
        Pd.DNI=36001341;
        Pd.Nombre="Wendy Moira Angela";
        Pd.Apellido="Darling";
       
        Pd.IrDatos(Pd.DNI,Pd.Nombre,Pd.Apellido);
        Pa.IrDatos(Pa.DNI,Pa.Nombre,Pa.Apellido);
        Pb.IrDatos(Pb.DNI,Pb.Nombre,Pb.Apellido);
        Pc.IrDatos(Pc.DNI,Pc.Nombre,Pc.Apellido);
       
        
        
    }
    
}
