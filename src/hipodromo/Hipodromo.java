/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipodromo;

/**
 *
 * @author educacionit
 */
public class Hipodromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Meta meta = new Meta(500);
        Caballo tornado = new Caballo("Tornado",meta);
        Caballo duncan = new Caballo("Duncan", meta);
        Caballo corcelNegro = new Caballo("corcelNegro",meta);
        
        tornado.start();
        duncan.start();
        corcelNegro.start();
    }
    
}
