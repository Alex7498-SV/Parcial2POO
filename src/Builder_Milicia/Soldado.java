
package Builder_Milicia;


public class Soldado{
    private int vida = 0;
    private int ataque = 0;
    private String nombre= "";

    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getVida() {
        return vida;
    }
    public int getAtaque() {
        return ataque;
    }
    public String getNombre() {
        return nombre;
    }

    
    
    
}