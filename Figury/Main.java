package Figury;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Witaj w kalkulatorze figur geometrycznych!");
        System.out.println("Wybierz figurę:  1.Kwadrat 2.Prostokąt 3.Sześcian 4.Prostopadłościan 5.Koło 6.Kula 7.Stożek");

        Scanner input = new Scanner(System.in);
        double wybor = input.nextDouble();

        switch ((int) wybor) {
            case 1:
                System.out.println("Wybrano kwadrat! Wprowadź długość boku A:");
                int bokA = input.nextInt();
                Kwadrat kwadrat1 = new Kwadrat(bokA);
                kwadrat1.daneKwadrat();
                break;
            case 2:
                System.out.println("Wybrano prostokąt! Wprowadź długość boku A:");
                bokA = input.nextInt();
                System.out.println("Wprowadź długość boku B: ");
                int bokB = input.nextInt();
                Prostokąt prostokąt1 = new Prostokąt(bokA, bokB);
                prostokąt1.daneProstokąta();
                break;
            case 3:
                System.out.println("Wybrano sześcian! Wprowadź długość boku A:");
                bokA = input.nextInt();
                Sześcian sześcian1 = new Sześcian(bokA);
                sześcian1.daneSześcianu();
                break;
            case 4:
                System.out.println("Wybrano prostopadłościan! Wprowadź długość boku A:");
                bokA = input.nextInt();
                System.out.println("Wprowadź długość boku B:");
                bokB = input.nextInt();
                System.out.println("Wprowadź długość boku C:");
                int bokC = input.nextInt();
                Prostopadłościan prostopadłościan1 = new Prostopadłościan(bokA, bokB, bokC);
                prostopadłościan1.daneProstopadłościanu();
                break;
            case 5:
                System.out.println("Wybrano koło! Wprowadź długość promienia: ");
                int promienR = input.nextInt();
                Koło koło1 = new Koło(promienR);
                koło1.daneKoła();
                break;
            case 6:
                System.out.println("Wybrano kule! Wprowadź długość promienia: ");
                promienR = input.nextInt();
                Kula kula1 = new Kula(promienR);
                kula1.daneKula();
                break;
            case 7:
                System.out.println("Wybrano stożek! Wprowadź długość promienia: ");
                promienR = input.nextInt();
                System.out.println("Wprowadź wysokość: ");
                int wysokoscH = input.nextInt();
                System.out.println("Wprowadź obwód koła: ");
                int obwodKołaL = input.nextInt();
                Stożek stożek1 = new Stożek(promienR, wysokoscH, obwodKołaL);
                stożek1.daneStożek();
                break;
            default:
                System.out.println("Podałeś jakieś nienormalne dane, nie ma czegoś takiego lol");
        }

    }
}
