
package Clases.Vehiculo;

import Interfaces.Vehiculos;

public class Bombardero implements Vehiculos{

    @Override
    public void Conducir() {
        System.out.println("Arrojando Bombas");
    }

}
