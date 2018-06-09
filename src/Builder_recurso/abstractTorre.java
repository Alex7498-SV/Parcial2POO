
package Builder_recurso;

public class abstractTorre {
    
    public TorreR getNuevaTorre(int tipo , String nombre){
        BobElConstructor bob = new BobElConstructor();
        Recurso1 r1 = new Recurso1();
        Recurso2 r2 = new Recurso2();
        Recurso3 r3 = new Recurso3();
        
        switch(tipo){
            case 1:
                bob.setRecursoBuilder(r1);
                bob.construirTorre(nombre);
                return bob.getTRecurso();
            case 2:
                bob.setRecursoBuilder(r2);
                bob.construirTorre(nombre);
                return bob.getTRecurso();
            case 3:
                bob.setRecursoBuilder(r3);
                bob.construirTorre(nombre);
                return bob.getTRecurso();
        }
        return null;
    }
    
}
