/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import grafoOaxaca.presentacion.FrmGrafoOaxaca;
import negocios.servicios.ImprimirGrafo;

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
        Double[][] matrizAdyacencia = {
            {inf, inf, inf, 8.7d, inf, inf, 4.6d, inf, inf, inf, inf, inf, 7.2d, inf, 7.9d},
            {inf, inf, inf, inf, inf, 390d, 215d, inf, inf, 26.6d, inf, inf, inf, inf, inf},
            {inf, inf, inf, inf, 44.8d, inf, inf, 28.5d, inf, inf, inf, inf, inf, 20.8d, inf},
            {8.7d, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, 13d, inf, 6.8d},
            {inf, inf, 44.d, inf, inf, inf, inf, 17d, inf, inf, inf, 370d, inf, inf, inf},
            {inf, 390d, inf, inf, inf, inf, inf, inf, 286d, inf, inf, inf, 167d, inf, inf},
            {4.6d, 215d, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, 255d, 5.9d},
            {inf, inf, 28.5d, inf, 17d, inf, inf, inf, inf, inf, inf, 296d, inf, 40.8d, 249d},
            {inf, inf, inf, inf, inf, 286d, inf, inf, inf, inf, 140d, inf, inf, inf, inf},
            {inf, 36.6d, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, 274d, inf},
            {inf, inf, inf, inf, inf, inf, inf, inf, 140d, inf, inf, 146d, inf, inf, 188d},
            {inf, inf, inf, inf, 370d, inf, inf, 296d, inf, inf, 146d, inf, inf, inf, inf},
            {7.2d, inf, inf, 13d, inf, 167d, inf, inf, inf, inf, inf, inf, inf, inf, inf},
            {inf, inf, 20.8d, inf, inf, inf, 255d, 40.8d, inf, 274d, inf, inf, inf, inf, 266d},
            {7.9d, inf, inf, 6.8d, inf, inf, 5.9d, 249d, inf, inf, 188d, 98.9d, inf, 266d, inf}
        };

        ImprimirGrafo.imprimirMatrizAdyacencia(matrizAdyacencia);    
    }

}
