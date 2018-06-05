
package RubenSiguenzas_World;
import Interfaces.Recurso;
import Clases.Recurso.*;

public class Recolector {
    public Recurso getRecurso(int selec, String tipo, String nombre, int vida, int fase ){
        switch(selec){
            case 1:
                return new TorreR3(tipo, nombre, vida, fase);
            case 2:
                return new TorreR2(tipo, nombre, vida, fase);
            case 3:
                return new TorreR1(tipo, nombre, vida, fase);
        }
        return null;
    }
}
