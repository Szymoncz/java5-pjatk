/*
Autor: Szymon Czudowski
Zadanie 4 (1 pkt)

Napisz klasę TestScores (wyniki testów). Konstruktor w tej klasie powinien przyjmować jako argument tablicę wyników testów.
W klasie powinna znajdować się metoda zwracająca średnią wyników testów.
Jeśli któryś z wyników w tablicy jest ujemny lub wyższy od 100,
klasa powinna zgłaszać wyjątek typu IllegalArgumentException.
 */
public class testScores {
    private int[] scores;

    public testScores(int[] scores) {
        this.scores = scores;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int score : scores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Niewłaściwy wynik testu: " + score);
            }
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static void main(String[] args) {
        int[] wyniki = {85, 92, 78, 99, 22};
        try {
            testScores testScores = new testScores(wyniki);
            double srednia = testScores.calculateAverage();
            System.out.println("Średnia wyników testów: " + srednia);
        } catch (IllegalArgumentException e) {
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }
    }
}
