/*
Autor: Szymon Czudowski
Zadanie 1 (1 pkt)

Napisz program, który pobierze od użytkownika liczby (może być ich dowolna ilość)
i umieści ich w posortowanym zbiorze. Następnie program ma wypisać ten zbiór na ekranie.

Dane wejściowe: 1 1 2 2 3 3 Dane wyjściowe: [1, 2 ,3]
 */
import java.util.*;

public class sortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>();

        System.out.println("Podaj liczby oddzielone spacjami (wpisz 'q' aby zakończyć):");

        String input = scanner.nextLine();

        String[] numbersStr = input.split(" ");
        for (String numberStr : numbersStr) {
            if (numberStr.equals("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(numberStr);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Błędny format. Podaj liczbę lub 'q' aby zakończyć.");
            }
        }

        System.out.print("Posortowany zbiór: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}