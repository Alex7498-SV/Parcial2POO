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
public abstract class vehiculoBuilder {
    protected Vehiculo vehiculo;
    
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    
    public abstract  void BuildNombre(String nombre);
    public abstract void Buildataque();
    
}
