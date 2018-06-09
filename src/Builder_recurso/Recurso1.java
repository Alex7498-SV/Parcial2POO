/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Builder_recurso;

public class Recurso1 extends recursoBuilder{

    public Recurso1() {
        super.recurso = new TorreR();
    }
    
    @Override
    public void buildTipoRecurso(String tipo) {
        recurso.setTipoR(tipo);
    }

    @Override
    public void buildVida() {
        recurso.setVida(50);
    }

}