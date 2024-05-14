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
        
        String nombre = "Oaxaca";
        String nombre2 = "San Juan Bautista Tuxtepec";
        String nombre3 = "Heroica Ciudad de Juchitán de Zaragoza";
        String nombre4 = "Santa Cruz Xoxocoltán";
        String nombre5 = "Salina Cruz";
        String nombre6 = "Heroica Ciudad de Huajuapan de León";
        String nombre7 = "Santa Lucía del Cammino";
        String nombre8 = "Santo Domingo Tehuantepec";
        String nombre9 = "Santiago Pinotepa Nacional";
        String nombre10 = "Loma Bonita";
        String nombre11 = "Puerto Escondido";
        String nombre12 = "Miahuatlán de Porfirio Díaz";
        String nombre13 = "Santa María Atzompa";
        String nombre14 = "Ciudad Ixtepec";
        String nombre15 = "San Antonio de la Cal";

        Grafo k = new Grafo();
        k.agregarVertice(nombre);
        k.agregarVertice(nombre2);
        k.agregarVertice(nombre3);
        k.agregarVertice(nombre4);
        k.agregarVertice(nombre5);
        k.agregarVertice(nombre6);
        k.agregarVertice(nombre7);
        k.agregarVertice(nombre8);
        k.agregarVertice(nombre9);
        k.agregarVertice(nombre10);
        k.agregarVertice(nombre11);
        k.agregarVertice(nombre12);
        k.agregarVertice(nombre13);
        k.agregarVertice(nombre14);
        k.agregarVertice(nombre15);
        
        k.agregarArista(nombre, nombre7, 4.6);
        k.agregarArista(nombre, nombre4, 8.7);
        k.agregarArista(nombre, nombre13, 7.2);
        k.agregarArista(nombre, nombre15, 7.9);
        k.agregarArista(nombre2, nombre7, 215);
        k.agregarArista(nombre2, nombre6, 390);
        k.agregarArista(nombre2, nombre10, 36.6);
        k.agregarArista(nombre3, nombre5, 44.8);
        k.agregarArista(nombre3, nombre8, 28.5);
        k.agregarArista(nombre3, nombre14, 20.8);
        k.agregarArista(nombre4, nombre13, 13);
        k.agregarArista(nombre4, nombre15, 6.8);
        k.agregarArista(nombre5, nombre8, 17);
        k.agregarArista(nombre5, nombre12, 370);
        k.agregarArista(nombre6, nombre13, 167);
        k.agregarArista(nombre6, nombre9, 286);
        k.agregarArista(nombre7, nombre15, 5.9);
        k.agregarArista(nombre7, nombre14, 255);
        k.agregarArista(nombre8, nombre15, 249);
        k.agregarArista(nombre8, nombre14, 40.8);
        k.agregarArista(nombre8, nombre12, 296);
        k.agregarArista(nombre9, nombre11, 140);
        k.agregarArista(nombre10, nombre14, 274);
        k.agregarArista(nombre11, nombre15, 188);
        k.agregarArista(nombre11, nombre12, 146);
        k.agregarArista(nombre12, nombre15, 98.9);
        k.agregarArista(nombre14, nombre15, 266);

        ImprimirGrafo.imprimirMatrizAdyacencia(k.obtenerMatrizAdyacente());    
        
//        List<Vertice> listaVertice = k.getVertices();
//        Grafo grafo = new Grafo();
        Vertice origen = k.encontrarVertice(nombre);
        Vertice destino = k.encontrarVertice(nombre10);
        System.out.println("Nodo de origen: " + origen);
        System.out.println("Nodo de destino: " + destino);
        
        List<Vertice> caminoMasCorto = k.dijkstra(origen, destino);
        
        System.out.println("Camino más corto: " + caminoMasCorto);
        
        List<Arista> caminoAristas = k.caminoAristas(caminoMasCorto);
        
        System.out.println("La distancia total es: " + k.distancia(caminoAristas));
        
        Grafo arbolExpansionMinima = Kruskal.calcularArbolExpansionMinima(k);
        
        ImprimirGrafo.imprimirMatriz(arbolExpansionMinima);
        
//        JFrame frame = new JFrame("Ejemplo de JPanel");
//        PanelGrafoOaxaca panel = new PanelGrafoOaxaca() ;
//        frame.add(panel);
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
    }
        
    }


