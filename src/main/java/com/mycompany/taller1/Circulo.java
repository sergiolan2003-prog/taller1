
package com.mycompany.taller1;

/**
 *
 * @author SergioLancheros
 */
public class Circulo {
    private Punto esquina;
    private int radio;

    public Circulo(Punto esquina, int radio) {
        this.esquina = esquina;
        this.radio = radio;
    }

    
    public void setEsquina(Punto esquina) {
        this.esquina = esquina;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
    public Punto getEsquina() {
        return esquina;
    }

    public int getRadio() {
        return radio;
    }

    public String Imprimir(Punto esquina) {
        return "Esquina: "+ esquina.Imprimir() + "; radio" + radio;
    }

    void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
