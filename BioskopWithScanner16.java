import java.util.Scanner;

public class BioskopWithScanner16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();  // Membersihkan karakter newline setelah nextInt()

            penonton[baris - 1][kolom - 1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
