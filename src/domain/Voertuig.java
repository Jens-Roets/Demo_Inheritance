package domain;

public class Voertuig {
    private String soort;
    private int aantalWielen;
    private int aantalPersonen;

    public Voertuig(String soort, int aantalWielen, int aantalPersonen) {
        setSoort(soort);
        setAantalWielen(aantalWielen);
        setAantalPersonen(aantalPersonen);
    }

    public void setSoort(String naam) {
        this.soort = naam;
    }

    public void setAantalWielen(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }

    public void setAantalPersonen(int aantalPersonen) {
        this.aantalPersonen = aantalPersonen;
    }

    public String geefInfoAlsString() {
        return "Voetuig: " + soort + " heeft " + aantalWielen + " wielen en heeft plaats voor " + aantalPersonen + " personen.";
    }
}
