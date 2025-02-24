package inlamning;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MorseConverter converter = new MorseConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välj alternativ:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        try {

        if (choice == 1){
            System.out.println("Ange text att konvertera till morsekod:");
            String eng = scanner.nextLine();
            String morse = converter.toMorse(eng);
            System.out.println("Morsekod: "+ morse);
        } else if (choice == 2) {
            System.out.println("Ange morsekod att konvertera till text:");
            String morse = scanner.nextLine();
            String eng = converter.toEnglish(morse);
            System.out.println("text" + eng);

        }else
            System.out.println("ogiltigt val");
        } catch (IllegalArgumentException e) {
            System.out.println("Fel: " + e.getMessage());
        }

    }

}
