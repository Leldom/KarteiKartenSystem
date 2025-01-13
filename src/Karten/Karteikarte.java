
package Karten;

public class Karteikarte {
    private String titel;
    private String beschreibung;
//    private int nummerierung;
   
    Karteikarte(String titel_, String beschreibung_){
        this.titel = titel;
        this.beschreibung = beschreibung;
//        this.nummerierung = nummerierung;
    }
    public String getTitel() {
        return titel;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
//    public int getNummerierung() {
//        return nummerierung;
//    }
}
