/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import grafoOaxaca.presentacion.PanelGrafoOaxaca;
import java.util.List;
import javax.swing.JFrame;
import negocios.algoritmosGrafos.Kruskal;
import negocios.dominioGrafo.Arista;
import negocios.dominioGrafo.Grafo;
import negocios.dominioGrafo.Vertice;
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
//        double inf = Double.POSITIVE_INFINITY;
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
        k.agregarVertice("1");
        k.agregarVertice("2");
        k.agregarVertice("3");
        k.agregarVertice("4");
        k.agregarVertice("5");
        k.agregarVertice("6");
        k.agregarVertice("7");
        k.agregarVertice("8");
        k.agregarVertice("9");
        k.agregarVertice("10");
        k.agregarVertice("11");
        k.agregarVertice("12");
        k.agregarVertice("13");
        k.agregarVertice("14");
        k.agregarVertice("15");
        
        k.agregarArista("1", "7", 4.6);
        k.agregarArista("1", "4", 8.7);
        k.agregarArista("1", "13", 7.2);
        k.agregarArista("1", "15", 7.9);
        k.agregarArista("2", "7", 215);
        k.agregarArista("2", "6", 390);
        k.agregarArista("2", "10", 36.6);
        k.agregarArista("3", "5", 44.8);
        k.agregarArista("3", "8", 28.5);
        k.agregarArista("3", "14", 20.8);
        k.agregarArista("4", "13", 13);
        k.agregarArista("4", "15", 6.8);
        k.agregarArista("4", "1", 8.7);
        k.agregarArista("5", "8", 17);
        k.agregarArista("5", "12", 370);
        k.agregarArista("5", "3", 44.8);
        k.agregarArista("6", "13", 167);
        k.agregarArista("6", "2", 390);
        k.agregarArista("6", "9", 286);
        k.agregarArista("7", "15", 5.9);
        k.agregarArista("7", "1", 4.6);
        k.agregarArista("7", "2", 215);
        k.agregarArista("7", "14", 255);
        k.agregarArista("8", "15", 249);
        k.agregarArista("8", "14", 40.8);
        k.agregarArista("8", "12", 296);
        k.agregarArista("8", "3", 28.5);
        k.agregarArista("8", "5", 17);
        k.agregarArista("9", "11", 140);
        k.agregarArista("9", "6", 286);
        k.agregarArista("10", "14", 274);
        k.agregarArista("10", "2", 36.6);
        k.agregarArista("11", "15", 188);
        k.agregarArista("11", "9", 140);
        k.agregarArista("11", "12", 146);
        k.agregarArista("12", "15", 98.9);
        k.agregarArista("12", "5", 370);
        k.agregarArista("12", "8", 296);
        k.agregarArista("12", "11", 146);
        k.agregarArista("13", "1", 7.2);
        k.agregarArista("13", "4", 8.7);
        k.agregarArista("13", "6", 167);
        k.agregarArista("14", "3", 20.8);
        k.agregarArista("14", "7", 255);
        k.agregarArista("14", "8", 40.8);
        k.agregarArista("14", "10", 274);
        k.agregarArista("14", "15", 266);
        k.agregarArista("15", "1", 7.9);
        k.agregarArista("15", "4", 6.8);
        k.agregarArista("15", "7", 5.9);
        k.agregarArista("15", "8", 249);
        k.agregarArista("15", "14", 266);
        k.agregarArista("15", "12", 98.9);

        ImprimirGrafo.imprimirMatrizAdyacencia(k.obtenerMatrizAdyacente());    
        
//        List<Vertice> listaVertice = k.getVertices();
//        Grafo grafo = new Grafo();
        Vertice origen = k.encontrarVertice("4");
        Vertice destino = k.encontrarVertice("7");
        System.out.println("Nodo de origen: " + origen);
        System.out.println("Nodo de destino: " + destino);
        
        List<Vertice> caminoMasCorto = k.dijkstra(origen, destino);
        
        System.out.println("Camino más corto: " + caminoMasCorto);
        
        List<Arista> caminoAristas = k.caminoAristas(caminoMasCorto);
        
        System.out.println("La distancia total es: " + k.distancia(caminoAristas));
        
//        Grafo arbolExpansionMinima = Kruskal.calcularArbolExpansionMinima(k);
//        
//        ImprimirGrafo.imprimirMatrizAdyacencia(arbolExpansionMinima);
        
//        JFrame frame = new JFrame("Ejemplo de JPanel");
//        PanelGrafoOaxaca panel = new PanelGrafoOaxaca() ;
//        frame.add(panel);
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
    }
        
    }


