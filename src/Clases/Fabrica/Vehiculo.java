
package Clases.Fabrica;

import Interfaces.Fabrica;
import Interfaces.Vehiculos;
import RubenSiguenzas_World.Conductor;

public class Vehiculo implements Fabrica{
    
    public Vehiculo getVehivulo(int tipo){
        Conductor c = new Conductor();
        Vehiculos v = c.getVehiculo(tipo);
        v.Conducir();
        return null;
    }

}
