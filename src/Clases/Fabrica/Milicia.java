
package Clases.Fabrica;

import Interfaces.Fabrica;
import Interfaces.Soldados;
import RubenSiguenzas_World.Entrenador;

public class Milicia implements Fabrica{

    public Milicia getMilicia(int tipo, String name, int incvid, int incatac){
        Entrenador e = new Entrenador();
        Soldados s = e.getSoldado(tipo, name, incvid, incatac);
        s.Atacar();
        return null;
    }
}
