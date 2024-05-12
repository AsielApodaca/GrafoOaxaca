/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import grafoOaxaca.presentacion.FrmGrafoOaxaca;
import negocios.algoritmosGrafos.Kruskal;
import negocios.dominioGrafo.Grafo;
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
//        Double[][] matrizAdyacencia = {
//            {inf, inf, inf, 8.7d, inf, inf, 4.6d, inf, inf, inf, inf, inf, 7.2d, inf, 7.9d},
//            {inf, inf, inf, inf, inf, 390d, 215d, inf, inf, 26.6d, inf, inf, inf, inf, inf},
//            {inf, inf, inf, inf, 44.8d, inf, inf, 28.5d, inf, inf, inf, inf, inf, 20.8d, inf},
//            {8.7d, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, 13d, inf, 6.8d},
//            {inf, inf, 44.d, inf, inf, inf, inf, 17d, inf, inf, inf, 370d, inf, inf, inf},
//            {inf, 390d, inf, inf, inf, inf, inf, inf, 286d, inf, inf, inf, 167d, inf, inf},
//            {4.6d, 215d, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, 255d, 5.9d},
//            {inf, inf, 28.5d, inf, 17d, inf, inf, inf, inf, inf, inf, 296d, inf, 40.8d, 249d},
//            {inf, inf, inf, inf, inf, 286d, inf, inf, inf, inf, 140d, inf, inf, inf, inf},
//            {inf, 36.6d, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, inf, 274d, inf},
//            {inf, inf, inf, inf, inf, inf, inf, inf, 140d, inf, inf, 146d, inf, inf, 188d},
//            {inf, inf, inf, inf, 370d, inf, inf, 296d, inf, inf, 146d, inf, inf, inf, inf},
//            {7.2d, inf, inf, 13d, inf, 167d, inf, inf, inf, inf, inf, inf, inf, inf, inf},
//            {inf, inf, 20.8d, inf, inf, inf, 255d, 40.8d, inf, 274d, inf, inf, inf, inf, 266d},
//            {7.9d, inf, inf, 6.8d, inf, inf, 5.9d, 249d, inf, inf, 188d, 98.9d, inf, 266d, inf}
//        };
        
        Grafo k = new Grafo();
        k.agregarVertice("a");
        k.agregarVertice("b");
        k.agregarVertice("c");
        k.agregarVertice("d");
        k.agregarVertice("e");
        k.agregarVertice("f");
        k.agregarVertice("g");
        k.agregarVertice("h");
        k.agregarVertice("i");
        
        k.agregarArista("a", "b", 4);
        k.agregarArista("a", "h", 8);
        k.agregarArista("b", "h", 11);
        k.agregarArista("b", "c", 8);
        k.agregarArista("c", "i", 2);
        k.agregarArista("i", "h", 7);
        k.agregarArista("h", "g", 1);
        k.agregarArista("i", "g", 6);
        k.agregarArista("g", "f", 2);
        k.agregarArista("c", "f", 4);
        k.agregarArista("c", "d", 7);
        k.agregarArista("d", "f", 14);
        k.agregarArista("d", "e", 9);
        k.agregarArista("f", "e", 10);

        ImprimirGrafo.imprimirMatrizAdyacencia(k.obtenerMatrizAdyacente());    
        
        Grafo arbolExpansionMinima = Kruskal.calcularArbolExpansionMinima(k);
        
        ImprimirGrafo.imprimirMatrizAdyacencia(arbolExpansionMinima);
    }

}
