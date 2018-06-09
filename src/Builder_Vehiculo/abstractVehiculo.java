/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder_Vehiculo;

/**
 *
 * @author Alex
 */
public class abstractVehiculo {
    public Vehiculo getVehiculo(int tipo, String nombre){

        UCAMotorsport fabrica = new UCAMotorsport();
        Vtipo1 vt1 = new Vtipo1();
        Vtipo2 vt2 = new Vtipo2();
        Vtipo3 vt3 = new Vtipo3();
        
        switch(tipo){
            case 1:
                fabrica.setVehiculoBuilder(vt1);
                fabrica.armarVehiculo(nombre);
                return fabrica.getVehiculo();
            case 2:
                fabrica.setVehiculoBuilder(vt2);
                fabrica.armarVehiculo(nombre);
                return fabrica.getVehiculo();
            case 3:
                fabrica.setVehiculoBuilder(vt3);
                fabrica.armarVehiculo(nombre);
                return fabrica.getVehiculo();
        }
        return null;
    }
}
