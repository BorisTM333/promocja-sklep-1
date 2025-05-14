import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj dzień początkowy: ");
        int dzienPoczatkowy = sc.nextInt();

        System.out.print("Podaj dzień końcowy: ");
        int dzienKoncowy = sc.nextInt();

        for (int dzien = dzienPoczatkowy; dzien <= dzienKoncowy; dzien++) {

            System.out.print("Dzień " + dzien + ": ");

            if (dzien % 3 == 0 && dzien % 5 == 0) {
                System.out.println("Dostajesz darmowa dostawe + znizka 10%");
            } else if (dzien % 5 == 0) {
                System.out.println("Znizka 10%");
            } else if (dzien % 3 == 0) {
                System.out.println("Dostajesz kupon na darmowa dostawe");
            } else {
                System.out.println("Brak promocji");
            }
        }

        sc.close();
    }
}