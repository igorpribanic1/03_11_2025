import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        String korisnickiUnos = "";
        Scanner sc = new Scanner(System.in);
        int slova = 0;
        int brojevi = 0;
        int ostaliZnakovi = 0;

        System.out.print("Upišite tekst za koji želite ispisati statistiku znakova: ");

        korisnickiUnos = sc.nextLine();

        while(korisnickiUnos.length() == 0) {
            System.out.print("\nGreška u radu. Upišite tekst za koji želite ispisati statistiku znakova: ");
            korisnickiUnos = sc.nextLine();
        }

        char[] znakovi = new char[korisnickiUnos.length()];
        znakovi = korisnickiUnos.toCharArray();

        for (int i = 0; i < znakovi.length; i++) {
            if(Character.isLetter(znakovi[i])){
                slova +=1;
            } else if(Character.isDigit(znakovi[i])){
                brojevi +=1;
            } else{
                ostaliZnakovi +=1;
            }
        }

        System.out.printf("Za uneseni tekst (" + korisnickiUnos + ") statistika korištenih znakova je:\n\t Slova: " + slova + "\n\t Brojevi: " + brojevi + "\n\t Ostali znakovi: " + ostaliZnakovi);

    }
}
