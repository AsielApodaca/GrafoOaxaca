package negocios.servicios;

import negocios.dominioGrafo.Grafo;

/**
 *
 * @author mirey
 */
public class ImprimirGrafo {
    public static void imprimirMatrizAdyacencia(Double[][] matrizAdyacencia) {
        System.out.println("Matriz de Adyacencia:\n");
        System.out.print("       ");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.printf("%-7d", i + 1);
        }
        System.out.println();
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.printf("%-3d|", i + 1);
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                if (matrizAdyacencia[i][j] == Double.POSITIVE_INFINITY || matrizAdyacencia[i][j] == null) {
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
        
        System.out.println("Matriz de Adyacencia:\n");
        System.out.print("       ");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.printf("%-7d", i + 1);
        }
        System.out.println();
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            System.out.printf("%-3d|", i + 1);
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                if (matrizAdyacencia[i][j] == Double.POSITIVE_INFINITY || matrizAdyacencia[i][j] == null) {
                    System.out.printf("%-7s", "   /   ");
                } else {
                    System.out.printf("%-7.1f", matrizAdyacencia[i][j]);
                }
            }
            System.out.println();
        }
    }
}
