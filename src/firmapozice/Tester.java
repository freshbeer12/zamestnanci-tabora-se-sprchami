package firmapozice;

public class Tester extends Zamestnanec{
    private int nalezeneChyby;

    public Zamestnanec(String jmeno, String prijmeni, String pozice, int plat, int nalezeneChyby) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pozice = pozice;
        this.plat = plat;
        this.nalezeneChyby = 0;
    }

    private void naselJsemNovouChybu(){
        int chyba = nalezeneChyby + 1;
    }

    public void vypisInfo(){
        System.out.println("Jméno: " + jmeno);
        System.out.println("Příjmení: " + prijmeni);
        System.out.println("Pozice: " + pozice);
        System.out.println("Plat: " + plat);
        System.out.println("Nalezene chyby: " + nalezeneChyby);
    }
}
