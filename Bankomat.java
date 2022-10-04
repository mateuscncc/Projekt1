import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        System.out.println("Podaj pin");
        int pin;
        PobieraczPin pobierz1Pin = new PobieraczPin();
        pin = pobierz1Pin.pobierzPin();

        if (pin == 1234) {
            WyborOperacji wybierzOperacje1 = new WyborOperacji();
            wybierzOperacje1.wybierzOperacje();

        } else
            System.out.println("Podano zły kod pin");
    }

}