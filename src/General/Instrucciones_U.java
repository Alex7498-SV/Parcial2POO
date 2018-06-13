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
public class Instrucciones_U {
    public void Inicio(){
        System.out.println("Bienvenido a RubenSiguenza's World");
        System.out.println("Indicaciones del juego:");
        System.out.println("1-Escoge una raza pa poder comenzar.");
        System.out.println("2-Para ganar debes destruir todos los objetos de tu enemigo,");
        System.out.println("cada objeto que coloques sobre la arena tiene una vida y una cantidad de ataque");
        System.out.println("usa eso a tu favor y coloca las piezas de forma estrategica");
        System.out.println("3-Cada objeto que coloques tardara tiempo en construirse y trasladarse en algunos");
        System.out.println("casos, toma eso muy en cuenta");
        System.out.println("4-Solo puedes atacar el centro de mando cuando destruyas todos los objetos de tu enemigo");
        System.out.println("5-Si tu centro de mando se ve atacado puedes construir cualquier cosa para desviar la");
        System.out.println("atencion de tu enemigo, ten en cuenta el punto 3");
        System.out.println("6-Tus vehiculos seran de un solo uso y solo sirven para atacar.");
        System.out.println("7-A jugar!!!");
        System.out.println("");
    }
    public void Menu(){
        System.out.println("1-Mostrar mis recursos");
        System.out.println("2-Crear una nueva torre");
        System.out.println("3-Crear un nuevo vehiculo");
        System.out.println("4-Crear un nuevo soldado");
        System.out.println("5-Atacar");
        System.out.println("6-Recolectar recursos");
        System.out.println("7-Finalizar turno");
    }

    public void SeleccionRaza(){
        System.out.println("Antes de empezar debes seleccionar una raza, cada raza");
        System.out.println("tiene sus pro  y contras, te daras cuenta en el camino.");
        System.out.println("1-Griegos");
        System.out.println("2-Ucanianos");
        System.out.println("3-Rusos");
        System.out.println("Escoge una:");
    }

    public void SeleccionTorre(){
        System.out.println("Escoge un tipo de torre a crear");
        System.out.println("1-Torre productora de recurso 1");
        System.out.println("2-Torre productora de recurso 2");
        System.out.println("3-Torre productora de recurso 3");
        System.out.println("4-Para cancelar");
    }
    public void SeleccionVehiculo(){
        System.out.println("Escoge un tipo de vehiculo a crear");
        System.out.println("1-Vehiculo 1");
        System.out.println("2-Maquina de la muerte 2");
        System.out.println("3-Para cancelar");
    }
    public void SeleccionMilicia(){
        System.out.println("Escoge un tipo de torre a crear");
        System.out.println("1-Soldado normal");
        System.out.println("2-Super soldado tipo rambo");
        System.out.println("3-Para cancelar");
    }
    public void SeleccionAtaque(){
        System.out.println("Escoge un tipo de ataque:");
        System.out.println("1-Atacar una torre");
        System.out.println("2-Defender una torre");
    }
    public void SAtaqueTorre(){
        System.out.println("Como deseas atacar la torre:");
        System.out.println("1-Atacar con Soldados");
        System.out.println("2-Atacar con Vehiculo");
    }
    
    public void SeleccionRecurso(){
        System.out.println("Puedes recolectar cualquiera de los tres recursos:");
        System.out.println("1-Recolectar recursos de las torres de recurso 1");
        System.out.println("2-Recolectar recursos de las torres de recurso 2");
        System.out.println("3-Recolectar recursos de las torres de recurso 3");
        System.out.println("Selecciona una:");
    }
}    
