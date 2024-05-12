package negocios.servicios;

import java.util.List;
import negocios.dominioGrafo.Grafo;
import negocios.dominioGrafo.Vertice;

/**
 *
 * @author mirey
 */
public class ImprimirGrafo {
    public static void imprimirMatrizAdyacencia(Double[][] matrizAdyacencia) {
        System.out.println("\nMatriz de Adyacencia:\n");
        System.out.print("       ");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.printf("%-7d", i + 1);
        }
        System.out.println();
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.printf("%-3d|", i + 1);
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                if (matrizAdyacencia[i][j] == null || matrizAdyacencia[i][j] == Double.POSITIVE_INFINITY) {
                    System.out.printf("%-7s", "   /   ");
                } else {
                    System.out.printf("%-7.1f", matrizAdyacencia[i][j]);
                }
            }
            System.out.println();
        }
    }
    
    public static void imprimirMatrizAdyacencia(Grafo grafo) {
        Double[][] matrizAdyacencia = grafo.obtenerMatrizAdyacente();
        
        System.out.println("\nMatriz de Adyacencia:\n");
        System.out.print("       ");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.printf("%-7d", i + 1);
        }
        System.out.println();
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.printf("%-3d|", i + 1);
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                if (matrizAdyacencia[i][j] == null || matrizAdyacencia[i][j] == Double.POSITIVE_INFINITY) {
                    System.out.printf("%-7s", "   /   ");
                } else {
                    System.out.printf("%-7.1f", matrizAdyacencia[i][j]);
                }
            }
            System.out.println();
        }
        
        List<Vertice> vertices = grafo.getVertices();
        System.out.println("Dato de cada vertice:");
        for (int i = 0; i < vertices.size(); i++) {
            System.out.println(i + ": " + vertices.get(i).getMunicipio());
        }
        
    }
}
