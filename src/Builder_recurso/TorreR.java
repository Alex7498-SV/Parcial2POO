
package Builder_recurso;

public class TorreR{

    private int vida = 0;
    private int recursos = 0;
    private String tipor = "";


    public void setTipoR(String TipoR) {
        this.tipor = TipoR;
    }
    
    public void setVida(int incVida) {
        this.vida *= incVida;
    }
    
    public int getVida() {
        return vida;
    }

    public int getRecursos() {
        return recursos;
    }

    public String getTipor() {
        return tipor;
    }

    public String Status() {
        return "La edificacion posee " + recursos+ " disponibles del tipo "+ tipor;
    }

    public void Recolectar() {
        
    }

}
