import java.util.Scanner;

public class PobieraczUsera {
    public int pobierzUsera() {
        Scanner scannerPobierzUsera = new Scanner(System.in);
        int pobranyUser;
        pobranyUser = scannerPobierzUsera.nextInt();
        return pobranyUser;
    }
}
