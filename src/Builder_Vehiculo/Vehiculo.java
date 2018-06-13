
package Builder_Vehiculo;


public class Vehiculo{
    private int ataque = 0;
    private String nombre = "";
    private String tipo = "";

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
