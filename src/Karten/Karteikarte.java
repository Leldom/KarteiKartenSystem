
package Karten;

public class Karteikarte {
    private String titel;
    private String beschreibung;
   
    Karteikarte(String titel, String beschreibung){
        this.titel = titel;
        this.beschreibung = beschreibung;
    }
    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    
    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}
