package Karten;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main start = new Main();
        start.checkInput();
    }
    void checkInput() {
        System.out.println("Herzlich Wilkommen. Möchtest du eine Karteikarte erstellen(e), löschen(d) oder lesen(l)?");
        System.out.println("e, d, l: ");
        
        Scanner scan = new Scanner(System.in, "Windows-1252");
        char c = scan.next().charAt(0);
        
            switch(c) {
//                case 'e'-> erstelleKarte();
//                case 'd'-> loescheKarte();
//                case 'l'-> leseKarte();
                default -> {
                   System.out.println("falscher Wert. Bitte neu eingeben: ");
                    checkInput();    
                }
            }
    }
}
