/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package General;

/**
 *
 * @author alex
 */
public class usuario {
    
    private String nombre;

    public usuario(){}

    public String getNombre() {
        return this.nombre;
    }

    public boolean setNombre(String nombre) {
        if(Validar(nombre)){
            this.nombre = nombre;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean Validar(String username){
        char usrname;
        if (username.length()>2 && username.length()<9){
            for (int i = 0; i<username.length(); i++){
                usrname = username.charAt(i);
                if(!(Character.isAlphabetic(usrname) || Character.isDigit(usrname))){
                    return false;
                }
            }
        } else {
            return false;
        }
        
        return true;
    }
}
