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
public class Black {

    
    public static void mostrar(VectorObjectos obj) {
        String datosVector="";
        for(int i=0;i<=obj.tamano-1;i++){
            datosVector=datosVector+String.valueOf("Nombre: "+obj.getVectorUsuarios(i).getNombre()
                    + " C.C: "+obj.getVectorUsuarios(i).getCedula()+ " telefono: "+obj.getVectorUsuarios(i).getTelefono()
                    + " Direcion: "+obj.getVectorUsuarios(i).getDireccion()+" Producto: "+obj.getVectorProductos(i).getProducto()
                    + " Saldo: "+obj.getVectorProductos(i).getSaldo()+"\n");
        }
        JOptionPane.showMessageDialog(null,"Elementos del vector objectos"+"\n"+datosVector);
    }
    
    public static int menu(){
       int opcion = 0;
       do{
           opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido"+"\n"
                   + "1. Registrar la información de los usuarios"+"\n"
                   + "2. Mostar informacion de los usuarios"+"\n"
                   + "3. Busqueda de saldo por nombre o identificación"+"\n"
                   + "4. Depositar o retirar"+"\n"
                   + "5. Salir"));
           
       }while(opcion<=0||opcion>5);
       return opcion;
    }
    public static void llenar(Usuarios est,Productos esv){
       
        String nom=JOptionPane.showInputDialog(null, "Ingrese su nombre.");
        est.nombre=nom;
        int cedu=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número de identificacion."));
        est.cedula=cedu;
        int tele=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número de teléfono."));
        est.telefono=tele;
        String direc=JOptionPane.showInputDialog(null, "Ingrese su dirección.");
        est.direccion=direc;
        
        String product=JOptionPane.showInputDialog(null,"¿Qué tipo de producto maneja?"+"\n"
                                                       + "Cuenta de ahorros, Préstamo o Cdt.");
        esv.producto=product;
        float sueldo=Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su saldo"));
        esv.saldo=sueldo;
    }
    public static void main(String[] args) {
        VectorObjectos obj=new VectorObjectos();
        Usuarios est; Productos esv;
        int opcion;
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                    obj.tamano=Integer.parseInt(JOptionPane.showInputDialog(null, "numero de elementos del vector"));
                    obj.CrearVector();
                    for(int i=0;i<=obj.tamano-1;i++){
                        est=new Usuarios();
                        esv=new Productos();
                        JOptionPane.showMessageDialog(null,"Elementos del vector"+"\n\n"+
                                "Ingresar la información del cliente");
                        llenar(est,esv);
                        obj.setVectorUsuarios(i, est);
                        obj.setVectorProductos(i, esv);
                    }
                    mostrar(obj);
                    break;
                case 2:
                    mostrar(obj);
                    break;
                case 3:
                    obj.Buscar();
                    break;
                    
                case 4:
                    
                     break;
                
                    
                case 5:
                    if(opcion==5){
                    break;
                    }
        }
    }while(opcion!=5);
  } 
}
