
package Builder_Milicia;

public abstract class soldadoBuilder {
    protected Soldado soldado;
    
    public  Soldado getSoldado(){
        return soldado;
    }
    
    public abstract void BuildNombre(String nombre);
    public abstract void BuildAtaque();
    public abstract void BuildVida();
    
}
