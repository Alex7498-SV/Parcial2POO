
package Clases.Recurso;

import Interfaces.Recurso;

public class TorreR1 implements Recurso{

    private int vida = 50;
    private int recursos = 0;
    private int reg = 0;
    private String nombre = "";
    private String tipor = "";

    public TorreR1(String tipo, String nombre, int vida, int fase) {
        setTipoR(tipo);
        setNombre(nombre);
        setVida(vida);
        setReg(fase);
    }
    
    @Override
    public void setTipoR(String TipoR) {
        this.tipor = TipoR;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int incVida) {
        this.vida *= incVida;
    }
    
    @Override
    public void setReg(int fase) {
        this.reg = fase;
    }

    @Override
    public String Status() {
        return "La estructura"+ nombre + "posee" + recursos+ "disponibles";
    }

    @Override
    public void Recolectar() {
        
    }

}
