package firmapozice;

public class Zamestnanec {
    private String jmeno;
    private String prijmeni;
    private String pozice;
    private int plat;

    public Zamestnanec(String jmeno, String prijmeni, String pozice, int plat) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.pozice = pozice;
        this.plat = plat;
    }


    public void vypisInfo(){
        System.out.println("Jméno: " + jmeno);
        System.out.println("Příjmení: " + prijmeni);
        System.out.println("Pozice: " + pozice);
        System.out.println("Plat: " + plat);
    }

    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
    public String getPozice() {
        return pozice;
    }
    public int getPlat() {
        return plat;
    }
}
