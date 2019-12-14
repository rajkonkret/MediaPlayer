import java.util.ArrayList;
import java.util.List;

public class Run {
    //    Mamy dwa rodzaje płyt: cd i dvd.
//    Napiszemy odtwarzacz, który odczyta obie płyty.
//    W tym celu stwórz interfejs Disc, zdefiniuj w nim metodę read() zwracającą String
//    oraz getName()również zwracającą String.
    //
//    Napisz dwie klasy implementujące interfejs Disc :  Cd oraz Dvd.
//    Płyta cd, jak ktoś ją przeczyta (wywoła metodę read()) to zwróci nazwę płyty oraz jej opis:
//            "Cd with not very well quality".
//    Płyta dvd zwróci również nazwę płyty, ale inny opis: "Dvd with quite nice quality".
//    Napisz klasę Player z metodą:
//            • void play(Disc disc) - która będzie urumchamiła płytę
//    przekazaną w parametrze i wywoła metodę read() wypisując jej opis.
//    Rozwinięcie:
//    Zmień klasę Player tak,
//    by obsługiwała zdarzenia włożenia i wyjęcia płyty.
//    Powinna posiadać więc następujące metody:
//            • void insert(Disc disc) – włożenie płyty do nośnika
//    • void play() – uruchomienie płyty, która aktualnie jest w nośniku lub wypisanie, że nośnik jest pusty.
//    • void eject() – wyjęcie płyty z nośnika (nośnik jest pusty).
    public static void main(String[] args) {
        List<Disc> discs = new ArrayList<>();
        Disc cd = new Cd();
        Disc dvd = new Dvd();
        Player player = new Player();

        discs.add(cd);
        discs.add(dvd);
        player.insert(cd);
        player.insert(cd);
        player.eject(cd);
        player.insert(dvd);

        player.play();


    }
}
