package simplegame;

import java.util.Scanner;

public class SimpleGame {

    public static void main(String[] args) {
        Charachter charnev = new Charachter();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Üdv Idegen! Egy varázslatos kalandra szeretnél menni? \n Akkor jó helyen jársz! \n Mi a neved?: ");
        String Nev = sc.nextLine();
        charnev.setNev(Nev);
        System.out.println(Nev + "válaszd ki hogy milyen karakterrel szeretnél lenni! \n Harcos = 1, Barbár = 2, Varázsló = 3");
        int HarcosTipus = sc.nextInt();
        int HarcosUgyesseg = 0;
        String Fegyver = " ";

        HarcostValaszt(HarcosTipus, HarcosTipus, Fegyver);
        int Ugyesseg = HarcosUgyesseg;

        Charachter ch = new Charachter(Nev, HarcosTipus, Ugyesseg, Fegyver);

//System.out.println();
    }

    public static void HarcostValaszt(int HarcosUgyesseg, int HarcosTipus, String Fegyver) {
        Weapons fegyverallit = new Weapons();

        switch (HarcosTipus) {
            case 1 -> {
                HarcosUgyesseg = 3;
                fegyverallit.setNev("Kard");
                fegyverallit.setSebzes(fegyverallit.getSebzes());
                break;
            }
            case 2 -> {
                HarcosUgyesseg = 2;
                fegyverallit.setNev("Fejsze");
                fegyverallit.setSebzes(fegyverallit.getSebzes());
                break;
            }
            case 3 -> {
                HarcosUgyesseg = 5;
                fegyverallit.setNev("Varázspálca");
                fegyverallit.setSebzes(fegyverallit.getSebzes());
                break;
            }
            default -> {
            }
        }
    }
}
