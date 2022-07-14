import java.util.Scanner;

public class bankomat{
    public static void main(String[] args) {
        System.out.println("Podaj pin");
        Scanner scanner = new Scanner(System.in);
        int pin;
        int saldo = 1000;
        pin = scanner.nextInt();
        if (pin == 1234) {

            System.out.println("Witaj, co chcesz zrobić?");
            System.out.println("1-Wypłać gotówkę");
            System.out.println("2-Pokaż saldo");
            int numoper = scanner.nextInt();

            switch (numoper) {
                case 1 -> {
                    System.out.println("Podaj kwotę do wypłaty");
                    int kwota = scanner.nextInt();
                    if (kwota <= saldo) {
                        System.out.println("Wybieranie kwoty " + kwota + " zł powiodło się");
                        System.out.println("Twój stan konta to " + (saldo - kwota) + " zł");
                    } else
                        System.out.println("Brak środków");
                }
                case 2 -> System.out.println("Sald konta to: " + saldo + " zł");
                default -> System.out.println("Nie rozpoznano polecenia.");
            }
        } else
            System.out.println("Podano zły kod pin");
    }
}
