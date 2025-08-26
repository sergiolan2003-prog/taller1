
package com.mycompany.taller1;

/**
 *
 * @author SergioLancheros
 */
public class Taller1 {
    public static void main(String[] args) {
       
        Punto p1 = new Punto(2, 3);
        Punto p2 = new Punto(5, 7);

        
        Linea linea = new Linea(p1, p2);

        
        Circulo c = new Circulo(new Punto(1, 1), 10);

        
        Rectangulo r = new Rectangulo(new Punto(0, 0), 4, 6);

        
        Cuadrado sq = new Cuadrado(new Punto(2, 2), 5);

        
        Punto3D p3d = new Punto3D(3, 4, 8);

        
        System.out.println("=== Pruebas de Figuras ===");
        System.out.print("Punto p1 -> ");
        p1.imprimir();

        System.out.print("Punto p2 -> ");
        p2.imprimir();

        System.out.println("\nLínea:");
        linea.imprimir();

        System.out.println("\nCírculo:");
        c.imprimir();

        System.out.println("\nRectángulo:");
        r.imprimir();

        System.out.println("\nCuadrado:");
        sq.imprimir();

        System.out.println("\nPunto 3D:");
        p3d.imprimir();
    }
}
