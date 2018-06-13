
package Builder_recurso;

public class TorreR{

    private int vida = 0;
    private int recursos = 0;
    private String tipor = "";
    private String nombreTorre = "";
    private int fasesConstruccion =  0;
    boolean ataque = false;

    public boolean isAtaque() {
        return ataque;
    }

    public void setAtaque(boolean ataque) {
        this.ataque = ataque;
    }

    public String getNombreTorre() {
        return nombreTorre;
    }

    public void setNombreTorre(String nombreTorre) {
        this.nombreTorre = nombreTorre;
    }

    public int getFasesConstruccion() {
        return fasesConstruccion;
    }

    public void setFasesConstruccion(int fasesConstruccion) {
        this.fasesConstruccion = fasesConstruccion;
    }


    
    public void setTipoR(String TipoR) {
        this.tipor = TipoR;
    }
    
    public void setVida(int incVida) {
        this.vida += incVida;
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

    public void producirRecurso(int pRec){
        this.recursos += pRec;
    }
    
    public int Recolectar() {
        return recursos; 
    }

}
