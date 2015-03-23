/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champions;

import org.w3c.dom.*;

/**
 *
 * @author Manuel Cañamaque
 */
public class Partido {
    String equipo1;
    String equipo2;

    public Partido(String equipo1, String equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }
    public Element toElement(Document documento){
        Element elementoPartido = documento.createElement("PARTIDO");
        
        Element elementoEquipoA = documento.createElement("EQUIPO");        
        elementoEquipoA.setTextContent(equipo1);
        
        Element elementoEquipoB= documento.createElement("EQUIPO");
        elementoEquipoB.setTextContent(equipo2);
        
        elementoPartido.appendChild(elementoEquipoA);
        elementoPartido.appendChild(elementoEquipoB);
        
        return elementoPartido;
    }
}
