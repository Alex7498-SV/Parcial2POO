
package Builder_Milicia;

public class SoldadoNormal extends soldadoBuilder{

    public SoldadoNormal() {
        super.soldado = new Soldado();
    }
   
    @Override
    public void BuildNombre(String nombre) {
        soldado.setNombre(nombre);
    }

    @Override
    public void BuildAtaque() {
        soldado.setAtaque(100);
    }

    @Override
    public void BuildVida() {
        soldado.setVida(100);
    }
    
}
