import java.util.Scanner;

public class PobieraczPin { // tu klasa
    public int pobierzPin() { // tu metoda
        Scanner scannerPobraniePinu = new Scanner(System.in);
        int pobranyPin;
        pobranyPin = scannerPobraniePinu.nextInt();
        return pobranyPin;
    }
}


//public class PinHolder { // tu klasa
//   private Integer pin;
//   private String owner;
//
//    public Integer getPin() {
//        return pin;
//    }
//
//    public void setPin(Integer pin) {
//        this.pin = pin;
//    }
//
//    public String getOwner() {
//        return owner;
//    }
//
//    public void setOwner(String owner) {
//        this.owner = owner;
