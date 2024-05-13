/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package negocios.dominioGrafo;

/**
 *
 * @author Asiel Apodaca Monge
 */
public class Vertice {
    private String municipio;

    public Vertice() {
    }
    
    public Vertice(String municipio) {
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return municipio;
    }
    
    
    
}
