package Figury;

public class Kwadrat {
    double bokA;

    public Kwadrat(double bokA) {
        this.bokA = bokA;
    }

    public void obwodKwadratu() {
        System.out.println("obwód kwadratu wynosi: " + 4 * bokA);
    }

    public void poleKwadratu() {
        System.out.println("pole kwadratu wynosi: " + Math.pow(bokA, 2));
    }

    public void daneKwadrat() {
        System.out.println("Nazwa: Kwadrat");
        System.out.println("Długość boku A: " + bokA);
        obwodKwadratu();
        poleKwadratu();

    }
}
