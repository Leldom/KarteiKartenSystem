package Karten;

import java.util.List;
import java.util.Scanner;

public class KartenAktion {

    static List<Karteikarte> speicher;

    public static void weitereOptionen(){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nWillst du die Karten auflisten(a), eine weitere karte hinzufuegen(e), eine Karte loeschen(d), eine Karte lesen(l)");
        System.out.print("\noder verlassen(q): ");
        char c = scan.next().charAt(0);

        switch(c) {
            case 'e'-> erstelleKarte();
            case 'a'-> auflisten(speicher);
            case 'd'-> loescheKarte(speicher);
            case 'l'-> leseKarte();
            case 'q'-> {System.out.println("beende Program, Karten werden gespeichert");
                Kartenspeicher.kartenSpeicher(speicher);
                System.exit(0);}
            default -> {System.out.println("Ungueltiger Wert. Bitte neu eingeben: "); weitereOptionen();}
        }
    }
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
    public static void loescheKarte(List<Karteikarte> speicher) {
        System.out.print("Gib bitte den Titel der Karte an: ");
        Scanner scan = new Scanner(System.in);
        String titel = scan.next();

        for(Karteikarte speicher1 : speicher) {
            if(speicher1.getTitel().equals(titel)) {
                speicher.remove(speicher1);
                weitereOptionen();
            } else {
                System.out.println("Titel nicht gefunden!");
                weitereOptionen();
            }
        }
    }
    public static void leseKarte() {
        System.out.print("Gib bitte den Titel der Karte an: ");
        Scanner scan = new Scanner(System.in);
        String titel = scan.nextLine();

        for(Karteikarte speicher1 : speicher) {
            if(speicher1.getTitel().equals(titel)) {
                System.out.println();
                System.out.println("Titel: " + speicher1.getTitel() + " \nBeschreibung: \n" + speicher1.getBeschreibung());
                weitereOptionen();
            } else {
                System.out.println("Titel nicht gefunden!");
                weitereOptionen();
            }
        }
    }
    public static void speicherKarte(Karteikarte karte) {
        speicher.add(karte);
    }
    public static void auflisten(List<Karteikarte> speicher) {
        int i = 1;
        for (Karteikarte speicher1 : speicher) {
            System.out.println("\n" + i + ": Titel: " + speicher1.getTitel());
            i++;
            if(speicher.isEmpty()) {
                System.out.println("Keine Eintraege vorhanden!");
            }
        }
        weitereOptionen();
    }
}


