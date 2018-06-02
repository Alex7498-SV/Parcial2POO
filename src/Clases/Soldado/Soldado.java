
package Clases.Soldado;

import Interfaces.Soldados;

public class Soldado implements Soldados{

    @Override
    public void Atacar() {
        System.out.println("Causando daño de 25%");
    }

}
