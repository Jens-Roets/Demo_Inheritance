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


        System.out.println(voertuig.geefInfoAlsString());
        System.out.println(auto.geefInfoAlsString());
        System.out.println(fietsMetBel.geefInfoAlsString());
        System.out.println(fietsZonderBel.geefInfoAlsString());

    }
}
