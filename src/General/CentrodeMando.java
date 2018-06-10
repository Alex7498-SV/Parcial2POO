
package General;

public class CentrodeMando {
    private int vida = 1000;
    private int cantR1 = 0;
    private int cantR2 = 0;
    private int cantR3 = 0;
    private int maxcantR1 = 10000;
    private int maxcantR2 = 5000;
    private int maxcantR3 = 3000;
    private int nivel = 0;
    private final float incrementoN1 = (float) 0.1;
    private final float incrementoN2 = (float) 0.3;
    private final float incrementoN3 = (float) 0.5;
    private final int costoN1 = 1650;
    private final int costoN2 = 4620;
    private final int costoN3 = 6930;

    public float getIncrementoN1() {
        return incrementoN1;
    }

    public float getIncrementoN2() {
        return incrementoN2;
    }

    public float getIncrementoN3() {
        return incrementoN3;
    }

    
    
    public int getMaxcantR1() {
        return maxcantR1;
    }

    public void setMaxcantR1(int maxcantR1) {
        this.maxcantR1 = maxcantR1;
    }

    public int getMaxcantR2() {
        return maxcantR2;
    }

    public void setMaxcantR2(int maxcantR2) {
        this.maxcantR2 = maxcantR2;
    }

    public int getMaxcantR3() {
        return maxcantR3;
    }

    public void setMaxcantR3(int maxcantR3) {
        this.maxcantR3 = maxcantR3;
    }

    public int getCostoN1() {
        return costoN1;
    }

    public int getCostoN2() {
        return costoN2;
    }

    public int getCostoN3() {
        return costoN3;
    }
    
    
    public void mostrarCentrodeMando() {
        getVida();
        getNivel();
        getCantR1();
        getCantR2();
        getCantR3();
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCantR1() {
        return cantR1;
    }

    public void setCantR1(int cantR1) {
        this.cantR1 = cantR1;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getCantR2() {
        return cantR2;
    }

    public void setCantR2(int cantR2) {
        this.cantR2 = cantR2;
    }

    public int getCantR3() {
        return cantR3;
    }

    public void setCantR3(int cantR3) {
        this.cantR3 = cantR3;
    }
    
}
