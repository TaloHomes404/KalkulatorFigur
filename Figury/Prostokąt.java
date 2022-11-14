package Figury;

public class Prostokąt {
    double bokA;
    double bokB;

    public Prostokąt(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public void obwodProstokąta() {
        System.out.println("Obwód prostokąta wynosi: " + (2 * bokA) + (2 * bokB));
    }
    public void poleProstokata(){
        System.out.println("Pole prostokąta wynosi: " + bokA*bokB);
    }
    public void daneProstokąta() {
        System.out.println("Nazwa: Prostokąt");
        System.out.println("Długość boku A: " + bokA);
        System.out.println("Długość boku B: " + bokB);
        obwodProstokąta();
        poleProstokata();
    }
}
