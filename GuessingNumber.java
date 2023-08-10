import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secret, guess;
        boolean pass = false;

        secret = 1 + (int)(Math.random() * 10);

        System.out.println("Hallo, aku memikirkan angka dari 1 sampai 10.");
        System.out.println("Kamu harus menebaknya dalam 3 kali percobaan.");
        System.out.println("Tuliskan pilihan Anda:");

        for (int i = 0; i < 3; i++) {
            guess = input.nextInt();
            if (guess == secret) {
                System.out.println("BENAR");
                System.out.println("Kamu telah memenangkan permainan");
                pass = true;
                break;
            } else if (Math.abs(guess - secret) == 1) {
                System.out.println("PANAS");
            } else if (Math.abs(guess - secret) == 2) {
                System.out.println("HANGAT");
            } else {
                System.out.println("DINGIN");
            }
        }

        if (!pass) { // Tambahkan kondisi ini untuk menampilkan pesan kalah
            System.out.println("Kamu kalah dalam permainan");
            System.out.println("Nomber yang benar: " + secret + ".");
        }
    }
}





