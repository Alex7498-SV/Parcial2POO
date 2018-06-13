
package General;

import Builder_Milicia.*;
import Builder_Vehiculo.*;
import Builder_recurso.*;
import Razas.*;
import java.util.ArrayList;
import java.util.Scanner;


public class usuario {
    
//Variables
    private String nombre;
    boolean flag = true;
    
//Instancia de los arreglos para los vehiculos, milicia, y torres
    private ArrayList<Vehiculo> arvehiculo = new ArrayList<Vehiculo>();
    private ArrayList<TorreR> artorres = new ArrayList<TorreR>();
    private ArrayList<Soldado> arsoldado = new ArrayList<Soldado>();
    
//Instancia de los objetos segun las clases a usar
    Scanner scn = new Scanner(System.in);
    abstractVehiculo aV = new abstractVehiculo();
    abstractTorre aT = new abstractTorre();
    abstractSoldado aS = new abstractSoldado();
    CentrodeMando cm = new CentrodeMando();
    RazasFactory rf = new RazasFactory();
    
    
    Razas raza;
//Funcion de seleccion de raza
    public Razas SelecRaza(int selec){
        raza = rf.SeleccionRaza(selec);
        return raza;
        
    }
    
 //Funciones de modificacion por raza
    public float getcambioVidapos(){
        return raza.valorIncrementoVida();
    }
    public float getcambioVidaneg(){
        return raza.valorDecrementoVida();
    }
    public float getcambioAtaquepos(){
        return raza.valorIncrementoAtaque();
    }
    public float getcambioAtaqueneg(){
        return raza.valorDecrementoAtaque();
    }
    public String getTipor1(){
        return raza.tiporecurso1();
    }
    public String getTipor2(){
        return raza.tiporecurso2();
    }
    public String getTipor3(){
        return raza.tiporecurso3();
    }
    
    public String getmarcav1(){
        return raza.tipovehiculo1();
    }
    public String getmarcav2(){
        return raza.tipovehiculo2();
    }
    public String getmarcav3(){
        return raza.tipovehiculo3();
    }
    
//Funciones de busqueda
    public TorreR buscarTorre(int indice){
        return artorres.get(indice);
    }
    
    public Soldado buscarSoldado(int indice){
        return arsoldado.get(indice);
    }
    
//Funciones para modificar el centro de mando
    public void restarVidaCM(int ataque){
        cm.setVida(cm.getVida()-ataque);
    }
    
    public void recolectarRecursosT1(String r){
        artorres.forEach(torre->{
            if(torre.getTipor().equals(r)){
                cm.setCantR1(cm.getCantR1()+ torre.getRecursos());
            }
        });
    }
    
    public void recolectarRecursosT2(String r){
        artorres.forEach(torre->{
            if(torre.getTipor().equals(r)){
                cm.setCantR1(cm.getCantR2()+ torre.getRecursos());
            }
        });
    }
    
    public void recolectarRecursosT3(String r){
        artorres.forEach(torre->{
            if(torre.getTipor().equals(r)){
                cm.setCantR1(cm.getCantR3()+ torre.getRecursos());
            }
        });
    }
    
    public void recolectarR1
    public void subirNivel(){
        if(cm.getNivel()==0){
            if(cm.getCantR1()>=cm.getCostoN1() && cm.getCantR2()>=cm.getCostoN1() && cm.getCantR3()>=cm.getCostoN1()){
                cm.setCantR1(cm.getCantR1()-cm.getCostoN1());
                cm.setCantR2(cm.getCantR2()-cm.getCostoN1());
                cm.setCantR3(cm.getCantR3()-cm.getCostoN1());
                cm.setMaxcantR1((int) (cm.getMaxcantR1()+(cm.getMaxcantR1()*cm.getIncrementoN1())));
                cm.setMaxcantR2((int) (cm.getMaxcantR2()+(cm.getMaxcantR2()*cm.getIncrementoN1())));
                cm.setMaxcantR3((int) (cm.getMaxcantR3()+(cm.getMaxcantR3()*cm.getIncrementoN1())));
            }else System.out.println("No posees los recursos suficientes");
        }
        else{
            if(cm.getNivel()==1){
                if(cm.getCantR1()>=cm.getCostoN2() && cm.getCantR2()>=cm.getCostoN2() && cm.getCantR3()>=cm.getCostoN2()){
                    cm.setCantR1(cm.getCantR1()-cm.getCostoN2());
                    cm.setCantR2(cm.getCantR2()-cm.getCostoN2());
                    cm.setCantR3(cm.getCantR3()-cm.getCostoN2());
                    cm.setMaxcantR1((int) (cm.getMaxcantR1()+(cm.getMaxcantR1()*cm.getIncrementoN2())));
                    cm.setMaxcantR2((int) (cm.getMaxcantR2()+(cm.getMaxcantR2()*cm.getIncrementoN2())));
                    cm.setMaxcantR3((int) (cm.getMaxcantR3()+(cm.getMaxcantR3()*cm.getIncrementoN2())));
                }else System.out.println("No posees los recursos suficientes");
            }
            else{
                if(cm.getNivel()==2){
                    if(cm.getCantR1()>=cm.getCostoN3() && cm.getCantR2()>=cm.getCostoN3() && cm.getCantR3()>=cm.getCostoN3()){
                        cm.setCantR1(cm.getCantR1()-cm.getCostoN3());
                        cm.setCantR2(cm.getCantR2()-cm.getCostoN3());
                        cm.setCantR3(cm.getCantR3()-cm.getCostoN3());
                        cm.setMaxcantR1((int) (cm.getMaxcantR1()+(cm.getMaxcantR1()*cm.getIncrementoN3())));
                        cm.setMaxcantR2((int) (cm.getMaxcantR2()+(cm.getMaxcantR2()*cm.getIncrementoN3())));
                        cm.setMaxcantR3((int) (cm.getMaxcantR3()+(cm.getMaxcantR3()*cm.getIncrementoN3())));
                    }else System.out.println("No posees los recursos suficientes");
                }
                else{
                    System.out.println("El centro de mando se encuentra al maximo");
                }
            }
        }
    }
    
//Funciones para agregar nuevos recursos, vehiculos o milicia    
    public void crearNuevaMilicia(int tipo,String nombre, float modVid, float modAtaque){
        arsoldado.add(aS.getSoldado(tipo, nombre, modVid, modAtaque));
    }
    
