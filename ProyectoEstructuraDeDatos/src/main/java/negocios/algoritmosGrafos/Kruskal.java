package negocios.algoritmosGrafos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocios.dominioGrafo.Arista;
import negocios.dominioGrafo.Grafo;
import negocios.dominioGrafo.Vertice;

public class Kruskal {

    public static Grafo calcularArbolExpansionMinima(Grafo grafo) {
        Grafo arbolExpansionMinima = new Grafo();
        arbolExpansionMinima.setVertices(grafo.getVertices());
        
        List<Arista> aristasOrdenadasPorPeso = new ArrayList<>(grafo.getAristas());
        Collections.sort(aristasOrdenadasPorPeso, (a1, a2) -> Double.compare(a1.getPeso(), a2.getPeso()));
        

        List<Vertice> vertices = arbolExpansionMinima.getVertices(); // Declaración de la variable vertices

        ConjuntoDisjunto conjuntoDisjunto = new ConjuntoDisjunto(vertices);

        for (Arista arista : aristasOrdenadasPorPeso) {
            
            Vertice origen = arista.getOrigen();
            Vertice destino = arista.getDestino();

            if (!conjuntoDisjunto.estanConectados(origen, destino)) {
                arbolExpansionMinima.agregarArista(origen.getMunicipio(), destino.getMunicipio(), arista.getPeso());
                conjuntoDisjunto.unir(arbolExpansionMinima.encontrarVertice(origen.getMunicipio()), arbolExpansionMinima.encontrarVertice(destino.getMunicipio()));
            }
        }
        

        return arbolExpansionMinima;
    }
    
    private static class ConjuntoDisjunto {
        private int[] parent;
        private List<Vertice> vertices ;

        public ConjuntoDisjunto(List<Vertice> vertices) {
            this.vertices = vertices ;
            parent = new int[vertices.size()];
            for (int i = 0; i < vertices.size(); i++) {
                parent[i] = i;
            }
        }

        public int encontrar(int x) {
            if (parent[x] == x) {
                return x;
            }
            return parent[x] = encontrar(parent[x]);
        }

        public void unir(Vertice x, Vertice y) {
            parent[encontrar(vertices.indexOf(x))] = encontrar(vertices.indexOf(y));
        }

        public boolean estanConectados(Vertice x, Vertice y) {
            return encontrar(vertices.indexOf(x)) == encontrar(vertices.indexOf(y));
        }
    }
}
