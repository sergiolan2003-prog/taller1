
package com.mycompany.taller1;

/**
 *
 * @author SergioLancheros
 */
public class Cuadrado {
    private Punto esquinaIzq;
    private int lado;

    public Cuadrado(Punto esquina, int lado) {
        this.esquinaIzq = esquina;
        this.lado = lado;
    }

    public void setEsquina(Punto esquina) {
        this.esquinaIzq = esquina;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public Punto getEsquina() {
        return esquinaIzq;
    }

    public int getLado() {
        return lado;
    }

    public String Imprimir(Punto esquina) {
        return "Esquina: "+ esquina.Imprimir() + "; Lado = " + lado;
    }

    void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
