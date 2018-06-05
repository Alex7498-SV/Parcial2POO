
package Clases.Soldado;

import Interfaces.Soldados;

public class Soldado implements Soldados{
    private int vida = 50;
    private int ataque = 50;
    private String nombre= "";

    public Soldado(String nombre, int incrementoVida, int incrementoAtac) {
        setNombre(nombre);
        setVida(incrementoVida);
        setAtaque(incrementoAtac);
    }
   
    @Override
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void setVida(int incre_vida) {
        if (incre_vida <= 3) {
        this.vida*=incre_vida;
        }else
            System.out.println("El valor de incremento no puede ser mayor a 2");
    }
    
     @Override
    public void setAtaque(int incre_atac) {
        if (incre_atac <= 3) {
        this.ataque *=incre_atac;
        }else
            System.out.println("El valor de incremento no puede ser mayor a 2");
    }
    
    
    @Override
    public void Atacar() {
        
    }

}