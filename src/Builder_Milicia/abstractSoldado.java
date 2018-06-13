
package Builder_Milicia;

public class abstractSoldado {
    
    public Soldado getSoldado(int tipo , String nombre, float modVida, float modAtaque){
        FAUCA entrenador = new FAUCA();
        SoldadoNormal sn = new SoldadoNormal();
        SuperSoldado ss = new SuperSoldado();
        
        switch(tipo){
            case 1:
                entrenador.setSoldadoBuilder(sn);
                entrenador.entrenarSoldado(nombre, modVida, modAtaque);
                return entrenador.getSoldado();
            case 2:
                entrenador.setSoldadoBuilder(ss);
                entrenador.entrenarSoldado(nombre, modVida,modAtaque);
                return entrenador.getSoldado();
        }
        return null;
    }

}
