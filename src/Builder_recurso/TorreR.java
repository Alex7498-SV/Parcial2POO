
package Clases.Recurso;

public class TorreR{

    private int vida = 50;
    private int recursos = 0;
    private int reg = 0;
    private String nombre = "";
    private String tipor = "";


    public void setTipoR(String TipoR) {
        this.tipor = TipoR;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int incVida) {
        this.vida *= incVida;
    }
    
    public void setReg(int fase) {
        this.reg = fase;
    }

    public String Status() {
        return "La estructura"+ nombre + "posee" + recursos+ "disponibles";
    }

    public void Recolectar() {
        
    }

}
