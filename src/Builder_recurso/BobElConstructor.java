
package Builder_recurso;

public class BobElConstructor {
    private recursoBuilder rebuilder;
    
    public void setRecursoBuilder(recursoBuilder rB){
        rebuilder = rB;
    }
    
    public TorreR getTRecurso(){
        return rebuilder.getRecurso();
    }
    
    public void construirTorre(String tipo){
        rebuilder.buildTipoRecurso(tipo);
        rebuilder.buildVida();
    }
}
