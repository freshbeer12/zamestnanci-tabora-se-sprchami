package firmapozice;

public class Vyvojar extends Zamestnanec{

    private int jazyky;

    public Zamestnanec(String jmeno, String prijmeni, String pozice, int plat, int jazyky) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pozice = pozice;
        this.plat = plat;
        this.jazyky = jazyky;
    }

    public void vypisInfo(){
        System.out.println("Jméno: " + jmeno);
        System.out.println("Příjmení: " + prijmeni);
        System.out.println("Pozice: " + pozice);
        System.out.println("Plat: " + plat);
        System.out.println("Jazyky: " + jazyky);
    }

}
