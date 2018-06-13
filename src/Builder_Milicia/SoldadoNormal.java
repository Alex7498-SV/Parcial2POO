
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
    public void BuildAtaque(float modAtaque) {
        soldado.setAtaque((int) (100 + (soldado.getAtaque()*modAtaque)));
    }

    @Override
    public void BuildVida(float modVida) {
        soldado.setVida((int) (100 + (soldado.getVida()*modVida)));
    }
    
}
