package Figury;

public class Sześcian {
    double bokA;

    public Sześcian(double bokA) {
        this.bokA = bokA;
    }

    public void poleSześcianu() {
        System.out.println("Pole sześcianu wynosi: " + 6 * (Math.pow(bokA, 2)));
    }

    public void objetoscSześcianu() {
        System.out.println("Objętość sześcianu wynosi: " + Math.pow(bokA, 3));
    }

    public void daneSześcianu() {
        System.out.println("Nazwa: Sześcian");
        System.out.println("Długość boku A: " + bokA);
        poleSześcianu();
        objetoscSześcianu();
    }
}
