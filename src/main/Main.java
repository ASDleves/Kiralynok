
package main;

import modell.Tábla;

public class Main {

   public static void main(String[] args) {
        Tábla tabla = new Tábla('#');
        
        System.out.println(tabla.Megjelenit());
        tabla.Elhelyez(8);
        System.out.println(tabla.Megjelenit());
    }
    
}
