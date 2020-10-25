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
public class Productos {
    String producto;
     float saldo;
    
    public Productos(){
        producto="";
        saldo=0;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String product) {
        producto = product;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float sald) {
        saldo = sald;
    }
    
    
}
