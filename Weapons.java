package simplegame;

import java.util.Random;

public class Weapons {
    
    private String nev;
    private int sebzes;

    /* private String fajta;
    private int ritkaság;*/
    
    public String getNev() {
        return nev;
    }
    
    public int getSebzes() {
        return sebzes;
    }
    
    public void setNev(String nev) {
        this.nev = nev;
    }
    
    public void setSebzes(int sebzes) {
        this.sebzes = sebzes;
    }
    
    public static void Kard(int sebzes) {
        Random rnd = new Random();
        int alapsebzes = rnd.nextInt(23);
        int critvalasztas = rnd.nextInt(3);
        int Critical = 0;
        
        CriticalHit(alapsebzes, Critical);
        SebzesKiir(alapsebzes, Critical);
        
        sebzes = alapsebzes;
        Weapons wep = new Weapons();
        wep.setSebzes(sebzes);
    }
    
    public static void Fejsze() {
    }
    
    public static void VarazsPalca() {
    }
    
    public static void CriticalHit(int alapsebzes, int Critical) {
        Random rd = new Random();
        int critvalasztas = rd.nextInt(3);
        int[] Crittomb = new int[3];
        Crittomb[0] = 20;
        Crittomb[1] = 21;
        Crittomb[2] = 22;
        
        int criticalhit = 0;
        for (int i = 0; i < Crittomb.length; i++) {
            if (critvalasztas == i) {
                criticalhit = Crittomb[i];
            }
        }
        
        Critical = rd.nextInt(99) + 1;
        if (Critical == 15 || Critical == 25 || Critical == 35 || Critical == 45 || Critical == 55) {
            alapsebzes = criticalhit * 2;
        }
    }
    
    public static void SebzesKiir(int sebzes, int Critical) {
        if (sebzes == 0) {
            System.out.println("Mellé");
        } else if (sebzes == Critical) {
            System.out.println("Kritikus Sebzés: " + sebzes);
        } else {
            System.out.println("Bevitt sebzés: " + sebzes);
        }
    }
    
}
