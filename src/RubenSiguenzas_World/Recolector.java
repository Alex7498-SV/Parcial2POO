
package RubenSiguenzas_World;
import Interfaces.Recurso;
import Clases.Recurso.*;

public class Recolector {
    public Recurso getRecurso(int a){
        switch(a){
            case 1:
                return new Oro();
            case 2:
                return new Plata();
            case 3:
                return new Platino();
        }
        return null;
    }
}
