/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import grafoOaxaca.presentacion.FrmGrafoOaxaca;

/**
 *
 * @author Asiel Apodaca Monge
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FrmGrafoOaxaca f = new FrmGrafoOaxaca() ;

        //    f.setVisible(true);
        double inf = Double.POSITIVE_INFINITY;
        double[][] matrizAdyacencia = {
            {inf, inf, inf, 8.7, inf, inf, 4.6, inf, inf, inf, inf, inf, 7.2, inf, 7.9},
            {inf, inf, inf, inf, inf, 390, 215, inf, inf, 26.6, inf, inf, inf, inf, inf},
            {inf, inf, inf, inf, 44.8, inf, inf, 28.5, inf, inf, inf, inf, inf, 20.8, inf},
            {8.7, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, 13, inf, 6.8},
            {inf, inf, 44.8, inf, inf, inf, inf, 17, inf, inf, inf, 370, inf, inf, inf},
            {inf, 390, inf, inf, inf, inf, inf, inf, 286, inf, inf, inf, 167, inf, inf},
            {4.6, 215, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, 255, 5.9},
            {inf, inf, 28.5, inf, 17, inf, inf, inf, inf, inf, inf, 296, inf, 40.8, 249},
            {inf, inf, inf, inf, inf, 286, inf, inf, inf, inf, 140, inf, inf, inf, inf},
            {inf, 36.6, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, 274, inf},
            {inf, inf, inf, inf, inf, inf, inf, inf, 140, inf, inf, 146, inf, inf, 188},
            {inf, inf, inf, inf, 370, inf, inf, 296, inf, inf, 146, inf, inf, inf, inf},
            {7.2, inf, inf, 13, inf, 167, inf, inf, inf, inf, inf, inf, inf, inf, inf},
            {inf, inf, 20.8, inf, inf, inf, 255, 40.8, inf, 274, inf, inf, inf, inf, 266},
            {7.9, inf, inf, 6.8, inf, inf, 5.9, 249, inf, inf, 188, 98.9, inf, 266, inf}
        };

        // Imprimir la matriz de adyacencia en forma de tabla
        System.out.println("Matriz de Adyacencia:");
        System.out.print("    ");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.printf("%-7d", i + 1);
        }
        System.out.println();
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.printf("%-3d|", i + 1);
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                if (matrizAdyacencia[i][j] == Double.POSITIVE_INFINITY) {
                    System.out.printf("%-7s", "No");
                } else {
                    System.out.printf("%-7.1f", matrizAdyacencia[i][j]);
                }
            }
            System.out.println();
        }
    }

}
