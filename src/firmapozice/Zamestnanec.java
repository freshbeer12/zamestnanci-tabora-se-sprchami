package firmapozice;
import java.util.Scanner;

public class Zamestnanec {
    public String jmeno;
    public String prijmeni;
    public int plat;

    public Zamestnanec(String jmeno, String prijmeni, int plat) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.plat = plat;
    }

    public void vypisInfo(){
        System.out.println("Jméno: " + jmeno);
        System.out.println("Příjmení: " + prijmeni);
        System.out.println("Plat: " + plat);
    }

    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
    public int getPlat() {
        return plat;
    }

    public static Zamestnanec ziskejInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte jméno: ");
        String jmeno = sc.nextLine();
        System.out.print("Zadejte příjmení: ");
        String prijmeni = sc.nextLine();
        System.out.print("Zadejte plat: ");
        int plat = sc.nextInt();
        return new Zamestnanec(jmeno, prijmeni, plat);
    }
}
