package firmapozice;

import java.util.Scanner;

public class Vyvojar extends Zamestnanec {

    private int jazyky;


    public Vyvojar(String jmeno, String prijmeni, int plat, int jazyky) {
        super(jmeno, prijmeni, plat);
        this.jazyky = jazyky;
    }


    public int getJazyky() {
        return jazyky;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Jazyky: " + jazyky);
    }


    public static Vyvojar ziskejInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte jméno vývojáře: ");
        String jmeno = sc.nextLine();
        System.out.print("Zadejte příjmení vývojáře: ");
        String prijmeni = sc.nextLine();
        System.out.print("Zadejte plat vývojáře: ");
        int plat = sc.nextInt();
        System.out.print("Zadejte počet jazyků, které vývojář ovládá: ");
        int jazyky = sc.nextInt();
        return new Vyvojar(jmeno, prijmeni, plat, jazyky);
    }
}
