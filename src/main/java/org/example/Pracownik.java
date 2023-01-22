package org.example;

import java.util.Scanner;

public class Pracownik {
    String imie;
    String nazwisko;
    double stawkaZaGodzine;
    double LiczbaPrzepracowanychGodzin;

    double getInfoWp() {
        return stawkaZaGodzine *LiczbaPrzepracowanychGodzin;
    }


    public Pracownik(String imie, String nazwisko, double stawkaZaGodzine, double liczbaPrzepracowanychGodzin) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaZaGodzine = stawkaZaGodzine;
        LiczbaPrzepracowanychGodzin = liczbaPrzepracowanychGodzin;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getStawkaZaGodzine() {
        return stawkaZaGodzine;
    }

    public double getLiczbaPrzepracowanychGodzin() {
        return LiczbaPrzepracowanychGodzin;
    }


    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setStawkaZaGodzine(double stawkaZaGodzine) {
        this.stawkaZaGodzine = stawkaZaGodzine;
    }

    public void setLiczbaPrzepracowanychGodzin(double liczbaPrzepracowanychGodzin) {
        LiczbaPrzepracowanychGodzin = liczbaPrzepracowanychGodzin;
    }

    public  String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stawkaZaGodzine=" + stawkaZaGodzine +
                ", LiczbaPrzepracowanychGodzin=" + LiczbaPrzepracowanychGodzin +
                ", wynagrodzeniePodstawowe=" + getInfoWp() +
                '}';
    }
}