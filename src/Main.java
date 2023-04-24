/**
 Klasa ta służy do pobierania imienia i nazwiska uczniów,
 których chcemy dodać do listy,
 a następnie losuje uczniów z tej listy.

 imie : String, przechowuje podawane imie ucznia
 nazwisko : String, przechowuje podawane nazwisko ucznia
 i : int, służy do przechodzenia po pętli for

 @author: Kacper Markowski
 **/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaUczniow listaUczniow = new ListaUczniow();

        String imie;
        String nazwisko;

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj imie: ");
            imie=in.nextLine();
            System.out.println("Podaj nazwisko: ");
            nazwisko=in.nextLine();
            listaUczniow.dodaj(imie,nazwisko);
        }
        listaUczniow.losuj(1);
        listaUczniow.losuj(3);
    }
}