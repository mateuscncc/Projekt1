import java.util.Scanner;

public class WyborOperacji {

    public void wybierzOperacje() {
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000;
        System.out.println("Witaj, co chcesz zrobić?");
        System.out.println("1 - Wypłać gotówkę");
        System.out.println("2 - Pokaż saldo");
        System.out.println("3 - Wyjdź");
        int numerOperacji = scanner.nextInt();

        switch (numerOperacji) {
            case 1 -> {
                System.out.println("Podaj kwotę do wypłaty");
                int kwota = scanner.nextInt();
                if (kwota <= saldo) {
                    System.out.println("Wybieranie kwoty " + kwota + " zł powiodło się");
                    System.out.println("Twój stan konta to " + (saldo - kwota) + " zł");
                    System.exit(0);
                } else {
                    System.out.println("Brak środków");
                    System.exit(0);
                }
                }
            case 2 -> {
                System.out.println("Saldo konta to: " + saldo + " zł");
                System.exit(0);
            }
            case 3 -> System.exit(0);
            default -> {
                System.out.println("Nie rozpoznano polecenia.");
                System.exit(0);
            }
        }
    }
}