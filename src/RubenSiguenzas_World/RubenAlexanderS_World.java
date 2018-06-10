
package RubenSiguenzas_World;

import Builder_Vehiculo.*;
import Builder_recurso.*;
import java.util.ArrayList;



public class RubenAlexanderS_World {


    public static void main(String[] args) {
        //BobElConstructor constructor = new BobElConstructor();
        abstractVehiculo aV = new abstractVehiculo();
        
        ArrayList<Vehiculo> arvehiculo = new ArrayList<Vehiculo>();
        
        arvehiculo.add(aV.getVehiculo(1, "Coaster"));
        arvehiculo.add(aV.getVehiculo(3, "Carreta"));
        arvehiculo.add(aV.getVehiculo(1, "Camion"));
        arvehiculo.add(aV.getVehiculo(2, "Formula 1"));
        arvehiculo.add(aV.getVehiculo(3, "Mickey"));
        
        arvehiculo.forEach(vehiculo->{
            System.out.println("Datos de vehiculo");
            System.out.println(vehiculo.getNombre());
            System.out.println(vehiculo.getVida());
        });
        
    }
}
