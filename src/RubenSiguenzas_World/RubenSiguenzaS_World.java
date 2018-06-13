
package RubenSiguenzas_World;


import General.*;
import java.util.Scanner;



public class RubenSiguenzaS_World {

    public static void main(String[] args) {
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
                System.out.println("Tu turno "+ User1);
                m.MenuPrincipal(us1, us2);
            }
                    
            else{
                System.out.println("Tu turno "+ User1);
                ins.Menu(); 
                scn.nextLine();
                turno = 0;
                
                }
            }       
        }
    }


    