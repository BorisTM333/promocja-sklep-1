import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        for (int dzien = 1; dzien <= 31; dzien++) {

            System.out.print("Dzień " + dzien + ": ");

            if (dzien % 3 == 0 && dzien % 5 == 0) {
                System.out.println("Dostajesz darmową dostawe + zniżkę 10%");
            }
            else if(dzien % 5 == 0) {
                System.out.println("Dostajesz zniżkę 10%");
            }
            else if(dzien % 3 == 0){
                System.out.println("Dostajesz kupon na darmową dostawę");
            }else{
                System.out.println("Brak promocji");
            }
        }
    }
}
