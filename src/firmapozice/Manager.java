package firmapozice;

public class Manager extends Zamestnanec {

    private int otroci;

    public Zamestnanec(String jmeno, String prijmeni, String pozice, int plat, int otroci) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pozice = pozice;
        this.plat = plat;
        this.otroci = otroci;
    }

    public void vypisInfo(){
        System.out.println("Jméno: " + jmeno);
        System.out.println("Příjmení: " + prijmeni);
        System.out.println("Pozice: " + pozice);
        System.out.println("Plat: " + plat);
        System.out.println("Počet řízených otroků je " + otroci);
    }
}
