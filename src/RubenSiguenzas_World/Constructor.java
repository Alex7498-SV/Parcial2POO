
package RubenSiguenzas_World;

import Interfaces.Fabrica;
import Clases.Fabrica.*;

public class Constructor {
    public Fabrica getCosa(int algo, int selec, String tipo, String nombre, int vida, int fase){
        switch(algo){
            case 1:
                return new Edificaciones().getEdificacion(selec, tipo, nombre, vida, fase);
            case 2:
                // corregir 
                //return new Milicia().getMilicia(tipo, name, tipo, algo);
            case 3:
                return new Vehiculo().getVehivulo(tipo);
            case 4:
                return new Centro_de_Mando();
        }
        return null;
    }
}
