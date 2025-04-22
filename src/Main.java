import java.util.Scanner;
import firmapozice.Zamestnanec;
import firmapozice.Manager;
import firmapozice.Vyvojar;
import firmapozice.Tester;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zamestnanec zamestnanec = new Zamestnanec("Karel", "Černý", "skibidník", 450000);
        Manager manager = new Manager();
        Vyvojar vyvojar = new Vyvojar();
        Tester tester = new Tester();



    }
}