package Karten;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Kartenspeicher {
    public static void kartenSpeicher(List<Karteikarte> speicher) {
        Karteikarte[] tmp = new Karteikarte[speicher.size()];
        for (int i = 0; i < speicher.size(); i++) {
            tmp[i] = speicher.get(i);
        }
        try(FileOutputStream fos = new FileOutputStream("cardsave.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            for (Karteikarte karteikarte : tmp) {
                oos.writeObject(karteikarte);
            }
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException occurred");
        }
    }
    public static List<Karteikarte> leseKarten() {
        List<Karteikarte> speicher = new ArrayList<>();
        try(FileInputStream fis = new FileInputStream("cardsave.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis)) {
            while(true) {
                try {
                    Karteikarte karte = (Karteikarte) ois.readObject();
                    speicher.add(karte);
                } catch (EOFException e) {
                    break;
                }
            }
        }catch(FileNotFoundException e) {
            System.out.println("Erstelle neue Liste");
            return speicher;
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("IOException occurred or class not found");
        }
        return speicher;
    }
}



