
package Clases.Soldado;

import Interfaces.Soldados;

public class Fuerzas_Especiales implements Soldados{

    @Override
    public void Atacar() {
        System.out.println("Causando daño de 50%");
    }
    
}
