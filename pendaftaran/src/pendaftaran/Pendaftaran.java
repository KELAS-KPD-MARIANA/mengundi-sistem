package Pendaftaran;
import java.util.Scanner;
public class Pendaftaran {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur anda : ");
        int umur = input.nextInt();

        System.out.print("Adakah anda sudah mendaftar? (true/false): ");
        boolean Mendaftar = Scanner.nextBoolean();

        if (umur < 18) {
            System.out.println("Anda terlalu muda dan tidak layak mengundi");
        } else if (umur >= 18 && Mendaftar) {
            System.out.println("Anda layak mengundi.");
        } else if (umur >= 18 && !Mendaftar) {
            System.out.println("Anda perlu mendaftar dahulu sebelum mengundi");
        }
    }
}
