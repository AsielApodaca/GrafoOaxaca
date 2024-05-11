/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package negocios.dominioGrafo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asiel Apodaca Monge
 */
public class Grafo {

    private static final Logger LOG = Logger.getLogger(Grafo.class.getName());
    
    private List<Vertice> vertices; // Representa los minicipios
    private List<Arista> aristas; // Representa los caminos

    public Grafo() {
        this.vertices = new ArrayList<>();
        this.aristas = new ArrayList<>();
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public List<Arista> getAristas() {
        return aristas;
    }
    
    public void agregarVertice(String municipio) { // Agrega un municipio
        vertices.add(new Vertice(municipio));
    }
    
    public void agregarArista(String municipioOrigen, String municipioDestino, int peso) { // Agrega un camino entre municipios
        Vertice origen = encontrarVertice(municipioOrigen);
        Vertice destino = encontrarVertice(municipioDestino);
        
        if(origen != null && destino != null) {
            aristas.add(new Arista(origen, destino, peso));
            
        } else {
            LOG.log(Level.WARNING, "Error: No se pudo agregar la arista, los vertices no se encontraron.");
            
        }
    }
    
    private Vertice encontrarVertice(String nombreMunicipio) {
        for(Vertice verticeMunicipio : vertices) {
            if(verticeMunicipio.getMunicipio().equalsIgnoreCase(nombreMunicipio)) {
                return verticeMunicipio;
            }
        }
        return null;
    }
    
    public Integer[][] obtenerMatrizAdyacente() {
        int largo = vertices.size();
        Integer[][] matriz = new Integer[largo][largo];
        
        for(Arista aristaCamino : aristas) {
            int indexOrigen = vertices.indexOf(aristaCamino.getOrigen());
            int indexDestino = vertices.indexOf(aristaCamino.getDestino());
            
            matriz[indexOrigen][indexDestino] = aristaCamino.getPeso();
        }
        
        return matriz;
    }
}
