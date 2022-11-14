package Figury;

public class Kula {
    double promienR;
    final double pi = 3.14;

    public Kula(double promienR) {
        this.promienR = promienR;
    }

    public void poleKuli() {
        System.out.println("Pole kuli wynosi: " + 4 * (pi * Math.pow(promienR, 2)));
    }

    public void objetoscKuli() {
        System.out.println("Objętość kuli wynosi: " + (4 / 3) * (pi * Math.pow(promienR, 3)));
    }
    public void daneKula() {
        System.out.println("Nazwa: Kula");
        System.out.println("Długość promienia " + promienR);
        poleKuli();
        objetoscKuli();
    }
}
