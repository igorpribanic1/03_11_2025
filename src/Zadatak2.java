import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        String korisnickiUnos = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Upišite tekst za koji želite ispis unatrag: ");

        korisnickiUnos = sc.nextLine();

        while(korisnickiUnos.length() == 0) {
            System.out.print("\nGreška u radu. Upišite tekst za koji želite ispis unatrag: ");
            korisnickiUnos = sc.nextLine();
        }

        String[] rijeci = korisnickiUnos.split("[\\s]");

        for (int i = rijeci.length-1; i >= 0 ; i--) {
            if(i > 0) {
                System.out.print(rijeci[i] + " ");
            } else{
                System.out.print(rijeci[i]);
            }
        }


    }
}
