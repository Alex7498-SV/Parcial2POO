
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
    public void BuildAtaque() {
        soldado.setAtaque(150);
    }

    @Override
    public void BuildVida() {
        soldado.setVida(200);
    }
    
}
