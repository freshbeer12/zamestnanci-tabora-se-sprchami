package firmapozice;
import java.util.ArrayList;
import java.util.Scanner;

public class ZamestnaneckySystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Manager> managers = new ArrayList<>();
        ArrayList<Vyvojar> vyvojari = new ArrayList<>();
        ArrayList<Tester> testeri = new ArrayList<>();
        ArrayList<Zamestnanec> zamestnanci = new ArrayList<>();

        boolean pokracovat = true;


        while (pokracovat) {
            System.out.println("Vyberte akci:");
            System.out.println("1. Přidat manažera");
            System.out.println("2. Přidat vývojáře");
            System.out.println("3. Přidat testera");
            System.out.println("4. Vypiš počet manažerů");
            System.out.println("5. Vypiš počet všech zaměstnanců");
            System.out.println("6. Tester, který nalezl nejvíce chyb");
            System.out.println("7. Vývojář, který ovládá nejvíce jazyků");
            System.out.println("8. Zaměstnanec s nejnižším platem");
            System.out.println("9. Konec");

            int volba = sc.nextInt();
            sc.nextLine();

            switch (volba) {
                case 1:
                    managers.add(Manager.ziskejInfo());
                    break;
                case 2:
                    vyvojari.add(Vyvojar.ziskejInfo());
                    break;
                case 3:
                    testeri.add(Tester.ziskejInfo());
                    break;
                case 4:
                    System.out.println("Počet manažerů: " + managers.size());
                    break;
                case 5:
                    System.out.println("Počet všech zaměstnanců: " + (managers.size() + vyvojari.size() + testeri.size()));
                    break;
                case 6:
                    if (testeri.size() > 0) {
                        Tester testerSMaxChybami = testeri.get(0);
                        for (Tester tester : testeri) {
                            if (tester.getNalezeneChyby() > testerSMaxChybami.getNalezeneChyby()) {
                                testerSMaxChybami = tester;
                            }
                        }
                        testerSMaxChybami.vypisInfo();
                    } else {
                        System.out.println("Není žádný tester.");
                    }
                    break;
                case 7:
                    if (vyvojari.size() > 0) {
                        Vyvojar vyvojarSMaxJazyky = vyvojari.get(0);
                        for (Vyvojar vyvojar : vyvojari) {
                            if (vyvojar.getJazyky() > vyvojarSMaxJazyky.getJazyky()) {
                                vyvojarSMaxJazyky = vyvojar;
                            }
                        }
                        vyvojarSMaxJazyky.vypisInfo();
                    } else {
                        System.out.println("Není žádný vývojář.");
                    }
                    break;
                case 8:
                    if (!zamestnanci.isEmpty()) {
                        Zamestnanec nejlevnejsi = zamestnanci.get(0);
                        for (Zamestnanec z : zamestnanci) {
                            if (z.getPlat() < nejlevnejsi.getPlat()) {
                                nejlevnejsi = z;
                            }
                        }
                        nejlevnejsi.vypisInfo();
                    } else {
                        System.out.println("Není žádný zaměstnanec.");
                    }
                    break;
                case 9:
                    pokracovat = false;
                    break;
                default:
                    System.out.println("Neplatná volba, zkuste znovu.");
                    break;
            }
        }
        sc.close();
    }
}
