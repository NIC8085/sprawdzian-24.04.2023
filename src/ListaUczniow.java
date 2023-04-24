/**
 Klasa ta służy do stworzenia funkcji,
 która ma za zadanie pobierania imienia i nazwiska uczniów,
 których chcemy dodać do listy,
 a funkcja wyswietl ma za zadanie wyświetlić zawartość listy.
 Kolejna funkcja dodaje te dane do listy,
 a następna losuje uczniów z tej listy.

 uczniowie : ArrayList<String>, lista przechowująca podanych uczniów
 uzyteLiczby : ArrayList<Integer>, przechowuje użyte już liczby przy losowanie,
                                   aby się już nie powtórzyły
 liczba : int, zawiera liczby losowane przy losowaniu uczniów
 imie : String, przechowuje podawane imie ucznia
 nazwisko : String, przechowuje podawane nazwisko ucznia
 i : int, służy do przechodzenia po pętli for

 @author: Kacper Markowski
 **/

import java.util.ArrayList;
import java.util.Random;


public class ListaUczniow {
    private ArrayList<String> uczniowie = new ArrayList<>();
    private ArrayList<Integer> uzyteLiczby = new ArrayList<>();

    private static Random rand = new Random();


    public void dodaj(String imie, String nazwisko){
        uczniowie.add(imie);
        uczniowie.add(nazwisko);
    }
    public void wyswietl(){
        for (int i = 0; i < uczniowie.size(); i+=2) {
            System.out.println(uczniowie.get(i) + uczniowie.get(i+1));
        }
    }
    public void losuj(int n){
        int liczba=0;
        for (int j=0;j<n;j++){
            while (true){
                liczba=rand.nextInt(uczniowie.size()+1);
                if (liczba<=uczniowie.size() && !uzyteLiczby.contains(liczba)){
                    uzyteLiczby.add(liczba);
                    break;
                }
                else {
                    liczba=rand.nextInt(uczniowie.size()+1);
                }
            }
            if (liczba%2==0){
                System.out.println("Wylosowano ucznia: " + uczniowie.get(liczba) + " " + uczniowie.get(liczba+1));
            }
            else{
                System.out.println("Wylosowano ucznia: " + uczniowie.get(liczba-1) + " " + uczniowie.get(liczba));
            }
        }
    }
}
