package firmapozice;

import java.util.Scanner;

public class Tester extends Zamestnanec {

    private int nalezeneChyby;

    public Tester(String jmeno, String prijmeni, int plat, int nalezeneChyby) {
        super(jmeno, prijmeni, plat);
        this.nalezeneChyby = nalezeneChyby;
    }


    public int getNalezeneChyby() {
        return nalezeneChyby;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Nalezene chyby: " + nalezeneChyby);
    }


    public static Tester ziskejInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte jméno testera: ");
        String jmeno = sc.nextLine();
        System.out.print("Zadejte příjmení testera: ");
        String prijmeni = sc.nextLine();
        System.out.print("Zadejte plat testera: ");
        int plat = sc.nextInt();
        System.out.print("Zadejte počet nalezených chyb: ");
        int nalezeneChyby = sc.nextInt();
        return new Tester(jmeno, prijmeni, plat, nalezeneChyby);
    }
}
