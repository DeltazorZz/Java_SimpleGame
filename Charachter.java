package simplegame;

public class Charachter {

    //private változók
    private String nev;
    private int faj;
    private int ugyesseg;
    private String[] eszkozok;
    private int hatizsak = 5;
    private int szint = 1;
    String Fegyver;

    public Charachter() {
    }

    public int getSzint() {
        return szint;
    }

    public void setSzint(int szint) {
        this.szint = szint;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public int getHatizsak() {
        return hatizsak;
    }

    public void setHatizsak(int hatizsak) {
        this.hatizsak = hatizsak;
    }

    public Charachter(String nev, int faj, int ugyesseg) {
        this.nev = nev;
        this.faj = faj;
        this.ugyesseg = ugyesseg;
    }

    public Charachter(String nev, int faj, int ugyesseg, String fegyver) {
        this.nev = nev;
        this.faj = faj;
        this.ugyesseg = ugyesseg;
        this.Fegyver = fegyver;
    }

    public static boolean Felvesz(String[] eszkoz) {

        return true;
    }

    public static void Eldob(int index) {

    }

    public static void Kiir() {

    }

    public static int EszkozDb() {
        return 0;
    }

    public static boolean LevelUp(int szint) {

    }

}
