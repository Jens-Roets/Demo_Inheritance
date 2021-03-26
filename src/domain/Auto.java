package domain;

public class Auto extends Voertuig {
    private String brandstof;

    public Auto(String soort, int aantalWielen, int aantalPersonen, String brandstof) {
        super(soort, aantalWielen, aantalPersonen);
        setBrandstof(brandstof);
    }

    public void setBrandstof(String brandstof) {
        this.brandstof = brandstof;
    }

    //hier overriden we de geefInfoAlsString()-methode van de VoertuigKlasse
    @Override
    public String geefInfoAlsString() {return super.geefInfoAlsString() + " De auto gebruikt " + brandstof + " als brandstof.";}
}
