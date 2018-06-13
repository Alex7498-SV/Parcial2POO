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
public class Vtipo2 extends vehiculoBuilder{

    public Vtipo2() {
        super.vehiculo = new Vehiculo();
    }

    @Override
    public void Buildataque() {
        vehiculo.setAtaque(100);
    }

    @Override
    public void BuildNombre(String nombre) {
        vehiculo.setNombre(nombre);
    }
    
    @Override
    public void Buildtipo(String tipo) {
        vehiculo.setTipo(tipo);
    }
}
