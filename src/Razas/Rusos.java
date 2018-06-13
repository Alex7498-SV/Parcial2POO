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
public class Rusos implements Razas{
    
    @Override
    public String tipovehiculo1() {
        return "Hummer";
    }

    @Override
    public String tipovehiculo2() {
        return "Tanque de guerra";
    }

    @Override
    public String tipovehiculo3() {
        return "Avion caza";
    }
    
    @Override
    public String tiporecurso1() {
        return "Oro";
    }

    @Override
    public String tiporecurso2() {
        return "MercurioRojo";
    }

    @Override
    public String tiporecurso3() {
        return "Plata";
    }

    @Override
    public float valorIncrementoVida() {
        return (float) 0.8;
    }

    @Override
    public float valorIncrementoAtaque() {
        return (float) 0.9;
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
        return 0;
    }

    @Override
    public int decrementoFase() {
        return 0;
    }
}
