package domain;

public class Fiets extends Voertuig {
    private boolean heeftBel;

    public Fiets(String soort, int aantalWielen, int aantalPersonen, boolean heeftBel) {
        super(soort, aantalWielen, aantalPersonen);
        heeftBel(heeftBel);
    }

    public void heeftBel(boolean heeftBel) {
        this.heeftBel = heeftBel;
    }

    //hier overriden we de geefInfoAlsString()-methode van de VoertuigKlasse
    @Override
    public String geefInfoAlsString() { return super.geefInfoAlsString() + " De fiets heeft " + (heeftBel? "een" : "geen") + " bel."; }
}
