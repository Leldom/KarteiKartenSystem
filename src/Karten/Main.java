package Karten;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main start = new Main();
        start.checkInput();
    }
    void checkInput() {
        System.out.println("Herzlich Wilkommen. Moechtest du eine Karteikarte erstellen(e), oder abbrechen(q)?");
        System.out.println("e, q: ");
        
        Scanner scan = new Scanner(System.in);
        char c = scan.next().charAt(0);
        
            switch(c) { 
                case 'e'-> KartenAktion.erstelleKarte();
                case 'q'-> {System.out.print("Erstellung abgebrochen "); System.exit(0);} 
                default -> {
                   System.out.println("falscher Wert. Bitte neu eingeben: ");
                   checkInput();    
                }
            }
    }
}
