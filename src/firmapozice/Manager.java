package firmapozice;

import java.util.Scanner;

public class Manager extends Zamestnanec {

    private int otroci;


    public Manager(String jmeno, String prijmeni, int plat, int otroci) {
        super(jmeno, prijmeni, plat);
        this.otroci = otroci;
    }


    public int getOtroci() {
        return otroci;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Počet řízených otroků: " + otroci);
    }


    public static Manager ziskejInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte jméno manažera: ");
        String jmeno = sc.nextLine();
        System.out.print("Zadejte příjmení manažera: ");
        String prijmeni = sc.nextLine();
        System.out.print("Zadejte plat manažera: ");
        int plat = sc.nextInt();
        System.out.print("Zadejte počet řízených otroků: ");
        int otroci = sc.nextInt();
        return new Manager(jmeno, prijmeni, plat, otroci);
    }
}
