/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Jugar {
    public void play(){
        String User1 = "";
        String User2 = "";
        int fase = 0;
        int turno = 0;
        
        boolean play = true;    
        
        Scanner scn = new Scanner(System.in);
        usuario us1 = new usuario();
        usuario us2 = new usuario();
        Instrucciones_U ins = new Instrucciones_U();
        Menu m = new Menu();
        Validacion v = new Validacion();


        
        ins.Inicio();
        
        System.out.println("usuario 1 ingresa tu nombre:");
        us1.pedirNombre();
        User1 = us1.getNombre();
        System.out.println("usuario 2 ingresa tu nombre:");
        us2.pedirNombre();
        User2 = us2.getNombre();
        System.out.println("_________________________________________________");
        System.out.println(User1);
        m.MenuSelecciondeRaza(us1);
        System.out.println("Raza seleccionada");
        System.out.println(User2);
        m.MenuSelecciondeRaza(us2);
        System.out.println("Raza seleccionada");
        System.out.println("-------------------------------------------------");

        while(play){
            if (turno == 0){
                System.out.println("_____________________________________________");
                System.out.println("Tu turno "+ User1);
                turno = m.MenuPrincipalIterativo(us1, us2, turno);
                System.out.println("_____________________________________________");
            }
                    
            else{
                if (turno == 1){
                    System.out.println("_____________________________________________");
                    System.out.println("Tu turno "+ User2);
                    turno = m.MenuPrincipalIterativo(us2, us1, turno);
                    System.out.println("_____________________________________________");
                }
                
            }
                   
        }
    }
    
}
