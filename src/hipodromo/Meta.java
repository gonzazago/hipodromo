/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipodromo;

import java.util.ArrayList;

/**
 *
 * @author educacionit
 */
public class Meta {
     private Boolean cruzo;
    private Integer metros;
    private ArrayList<Caballo> llegaron = new ArrayList<Caballo>();

    public Integer getMetros() {
        return metros;
    }

    public Meta(Integer metros) {
        metros = metros;
    }
    
    
    public boolean cruzo(Caballo c){
    
        if(c.getMetrosRecorridos() >= metros){
            cruzo = true;
            llegaron.add(c);
             System.out.println(c.getName() + "cruzo la meta");
            
         }
        return cruzo;
    }

  
    
}