    public void crearNuevoVehiculo(int tipo, String nombre, String type){
        arvehiculo.add(aV.getVehiculo(tipo, nombre, type));
    }
    
    public void crearNuevaTorre(int tipo, String nombre, String type){
        artorres.add(aT.getNuevaTorre(tipo, nombre, type));
    }
    
//funciones de ataque
    public TorreR ataqueMiliciaTorre(int indiceM, TorreR torre){
        Soldado s = arsoldado.get(indiceM);
        torre.setVida(torre.getVida() - s.getAtaque() );
        return torre;
    }
    
    public TorreR ataqueVehiculoTorre(int indiceT, TorreR torre){
        Vehiculo v = arvehiculo.get(indiceT);
        torre.setVida(torre.getVida() - v.getAtaque());
        return torre;
    }
    
    public Soldado ataqueMiliciaMilicia(int indiceS, Soldado soldado){
        Soldado s = arsoldado.get(indiceS);
        soldado.setVida(soldado.getVida() - s.getAtaque());
        return soldado;
    }

    
//Funciones para mostrar mostrar los recursos disponibles
    
    public void mostrarTorres(){
        this.artorres.forEach(torres->{
            System.out.println("------------------------------");
            System.out.println("Mostrar detalles de la torre:");
            System.out.println(torres.getTipor());
            System.out.println(torres.getNombreTorre());
            System.out.println(torres.getVida());
            System.out.println("------------------------------");
        });
    }
    public void mostrarTorresAtacadas(){
        this.artorres.forEach(torres->{
            if(torres.isAtaque()== true){
                System.out.println("------------------------------");
                System.out.println("Mostrar detalles de la torre:");
                System.out.println(torres.getTipor());
                System.out.println(torres.getNombreTorre());
                System.out.println(torres.getVida());
                System.out.println("------------------------------");
                
            }
        });
    }
    
    public void mostrarVehiculos(){
        this.arvehiculo.forEach((Vehiculo vehiculo)->{
            System.out.println("------------------------------");
            System.out.println("Mostrar detalles del vehiculo:");
            System.out.println(vehiculo.getNombre());
            System.out.println(vehiculo.getAtaque());
            System.out.println("------------------------------");
        });
    }
    
     public void mostrarMilicia(){
        this.arsoldado.forEach(soldado->{
            System.out.println("------------------------------");
            System.out.println("Mostrar detalles del soldado:");
            System.out.println(soldado.getNombre());
            System.out.println(soldado.getAtaque());
            System.out.println(soldado.getVida());
            System.out.println("------------------------------");
        });
    }
     public void mostrarMiliciaAtacando(){
        this.arsoldado.forEach(soldado->{
            if(soldado.isAtacando() == true){
                System.out.println("------------------------------");
                System.out.println("Mostrar detalles del soldado:");
                System.out.println(soldado.getNombre());
                System.out.println(soldado.getAtaque());
                System.out.println(soldado.getVida());
                System.out.println("------------------------------");
            }
        });
     }
//Funciones propias de Usuario
    public usuario(){}

    public String getNombre() {
        return this.nombre;
    }
    
    public void pedirNombre(){
        while(flag){
            //nombre = scn.nextLine();
            if(setNombre(scn.nextLine())){
                flag = false;
            }else{
                System.out.println("Nombre invalido, intenta de nuevo");

            }
        }
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
