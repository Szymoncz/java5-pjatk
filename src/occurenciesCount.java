/*
Autor: Szymon Czudowski
Zadanie 3 (2 pkt) Napisz program, który będzie wczytywał ciąg znaków w jednej linii od użytkownika
i wyświetlający liczę wystąpień każdego ze słów.
Skorzystaj ze struktury słownikowej. Kolekcja powinna być posortowana po kluczach.

Dane wejściowe: ala ma kota i ala ma psa i fajnie że wszystko ma
Dane wyjściowe: {ala=2, fajnie=1, i=2, kota=1, ma=3, psa=1, wszystko=1, że=1}
 */
import java.util.*;

public class occurenciesCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków:");
        String input = scanner.nextLine();

        Map<String, Integer> counter = new TreeMap<>();

        String[] words = input.split(" ");

        for (String word : words) {
            if (counter.containsKey(word)) {
                counter.put(word, counter.get(word) + 1);
            } else {
                counter.put(word, 1);
            }
        }

        System.out.println("Dane wyjściowe: " + counter);
    }
}
