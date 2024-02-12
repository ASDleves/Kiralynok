package modell;

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
}

