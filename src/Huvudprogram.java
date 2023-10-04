import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {
        Kaktusar Igge = new Kaktusar("Igge", 0.2);
        Palmer Laura = new Palmer("Laura", 5);
        KöttätandeVäxter Meatloaf = new KöttätandeVäxter("Meatloaf", 0.7);
        Palmer Olof = new Palmer("Olof", 1);

    public String växtSomSkaVattnas(List<String> boendePåHotellet){
        String namnVäxtSomSkaVattnas =
                JOptionPane.showInputDialog(null,"Vilken växt ska få mat?");

        if (namnVäxtSomSkaVattnas == null)
            System.exit(0);

        if(boendePåHotellet.contains(namnVäxtSomSkaVattnas.toLowerCase()))
            return namnVäxtSomSkaVattnas;

        return "finns inte";
    }
    public void uträkning(String namn, List<String> boendePåHotellet){

        String meddelande = "";

        switch (namn.toLowerCase()){
            case "igge" -> meddelande = Igge.meddelandeMängdVätska();
            case "laura" -> meddelande = Laura.meddelandeMängdVätska();
            case "meatloaf" -> meddelande = Meatloaf.meddelandeMängdVätska();
            case "olof" -> meddelande = Olof.meddelandeMängdVätska();
            case "finns inte" -> växtFinnsInte(boendePåHotellet);
        }
        if (!meddelande.equals(""))
            JOptionPane.showMessageDialog(null,meddelande);
    }
    public void växtFinnsInte(List<String> boendePåHotellet){

        StringBuilder boende = new StringBuilder("Du kan endast vattna inneboende plantor: \n");

        for(String namn: boendePåHotellet)
            boende.append("* ").append(namn).append(".\n");
        JOptionPane.showMessageDialog(null,boende);
    }
    Huvudprogram() {

        List<String> boendePåHotellet = new ArrayList<>();

        boendePåHotellet.add(Igge.getNamn().toLowerCase());
        boendePåHotellet.add(Laura.getNamn().toLowerCase());
        boendePåHotellet.add(Meatloaf.getNamn().toLowerCase());
        boendePåHotellet.add(Olof.getNamn().toLowerCase());

        while (true){
            uträkning(växtSomSkaVattnas(boendePåHotellet),boendePåHotellet);
        }
    }


    public static void main(String[] args) {
        Huvudprogram inl1 = new Huvudprogram();
    }
}