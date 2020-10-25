/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class VectorObjectos {
   int tamano;
    Usuarios VectorUsuarios[];
    Productos VectorProductos[];
    public VectorObjectos(){
        VectorUsuarios=null;
        VectorProductos=null;
        tamano=0;
        
    }
    public void CrearVector(){
        VectorUsuarios=new Usuarios[tamano];
        VectorProductos=new Productos[tamano];
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        tamano = tamano;
    }
    
    public void setVectorUsuarios(int p, Usuarios ve){
        VectorUsuarios[p]=ve;
    }
    public Usuarios getVectorUsuarios(int p){
        return VectorUsuarios[p];
    }
    
     public void setVectorProductos(int p, Productos ob){
        VectorProductos[p]=ob;
    }
    public Productos getVectorProductos(int p){
        return VectorProductos[p];
    }
    public void Buscar(){
        int busqueda1=0;
        String busqueda2="";
        String Selec="";
        
        Object TipSelec[]=new Object[]{
            "Identificación", "Nombre"
        };
        Object selecc=JOptionPane.showInputDialog(null, "Seleccione la opción que desea","Seleccionar opción",
                          JOptionPane.QUESTION_MESSAGE,null,TipSelec, TipSelec[0]);
        
        Selec=selecc.toString();
        
        if(Selec.equals("Identificación")){
            busqueda1=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número de identificación del cliente"));
        }
        else
            if(Selec.equals("Nombre")){
                busqueda2=JOptionPane.showInputDialog(null,"Ingrese el nombre del cliente");
            }
        for(int i=0;i<=getTamano()-1;i++){
            if(getVectorUsuarios(i).getCedula()==busqueda1){
                JOptionPane.showInputDialog(null,"El saldo del cliente es: "+getVectorProductos(i).getSaldo());
            }
            else
                if(getVectorUsuarios(i).getNombre()==busqueda2){
                   JOptionPane.showInputDialog(null,"El saldo del cliente es: "+getVectorProductos(i).getSaldo());
                }
        }
    }
}
