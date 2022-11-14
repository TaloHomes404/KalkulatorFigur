package Figury;

public class Prostopadłościan {
    double bokA;
    double bokB;
    double bokC;

    public Prostopadłościan(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    public void poleProstopadłościanu() {
        System.out.println("Pole prostopadłościanu wynosi:" + 2 * ((bokA * bokB) + (bokA * bokC) + (bokB * bokC)));
    }
    public void objetoscProstopadłościanu(){
        System.out.println("Objętość prostopadłościanu wynosi: "+ (bokA*bokB*bokC));
    }

    public void daneProstopadłościanu() {
        System.out.println("Nazwa: Prostopadłościan");
        System.out.println("Długość boku A: " + bokA);
        System.out.println("Długość boku B: " + bokB);
        System.out.println("Długość boku C: " + bokC);
        poleProstopadłościanu();
        objetoscProstopadłościanu();
    }
}
