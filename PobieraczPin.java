import java.util.Scanner;

public class PobieraczPin { // tu klasa
    public int pobierzPin() { // tu metoda
        Scanner scannerPobraniePinu = new Scanner(System.in);
        int pobranyPin;
        pobranyPin = scannerPobraniePinu.nextInt();
        return pobranyPin;
    }
}


