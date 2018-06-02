
package RubenSiguenzas_World;

import Interfaces.Soldados;
import Clases.Soldado.*;

public class Entrenador {
    public Soldados getSoldado(int b){
        switch(b){
            case 1:
                return new Soldado();
            case 2:
                return new Fuerzas_Especiales();
        }
        return null;
    }
}
