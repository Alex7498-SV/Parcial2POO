/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author Alex
 */
public class Ucanianos implements Razas{
    
    @Override
    public String tipovehiculo1() {
        return "Bus";
    }

    @Override
    public String tipovehiculo2() {
        return "Coaster";
    }

    @Override
    public String tipovehiculo3() {
        return "BMDoblePies";
    }
    
    @Override
    public String tiporecurso1() {
        return "CumPoo";
    }

    @Override
    public String tiporecurso2() {
        return "CombitosPEA";
    }

    @Override
    public String tiporecurso3() {
        return "Chory's";
    }

    @Override
    public float valorIncrementoVida() {
        return (float) 0.75;
    }

    @Override
    public float valorIncrementoAtaque() {
        return (float) 0.5;
    }

    @Override
    public float valorDecrementoAtaque() {
        return 0;
    }

    @Override
    public float valorDecrementoVida() {
        return 0;
    }

    @Override
    public int aumentoFase() {
        return -1;
    }

    @Override
    public int decrementoFase() {
        return 0;
    }
    
}
