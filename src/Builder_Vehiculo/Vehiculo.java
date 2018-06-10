
package Builder_Vehiculo;


public class Vehiculo{
    private int ataque = 0;
    private String nombre = "";
    

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
