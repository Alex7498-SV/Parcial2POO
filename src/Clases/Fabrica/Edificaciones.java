
package Clases.Fabrica;

import Interfaces.Fabrica;
import Interfaces.Recurso;
import RubenSiguenzas_World.Recolector;

public class Edificaciones implements Fabrica{
    
    public Edificaciones getEdificacion(int selec, String tipo, String nombre, int invid, int fase){
        Recolector r1 = new Recolector();
        Recurso r = r1.getRecurso(selec, tipo, nombre, invid, fase);
        
        return null;
    }
}
