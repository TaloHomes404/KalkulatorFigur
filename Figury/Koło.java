package Figury;

public class Koło {
    double promienR;
    final double pi = 3.14;

    public Koło(double promienR) {
        this.promienR = promienR;
    }

    public void poleKoła() {
        System.out.println("Pole koła wynosi: " + pi * Math.pow(promienR, 2));
    }

    public void dlugoscKoła() {
        System.out.println("Długość koła wynosi: " + 2 * pi * promienR);
    }

    public void daneKoła() {
        System.out.println("Nazwa: Koło");
        System.out.println("Długość promienia:" +promienR);
        poleKoła();
        dlugoscKoła();
    }
}
