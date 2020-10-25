/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author Jhon
 */
public class Usuarios {
            int cedula;
            int telefono;
            String nombre;
            String direccion;
    public Usuarios(){
        cedula=0;
        telefono=0;
        nombre="";
        direccion="";
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int ced) {
        cedula = ced;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int tel) {
        telefono = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direc) {
        direccion = direc;
    }
    
}
