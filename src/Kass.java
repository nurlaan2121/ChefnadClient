import java.util.LinkedList;
import java.util.Scanner;

public class Kass {
    public String zakazaluu(Peson chef,Peson client) {
        LinkedList<Meel> massive = new LinkedList<>();
        massive.add(Meel.SALAD);
        massive.add(Meel.BURGER);
        massive.add(Meel.PASTA);
        massive.add(Meel.PIZZA);
        System.out.println(massive);
        System.out.println("Write name food: ");
        String name = new Scanner(System.in).nextLine();

            for (Meel dd :
                    massive) {
                if (name.equals(dd.name())) {
                    if (client.getBank().getChet() >= dd.getPrice()) {
                        client.getBank().setChet(client.getBank().getChet() - dd.getPrice());
                        chef.getBank().setChet(chef.getBank().getChet() + dd.getPrice());
                        return "Success s vas snayato " + dd.getPrice() + "   |  U vas ostalos:   " + client.getBank().getChet();
                    } else try {
                        throw new NOTDENGI("U vas ne dastatochna deneg!");
                    } catch (NOTDENGI notdengi) {
                        return notdengi.getMessage();
                    }
                }

            }try {
            throw new NOTFOUD("U nas net takoi bliudo");
        }catch (NOTFOUD notfoud){
            return notfoud.getMessage();
        }
    }public void Chefke(Peson chef){
        System.out.println("Na vashem balance: " + chef.getBank().getChet());
    }
}
