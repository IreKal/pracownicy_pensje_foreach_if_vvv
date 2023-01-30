package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Pracownik pracownik = new Pracownik("Jan", "Kowalski", 50, 100);
//        System.out.println(pracownik.toString());
        PracownikZNadgodzinami pracownikZN = new PracownikZNadgodzinami("Jan", "Kowalski", 50, 100, 30);
        System.out.println(pracownikZN.toString());
        String anuluj ;
        anuluj = "anuluj";
        double wynagrodzenie;
        double stawkaZaGodzine = 0 ;
        double LiczbaPrzepracowanychGodzin = 0  ;
        wynagrodzenie = stawkaZaGodzine * LiczbaPrzepracowanychGodzin ;

      while(true){

          System.out.println("Podaj Imie, nazwisko, stawke za godzine, liczbe przepracowanych godzin ");

            Scanner scan = new Scanner(System.in);
            String imie  = scan.nextLine();
          if (!imie.matches("[a-zA-Z]+")){
            System.out.println("Zle dane");
            }
            if (imie.equals("anuluj")){
            break;}

             Scanner scan1 = new Scanner(System.in);
             String nazwisko  = scan.nextLine();
          if (!nazwisko.matches("[a-zA-Z]+")){
            System.out.println("Zle dane");
            }
            if (nazwisko.equals("anuluj")){
            break;}

            Scanner scan2 = new Scanner(System.in);
          stawkaZaGodzine = scan.nextDouble();
          if (!stawkaZaGodzine.matches("[0-9]+")){
              System.out.println("Zle dane");
             }
            if (stawkaZaGodzine.equals("anuluj")){
              break;}


            Scanner scan3 = new Scanner(System.in);
          LiczbaPrzepracowanychGodzin = scan.nextDouble();
          if (!LiczbaPrzepracowanychGodzin.matches("[0-9]+")){
              System.out.println("Zle dane");
           }
             if (LiczbaPrzepracowanychGodzin.equals("anuluj")){
              break;}


          //Pracownik pracownik = new Pracownik();
           System.out.println("Imie " + imie + "Nazwisko "+ nazwisko + "wynagrodzenie " + wynagrodzenie);




}




}}