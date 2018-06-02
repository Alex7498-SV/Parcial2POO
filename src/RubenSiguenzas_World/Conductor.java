
package RubenSiguenzas_World;

import Interfaces.Vehiculos;
import Clases.Vehiculo.*;

public class Conductor {
    public Vehiculos getVehiculo(int a){
        switch(a){
            case 1:
                return new Coaster();
            case 2: 
                return new Tanque();
            case 3:
                return new Bombardero();
        }
        return null;
    }
}
