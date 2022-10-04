public class Bankomat {
    public static void main(String[] args) {
        int limitProbLogowania = 0;
        do {
                SprawdzaczPoprLogowania sprawdzaczPoprLogowania = new SprawdzaczPoprLogowania();
                sprawdzaczPoprLogowania.sprawdzPoprLogowania();
                limitProbLogowania++;
        }
        while (limitProbLogowania<3);
        System.out.println("Przekroczono limit prób - nastąpi wyjście z systemu");
        System.exit(0);
        }
    }


