/*
Autor: Szymon Czudowski
Zadanie 2 (2 pkt)

Napisz program, który utworzy dwa zbiory, wczyta je od użytkownika
(liczby dla pierwszego zbioru będą podane w pierwszej linii, dla drugiego w drugiej linii).
Wynikiem programu ma być wypisanie zbioru, który jest wynikiem operacji:

$$(A - B) \cap (B - A)$$

Dane wejściowe: 1 3 4 6 7 9 3 5 6 7 8 9 Dane wyjściowe: [1, 4 ,5 ,8]
 */
import java.util.*;

public class sets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczby dla pierwszego zbioru, oddzielone spacjami:");
        Set<Integer> setA = readSet(scanner);


        System.out.println("Podaj liczby dla drugiego zbioru, oddzielone spacjami:");
        Set<Integer> setB = readSet(scanner);


        Set<Integer> result = countResult(setA, setB);


        System.out.println("Wynik: " + result);
    }

    private static Set<Integer> readSet(Scanner scanner) {
        Set<Integer> set = new HashSet<>();
        String input = scanner.nextLine();
        Scanner setScanner = new Scanner(input);
        while (setScanner.hasNextInt()) {
            int number = setScanner.nextInt();
            set.add(number);
        }
        return set;
    }

    private static Set<Integer> countResult(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> result = new HashSet<>();
        for (int set : setA) {
            if (!setB.contains(set)) {
                result.add(set);
            }
        }
        for (int set : setB) {
            if (!setA.contains(set)) {
                result.add(set);
            }
        }
        return result;
    }
}
