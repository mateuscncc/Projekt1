import java.util.Scanner;

public class PobieraczUsera {
    public int pobierzUsera() {
        Scanner scannerPobierzUsera = new Scanner(System.in);
        int pobranyUser;
        pobranyUser = scannerPobierzUsera.nextInt();
        System.out.println("Podaj id użytkownika");
        if (pobranyUser==111 || pobranyUser==222 || pobranyUser==333) {
                System.out.println("Poprawny id użytkownika");
            } else {
                System.out.println("Niepoprawny id użytkownika");
                System.exit(0);
        }
        return pobranyUser;
    }
}
