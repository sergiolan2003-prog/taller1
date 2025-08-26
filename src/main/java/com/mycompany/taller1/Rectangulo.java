
package com.mycompany.taller1;

/**
 *
 * @author SergioLancheros
 */
public class Rectangulo {
    private Punto esquinaIzq;
    private int lado1;
    private int lado2;

    public Rectangulo(Punto esquina, int lado1, int lado2) {
        this.esquinaIzq = esquina;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void setEsquina(Punto esquina) {
        this.esquinaIzq = esquina;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    
    public Punto getEsquina() {
        return esquinaIzq;
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public String Imprimir(Punto esquina,Punto punto2) {
        return "Esquina: "+ esquina.Imprimir() + "; lado1 = " + lado1 + "; Lado 2 = " + lado2 ;
    }

    void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
