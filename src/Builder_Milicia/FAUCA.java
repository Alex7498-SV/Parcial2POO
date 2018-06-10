
package Builder_Milicia;

public class FAUCA {
    
    protected soldadoBuilder sBuilder;
    
    public void setSoldadoBuilder(soldadoBuilder sb){
        sBuilder = sb;
    }
    
    public Soldado getSoldado(){
        return  sBuilder.getSoldado();
    }
    
    public void entrenarSoldado(String nombre){
        sBuilder.BuildNombre(nombre);
        sBuilder.BuildVida();
        sBuilder.BuildAtaque();
    }
}
