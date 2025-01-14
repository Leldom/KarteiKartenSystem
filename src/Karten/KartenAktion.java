package Karten;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KartenAktion{
    static List<Karteikarte> speicher = new ArrayList<>();
    public static void erstelleKarte() {
        String titel;
        String beschreibung;
        Scanner scan = new Scanner(System.in);
        System.out.print("Titel der Karte: ");
        titel = scan.nextLine();
        System.out.print("\nBeschreibung der Karte: ");
        beschreibung = scan.nextLine();
        Karteikarte karte = new Karteikarte(titel, beschreibung);
        
        speicherKarte(karte);
        if(!speicher.isEmpty()) {
            weitereOptionen();
        }
    }
    public static void weitereOptionen(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Willst du die Karten auflisten(a), eine Karte löschen(d), oder eine Karte lesen(l)?");
        char c = scan.next().charAt(0);
        System.out.println(c);
        
        switch(c) {
            case 'a'-> auflisten(speicher);
            default -> {
                System.out.println("ungültige eingabe");
            }
        }
    }
    public static void loescheKarte() {
        //ID durchlaufen lassen mit Schleife
    }
    public static void leseKarte() {
        //Ähnlic wie bei auflisten aber mit Beschreibung dazu
    }
    public static void speicherKarte(Karteikarte karte) {
        speicher.add(karte);
    }
    public static void auflisten(List<Karteikarte> speicher) {
        for (Karteikarte speicher1 : speicher) {
            System.out.println("id: null " + "Titel: " + speicher1.getTitel());
        }
    }
}
