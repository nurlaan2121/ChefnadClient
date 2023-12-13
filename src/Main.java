import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Peson peson = new Peson();
        peson.setFullName("Nurlan");
        Bank bank = new Bank();
        bank.setKto(peson);
        bank.setChet(0);
        peson.setBank(bank);
        peson.setStatus(Status.CHEF);

        Peson clin = new Peson();
        Bank bank1 = new Bank(500, clin);
        clin.setBank(bank1);
        clin.setStatus(Status.CLIENT);
        clin.setFullName("Ermek");
        Kass kass = new Kass();

        LOOPMAIN:
        while (true) {
            System.out.println("""
                    Who are you?
                    1.Client
                    2.Povar 
                    """);
            try {
                int action = new Scanner(System.in).nextInt();
                switch (action) {
                    case 1 -> {
                        System.out.printf(kass.zakazaluu(peson, clin));
                    }
                    case 2 -> {
                        kass.Chefke(peson);
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Write number: ");
            }

        }


    }
}