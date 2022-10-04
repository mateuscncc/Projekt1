public class SprawdzaczPoprLogowania {
    public boolean sprawdzPoprLogowania() {
        int user;
        int pin;
        System.out.println("Podaj id użytkownika");
        PobieraczUsera pobierzUsera1 = new PobieraczUsera();
        user = pobierzUsera1.pobierzUsera();
        System.out.println("Podaj pin");
        PobieraczPin pobierz1Pin = new PobieraczPin();
        pin = pobierz1Pin.pobierzPin();

        if ((user == 111 || user == 222 || user == 333) & (pin == 1234)) {
            System.out.println("Uwierzytelniono");
            WyborOperacji wybierzOperacje = new WyborOperacji();
            wybierzOperacje.wybierzOperacje();
        } else {
            System.out.println("Niepoprawny użytkownik lub pin");
        }
        return true;
    }
}