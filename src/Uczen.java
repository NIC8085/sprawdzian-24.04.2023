/**
 Klasa ta służy do niczego i istnieje jedynie z powodu polecenia zadania.

 imie : String, służy do niczego
 nazwisko : String, służy do niczego
 id : int, służy do niczego

 @author: Kacper Markowski
 **/

import java.util.Objects;

public class Uczen {
    private final String imie, nazwisko;
    private int id=0;

    //konstruktor


    public Uczen(String imie, String nazwisko, int id) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        id++;
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return id == uczen.id && Objects.equals(imie, uczen.imie) && Objects.equals(nazwisko, uczen.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, id);
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", id=" + id +
                '}';
    }
}
