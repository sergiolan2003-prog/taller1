
package com.mycompany.taller1;

/**
 *
 * @author SergioLancheros
 */
public class Punto3D {
    private int x;
    private int y;
    private int z;
    
    public Punto3D(int x, int y, int z){
    this.x = x;
    this.y = y;
    this.z = z;
    }

    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

     public String Imprimir() {
        return "x = "+ x + "; y = " + y + "; z = " + z;
    }

    void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
