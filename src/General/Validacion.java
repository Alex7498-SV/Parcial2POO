/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

/**
 *
 * @author Alex
 */
public class Validacion {
    
    public int Verificar_numero(String num){
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException excepcion) {
            return 0;
        }
    }
}
