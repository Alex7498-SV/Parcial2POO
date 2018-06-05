
package RubenSiguenzas_World;

import Interfaces.Soldados;
import Clases.Soldado.*;

public class Entrenador {
    public Soldados getSoldado(int b, String name, int invida, int inatac){
        switch(b){
            case 1:
                return new Soldado(name, invida, inatac);
            case 2:
                return new Fuerzas_Especiales(name, invida, inatac);
        }
        return null;
    }
}
