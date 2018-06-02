
package Clases.Vehiculo;

import Interfaces.Vehiculos;

public class Tanque implements Vehiculos{

    @Override
    public void Conducir() {
        System.out.println("Lento pero peligroso");
    }

}
