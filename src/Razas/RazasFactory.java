/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author Alex
 */
public class RazasFactory {

    public Razas SeleccionRaza(int tipo) {
        switch(tipo){
            case 1:
                return new Griegos();
            case 2:
                return new Ucanianos();
            case 3:
                return new Rusos();
        }
        return null;
    }
    
    
}
