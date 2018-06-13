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
public class Griegos implements Razas{
    
    @Override
    public String tipovehiculo1() {
        return "Carrosa";
    }

    @Override
    public String tipovehiculo2() {
        return "Caballo";
    }

    @Override
    public String tipovehiculo3() {
        return "Caballo de troya";
    }
    
    @Override
    public String tiporecurso1() {
        return "Oro";
    }

    @Override
    public String tiporecurso2() {
        return "Plata";
    }

    @Override
    public String tiporecurso3() {
        return "Platino";
    }

    @Override
    public float valorIncrementoVida() {
        return (float) 0.45;
    }

    @Override
    public float valorIncrementoAtaque() {
        return 0;
    }

    @Override
    public float valorDecrementoAtaque() {
        return (float) 0.2;
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
        return 2;
    }
    
}
