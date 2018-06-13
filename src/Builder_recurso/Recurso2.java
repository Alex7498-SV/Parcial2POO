/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Builder_recurso;

public class Recurso2 extends recursoBuilder{
    
    public Recurso2() {
        super.recurso = new TorreR();
    }
    
    @Override
    public void buildNombreTorre(String tipo) {
        recurso.setTipoR(tipo);
    }

    @Override
    public void buildVida() {
        recurso.setVida(50);
    }
        
    public void buildTipoRecurso(String tipo){
        recurso.setTipoR(tipo);
    }
}
