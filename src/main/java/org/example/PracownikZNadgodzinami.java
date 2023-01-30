package org.example;

public class PracownikZNadgodzinami extends Pracownik {
    double liczbaNadgodzin;

    double getInfoWn(){return   liczbaNadgodzin * stawkaZaGodzine;
    }

    public PracownikZNadgodzinami(String imie, String nazwisko, double stawkaZaGodzine, double liczbaPrzepracowanychGodzin, double
            liczbaNadgodzin) {
        super(imie, nazwisko, stawkaZaGodzine, liczbaPrzepracowanychGodzin);
        this.liczbaNadgodzin = liczbaNadgodzin;

    }

    public double getLiczbaNadgodzin() {
        return liczbaNadgodzin;
    }



    public void setLiczbaNadgodzin(double liczbaNadgodzin) {
        this.liczbaNadgodzin = liczbaNadgodzin;
    }


     //  public double getInfo() {
    // return wynagrodzenieZaNadgodziny = liczbaNadgodzin * stawkaZaGodzine ;


    @Override
    public String toString() {
        return "PracownikZNadgodzinami{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stawkaZaGodzine=" + stawkaZaGodzine +
                ", LiczbaPrzepracowanychGodzin=" + LiczbaPrzepracowanychGodzin +
                 ",  wynagrodzeniePodstawowe=" + getInfoWp() +
                 ", Wynagrodzenia z nadgodzin=" + getInfoWn() +
                '}';
    }
}







