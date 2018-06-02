
package RubenSiguenzas_World;

import Interfaces.*;

public class RubenAlexanderS_World {

    public static void main(String[] args) {
        Recolector r1 = new Recolector();
        Entrenador e = new Entrenador();
        Conductor c = new Conductor();
        
        for (int i = 1; i<=3 ; i++){
            Recurso r = r1.getRecurso(i);
            r.Recolectar();
        }
        for (int j = 1; j<=2 ; j++){
            Soldados u = e.getSoldado(j);
            u.Atacar();
        }
        for (int k = 1; k<=3 ; k++){
            Vehiculos v = c.getVehiculo(k);
            v.Conducir();
        }
       
    }
    
}
