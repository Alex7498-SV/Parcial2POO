
package Builder_Milicia;

public class SuperSoldado extends soldadoBuilder{

    public SuperSoldado() {
        super.soldado = new Soldado();
    }
   
    @Override
    public void BuildNombre(String nombre) {
        soldado.setNombre(nombre);
    }

    @Override
    public void BuildAtaque(float modAtaque) {
        soldado.setAtaque((int) (150+(soldado.getAtaque()*modAtaque)));
    }

    @Override
    public void BuildVida(float modVida) {
        soldado.setVida((int) (200+ (soldado.getVida()*modVida)));
    }
    
}
