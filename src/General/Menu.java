/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import Builder_Milicia.Soldado;
import Builder_recurso.TorreR;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Menu {
    
    Instrucciones_U ins = new Instrucciones_U();
    Validacion v = new Validacion();
    Scanner scn = new Scanner(System.in);
    
    public boolean MenuPrincipal(usuario u, usuario u1){
        ins.Menu();
        System.out.println("Seleccione una opcion:");
        int op = v.Verificar_numero(scn.nextLine());
        if(op != -1){
            switch(op){
                case 1:
                    u.mostrarTorres();
                    u.mostrarMilicia();
                    u.mostrarVehiculos();
                    op = 0;
                    MenuPrincipal(u,u1);
                case 2:
                    MenuSelecciondeTorre(u);
                    op = 0;
                    MenuPrincipal(u, u1);
                case 3:
                    MenuSelecciondeVehiculo(u);
                    op = 0;
                    MenuPrincipal(u, u1);
                case 4:
                    MenuSelecciondeMilicia(u);
                    op = 0;
                    MenuPrincipal(u, u1);
                case 5:
                    MenuAtaque(u, u1);
                    op = 0;
                    MenuPrincipal(u, u1);
                case 6:
                    MenuRecoleccion(u);
                case 7:
                    op = -1;
            }
        }
        return false;
        
    }
    
    public int MenuPrincipalIterativo(usuario u, usuario u1, int turno){

        int op = 0;
        while(op!= 7){
            ins.Menu();
            op = v.Verificar_numero(scn.nextLine());
            switch(op){
                case 1:
                    u.mostrarTorres();
                    u.mostrarMilicia();
                    u.mostrarVehiculos();
//                    turno = 0;
//                    op = 0;
                    break;
                case 2:
                    MenuSelecciondeTorre(u);
//                    turno = 0;
//                    op = 0;
                    break;
                case 3:
                    MenuSelecciondeVehiculo(u);
//                    turno = 0;
//                    op = 0;
                    break;
                case 4:
                    MenuSelecciondeMilicia(u);
//                    turno = 0;
//                    op = 0;
                    break;
                case 5:
                    MenuAtaque(u, u1);
//                    turno = 0;
                    
                    break;
                case 6:
                default:
                    System.out.println("Dato erroneo, intenta de nuevo");
                    break;
            }
        }return turno = 1;
    }
    
    public void MenuRecoleccion(usuario u){
        ins.SeleccionRecurso();
        int selec = 0;
        while(selec<1 || selec>3){
            switch(selec){
                case 1:
                    System.out.println("Recolectando los recursos de las edificaciones de tipo 1");
                    u.recolectarRecursosT1(1);
                case 2:
                    System.out.println("Recolectando los recursos de las edificaciones de tipo 2");
                    u.recolectarRecursosT1(2);
                case 3:
                    System.out.println("Recolectando los recursos de las edificaciones de tipo 3");
                    u.recolectarRecursosT1(3);
            }
        }
    }
    
    public void MenuAtaque(usuario u, usuario u1){
        ins.SeleccionAtaque();
        int ataque1 =0;
        int ataque2 =0;
        int ataque3 =0;
        ataque1 = v.Verificar_numero(scn.nextLine());
        while (ataque1 < 1 || ataque1 > 2){
            switch(ataque1){
                case 1:
                    ins.SAtaqueTorre();
                    ataque2 = v.Verificar_numero(scn.nextLine());
                    while (ataque2<1 || ataque2>2){
                        switch(ataque2){
                            case 1:
                                System.out.println("Mostrando torres del enemigo..........");
                                u1.mostrarTorres();
                                System.out.println("Que torre quieres atacar?");
                                TorreR torrem = u1.buscarTorre(v.Verificar_numero(scn.nextLine()));
                                torrem.setAtaque(true);
                                System.out.println("Mostrando tus soldados................");
                                u.mostrarMilicia();
                                System.out.println("A quien quieres mandar a atacar?");
                                u.ataqueMiliciaTorre(v.Verificar_numero(scn.nextLine()), torrem);
                                System.out.println("Ejecutando ataque");
                            case 2:
                                System.out.println("Mostrando torres del enemigo..........");
                                u1.mostrarTorres();
                                System.out.println("Que torre quieres atacar?");
                                TorreR torrev = u1.buscarTorre(v.Verificar_numero(scn.nextLine()));
                                torrev.setAtaque(true);
                                System.out.println("Mostrando tus vehiculos................");
                                u.mostrarVehiculos();
                                System.out.println("A quien quieres mandar a atacar?");
                                u.ataqueVehiculoTorre(v.Verificar_numero(scn.nextLine()), torrev);
                                System.out.println("Ejecutando ataque");
                        }
                    }
                case 2:
                    System.out.println("Mostrando torres bajo ataque..........");
                    u1.mostrarTorresAtacadas();
                    System.out.println("Mostrando los enemigos cercanos.......");
                    u.mostrarMiliciaAtacando();
                    System.out.println("Selecciona los enemigos que quieres atacar:");
                    ataque3 = v.Verificar_numero(scn.nextLine());
                    Soldado soldadito = u1.buscarSoldado(ataque3);
                    System.out.println("Mostrando tus soldados.....................");
                    System.out.println("A quien quieres enviar");
                    u.ataqueMiliciaMilicia(v.Verificar_numero(scn.nextLine()), soldadito);
                    System.out.println("Ejecutando ataque...............");
                    
                    
           }
        }
    }
    
    public void MenuSelecciondeRaza(usuario u){
        ins.SeleccionRaza();
        int raza = 0;
        while(raza < 1 || raza >3){
            raza = v.Verificar_numero(scn.nextLine());
            break;
        }
        u.SelecRaza(raza);
    }
    public void MenuSelecciondeTorre(usuario u){
        int op = 0;
        while (op<1 || op>3){
            ins.SeleccionTorre();
            op = v.Verificar_numero(scn.nextLine());
            String nombret = "";
            switch(op){
                case 1:
                    System.out.println("Nombra tu nueva torre!");
                    nombret = scn.nextLine();
                    u.crearNuevaTorre(1, nombret, u.getTipor1());
                    break;
                case 2:
                    System.out.println("Nombra tu nueva torre!");
                    nombret = scn.nextLine();
                    u.crearNuevaTorre(2, nombret, u.getTipor2());
                    break;
                case 3:
                    System.out.println("Nombra tu nueva torre!");
                    nombret = scn.nextLine();
                    u.crearNuevaTorre(3, nombret, u.getTipor3());
                    break;
                default:
                    op = 0;
                    break;
            } 
            break;
        }
        
    }
    public void MenuSelecciondeMilicia(usuario u){
       int op = 0;
        while (op<1 || op>2){
            ins.SeleccionMilicia();
            op = v.Verificar_numero(scn.nextLine());
            String nombret = "";
            switch(op){
                case 1:
                    System.out.println("Nombra tu nuevo Soldado!");
                    nombret = scn.nextLine();
                    u.crearNuevaMilicia(1, nombret, u.getcambioVidapos(), u.getcambioAtaquepos());
                    break;
                case 2:
                    System.out.println("Nombra tu nuevo SuperSoldado!");
                    nombret = scn.nextLine();
                    u.crearNuevaMilicia(2, nombret, u.getcambioVidapos(), u.getcambioAtaquepos());
                    break;

                default:
                    op = 0;
                    break;
            } 
            break;
        }
    
    }
    public void MenuSelecciondeVehiculo(usuario u){
        int op = 0;
        while (op<1 || op>3){
            ins.SeleccionVehiculo();
            op = v.Verificar_numero(scn.nextLine());
            String nombret = "";
            switch(op){
                case 1:
                    System.out.println("Nombra tu nuevo vehiculo!");
                    nombret = scn.nextLine();
                    u.crearNuevoVehiculo(1, nombret,u.getmarcav1());
                    break;
                case 2:
                    System.out.println("Nombra tu nuevo vehiculo!");
                    nombret = scn.nextLine();
                    u.crearNuevaTorre(2, nombret, u.getmarcav2());
                    break;
                case 3:
                    System.out.println("Nombra tu nuevo vehiculo!");
                    nombret = scn.nextLine();
                    u.crearNuevaTorre(3, nombret, u.getmarcav3());
                    break;

                default:
                    op = 0;
                    break;
            } 
            break;
        }
    }
}
