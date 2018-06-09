/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Builder_recurso;

/**
 *
 * @author alex
 */
public abstract class recursoBuilder {
    protected TorreR recurso;
    
    public TorreR getRecurso(){
        return recurso;
    }

    public abstract void buildTipoRecurso(String tipo);
    public abstract void buildVida();


    
    

}
