import java.util.Scanner;

public class Kalkulator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Witaj Użytkowniku, w tym prostym kalkulatorze możesz dodawać, odejmować, dzielić oraz mnożyć! Podaj pierwszą liczbę działania, wybierz rodzaj akcji, a następnie drugą liczbę");

            System.out.println("Liczba Pierwsza:");
            double x = Double.parseDouble(scanner.nextLine());

            System.out.println("Wybierz rodzaj akcji (+, -, *, /):");
            String choice = scanner.nextLine();

            // Sprawdź, czy użytkownik wybrał poprawny rodzaj akcji
            if (!choice.equals("+") && !choice.equals("-") && !choice.equals("*") && !choice.equals("/")) {
                throw new IllegalArgumentException("Błąd: Niepoprawny rodzaj akcji. Proszę wybrać jeden z symboli: +, -, *, /.");
            }

            System.out.println("Liczba Druga:");
            double y = Double.parseDouble(scanner.nextLine());

            switch (choice) {
                case "+":
                    System.out.println("Wynik: " + (x + y));
                    break;
                case "-":
                    System.out.println("Wynik: " + (x - y));
                    break;
                case "*":
                    System.out.println("Wynik: " + (x * y));
                    break;
                case "/":
                    if (y == 0) {
                        System.out.println("Błąd: dzielenie przez 0 jest niewykonalne.");
                    } else {
                        System.out.println("Wynik: " + (x / y));
                    }
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Błąd: Wprowadzono niepoprawną wartość. Proszę podać liczby.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Naciśnij Enter, aby zakończyć.");
            scanner.nextLine();
        }
    }
}
