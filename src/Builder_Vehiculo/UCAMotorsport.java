
package Builder_Vehiculo;

public class UCAMotorsport {
    protected vehiculoBuilder Vbuilder;
    
    public void setVehiculoBuilder(vehiculoBuilder vB){
        Vbuilder = vB;
    }
    
    public  Vehiculo getVehiculo(){
        return Vbuilder.getVehiculo();
    }
    
    public void armarVehiculo(String nombre){
        Vbuilder.BuildNombre(nombre);
        Vbuilder.Buildataque();
    }
}
