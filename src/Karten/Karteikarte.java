
package Karten;

import java.io.Serializable;

public class Karteikarte implements Serializable {
    private String titel;
    private String beschreibung;

    Karteikarte(String titel, String beschreibung){
        this.titel = titel;
        this.beschreibung = beschreibung;
    }
    public String getTitel() {
        return titel;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
}


