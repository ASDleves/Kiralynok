
package main;

import modell.Tábla;

public class Main {

   public static void main(String[] args) {
        Tábla tabla = new Tábla('#');
        System.out.println("4. feladat: Az üres tábla:");
        System.out.println(tabla.Megjelenit());
        tabla.Elhelyez(8);
        System.out.println("6. feladat: A feltöltött tábla:");
        System.out.println(tabla.Megjelenit());
        int oszlop = 3; 
        int sor = 3;   
        
        System.out.println("A(z)"+oszlop +". oszlop üres-e: "+ tabla.UresOszlop(oszlop));
        System.out.println("A(z)"+sor +". sor üres-e: " + tabla.UresSor(sor));
    }
    
}
