package Karten;

import java.util.Scanner;

public class KartenAktion{
    public static void erstelleKarte() {
        Scanner scan = new Scanner(System.in);
        
        String titel = scan.nextLine();
        String beschreibung = scan.nextLine();
        
        
        Karteikarte karte = new Karteikarte(titel, beschreibung, nummerierung);
    }
    public static void loescheKarte() {
        
    }
    public static void leseKarte() {
        
    }
    public static void speicherKarte() {
        Karteikarte[] karteinSpeicher = new Karteikarte[0];
    }
}