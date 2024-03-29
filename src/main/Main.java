package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import modell.Tábla;

public class Main {

    public static void main(String[] args) throws IOException {
        Tábla tabla = new Tábla('#');
        System.out.println("4. feladat: Az üres tábla:");
        System.out.println(tabla.Megjelenit());

        tabla.Elhelyez(8);
        System.out.println("6. feladat: A feltöltött tábla:");
        System.out.println(tabla.Megjelenit());

        int oszlop = 3;
        int sor = 3;

        System.out.println("A(z) " + oszlop + ". oszlop üres-e: " + tabla.UresOszlop(oszlop));
        System.out.println("A(z) " + sor + ". sor üres-e: " + tabla.UresSor(sor));

        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + tabla.UresOszlopokSzama());
        System.out.println("Sorok: " + tabla.UresSorokSzama());
        tabla.Fajlbairas();

    }

    
}

