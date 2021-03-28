package ui;

import domain.Auto;
import domain.Fiets;
import domain.Voertuig;

public class VoertuigApp {
    public static void main(String[] args) {
        Voertuig voertuig = new Voertuig("voertuig", 4, 5);
        Voertuig auto = new Auto("auto", 4, 5, "Diesel");
        Voertuig fietsMetBel = new Fiets("fiets", 2, 1, true);
        Voertuig fietsZonderBel = new Fiets("fiets", 2, 1, false);
        Voertuig voertuig1 = new Voertuig();
        voertuig1.setAantalPersonen(3);
        voertuig1.setAantalWielen(6);
        voertuig1.setSoort("azerty");


        System.out.println(voertuig.geefInfoAlsString());
        System.out.println(auto.geefInfoAlsString());
        System.out.println(fietsMetBel.geefInfoAlsString());
        System.out.println(fietsZonderBel.geefInfoAlsString());

        System.out.println();
        System.out.println(voertuig1.geefInfoAlsString());

    }
}
