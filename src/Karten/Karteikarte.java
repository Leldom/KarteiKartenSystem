
package Karten;

public class Karteikarte {
    private String titel;
    private String beschreibung;
    private int id;
   
    Karteikarte(String titel, String beschreibung, int id){
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.id = id;
    }
    public String getTitel() {
        return titel;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
    public int getId() {
        return id;
    }
}
