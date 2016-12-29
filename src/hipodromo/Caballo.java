/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipodromo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author educacionit
 */
public class Caballo extends Thread{
    
    static Integer RETARDO = 100;
    private String nombre;
    private Integer metrosRecorridos;
    private Meta meta;
    private Boolean finalizado = false;
    
    public Caballo(String nombre, Meta meta){
        this.nombre = nombre;
        this.meta = meta;
    }
    
    @Override
    public void run(){
        
        while(!meta.cruzo(this)){
            
            try {
                sleep(RETARDO);
            } catch (InterruptedException ex) {
                Logger.getLogger(Caballo.class.getName()).log(Level.SEVERE, null, ex);
            }
            avanzar();  
        }
        finalizado = true;
            
               
        }
       

    public  void avanzar(){        
        int incremento = 0;
        while(incremento == (0)){
            incremento = (int)((Math.random() * 10) +(Math.random() * 10));
        }
        metrosRecorridos+=incremento;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getMetrosRecorridos() {
        return metrosRecorridos;
    }
    
}
