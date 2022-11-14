package Figury;

public class Stożek {
    double promienR;
    double wysokoscH;
    double obwodKołaL;
    final double pi = 3.14;


    public Stożek(double promienR, double wysokoscH, double obwodKołaL) {
        this.promienR = promienR;
        this.wysokoscH = wysokoscH;
        this.obwodKołaL = obwodKołaL;
    }

    public void polePodstawyStożka() {
        System.out.println("Pole podstawy stożka wynosi: " + pi * (Math.pow(promienR, 2)));

    }

    public void powierzchniaBocznaStożka() {
        System.out.println("Pole powierzchni bocznej stożka wynosi: " + pi * obwodKołaL * promienR);
    }

    public void powierzchniaCalkowitaStożka() {
        System.out.println("Pole powierzchni całkowitej stożka wynosi: " + (pi * (Math.pow(promienR, 2))) + (pi * obwodKołaL * promienR));
    }

    public void objetoscStożka() {
        System.out.println("Objętość stożka wynosi: " + ((pi * (Math.pow(promienR, 2))) * wysokoscH) / 3);
    }

    public void daneStożek() {
        System.out.println("Nazwa: Stożek");
        System.out.println("Długość promienia " + promienR);
        System.out.println("Wysokość H: " + wysokoscH);
        System.out.println("obwód koła L: " + obwodKołaL);
        polePodstawyStożka();
        powierzchniaBocznaStożka();
        powierzchniaCalkowitaStożka();
        objetoscStożka();
    }
}
