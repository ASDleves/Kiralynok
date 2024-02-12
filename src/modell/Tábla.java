package modell;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Tábla {

    private char[][] T;
    private char UresCella;

    public Tábla(char uresCella) {
        T = new char[8][8];
        UresCella = uresCella;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                T[i][j] = UresCella;
            }
        }
    }
    public void Alaphelyzetbe() {
    for (int i = 0; i < T.length; i++) {
        for (int j = 0; j < T[i].length; j++) {
            T[i][j] = UresCella;
        }
    }
}

    public void Elhelyez(int N) {
        Random rand = new Random();
        int kiralynokszama = 0;

        while (kiralynokszama < N) {
            int i = rand.nextInt(T.length);
            int j = rand.nextInt(T[i].length);

            if (T[i][j] == UresCella) {
                T[i][j] = 'K';
                kiralynokszama++;
            }
        }
    }

    public String Megjelenit() {
        String szöveg = "";
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                szöveg += T[i][j] + " ";
            }
            szöveg += "\n";
        }
        return szöveg;
    }

    public boolean UresOszlop(int oszlop) {
        for (int i = 0; i < T.length; i++) {
            if (T[i][oszlop] == 'K') {
                return false;
            }
        }
        return true;
    }

    public boolean UresSor(int sor) {
        for (char c : T[sor]) {
            if (c == 'K') {
                return false;
            }
        }
        return true;
    }

    public int UresOszlopokSzama() {
        int uresOszlop = 0;

        for (int j = 0; j < T[0].length; j++) {
            boolean isEmpty = true;
            for (int i = 0; isEmpty && i < T.length; i++) {
                if (T[i][j] == 'K') {
                    isEmpty = false;
                }
            }
            if (isEmpty) {
                uresOszlop++;
            }
        }

        return uresOszlop;
    }

    public int UresSorokSzama() {
        int uresSor = 0;

        for (int i = 0; i < T.length; i++) {
            boolean isEmpty = true;
            for (int j = 0; isEmpty && j < T[i].length; j++) {
                if (T[i][j] == 'K') {
                    isEmpty = false;
                }
            }
            if (isEmpty) {
                uresSor++;
            }
        }

        return uresSor;
    }
    public void Fajlbairas() throws IOException {
        String fajlnev = "tablake64.txt";
        File file = new File(fajlnev);

        if (file.exists()) {
            file.delete();
        }

        FileWriter fajlbaIras = new FileWriter(file);

        for (int n = 1; n < 65; n++) {
            Tábla tablaFajl = new Tábla('*');
            tablaFajl.Elhelyez(n);

            fajlbaIras.write(tablaFajl.Megjelenit());
            fajlbaIras.write("\n\n");
        }

        fajlbaIras.close();
    }
    
}
