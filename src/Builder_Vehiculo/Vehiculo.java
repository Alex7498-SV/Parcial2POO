
package Builder_Vehiculo;


public class Vehiculo{
    private int vida = 0;
    private int ataque = 0;
    private String nombre = "";
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getAtaque() {
        return ataque;
    }

}
