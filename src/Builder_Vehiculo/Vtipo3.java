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
public class Vtipo3 extends vehiculoBuilder{

    public Vtipo3() {
        super.vehiculo = new Vehiculo();
    }
    
    @Override
    public void BuildVida() {
        vehiculo.setVida(200);
    }

    @Override
    public void Buildataque() {
        vehiculo.setAtaque(100);
    }

    @Override
    public void BuildNombre(String nombre) {
        vehiculo.setNombre(nombre);
    }
    
}
