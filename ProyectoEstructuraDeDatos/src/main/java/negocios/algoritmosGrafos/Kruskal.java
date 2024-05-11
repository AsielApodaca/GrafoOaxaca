package negocios.algoritmosGrafos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import negocios.dominioGrafo.Arista;
import negocios.dominioGrafo.Grafo;
import negocios.dominioGrafo.Vertice;

public class Kruskal {

    public Grafo calcularArbolExpansionMinima(Grafo grafo) {
        Grafo arbolExpansionMinima = new Grafo();
        List<Arista> aristasOrdenadasPorPeso = new ArrayList<>(grafo.getAristas());
        Collections.sort(aristasOrdenadasPorPeso, (a1, a2) -> a1.getPeso() - a2.getPeso());

        List<Vertice> vertices = grafo.getVertices(); // Declaración de la variable vertices

        DisjointSet disjointSet = new DisjointSet(vertices);

        for (Arista arista : aristasOrdenadasPorPeso) {
            Vertice origen = arista.getOrigen();
            Vertice destino = arista.getDestino();

            if (!disjointSet.estanConectados(origen, destino)) {
                arbolExpansionMinima.agregarVertice(origen.getMunicipio());
                arbolExpansionMinima.agregarVertice(destino.getMunicipio());
                arbolExpansionMinima.agregarArista(origen.getMunicipio(), destino.getMunicipio(), arista.getPeso());
                disjointSet.unir(origen, destino);
            }
        }

        return arbolExpansionMinima;
    }

    private static class DisjointSet {
        private int[] parent;

        public DisjointSet(List<Vertice> vertices) {
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
