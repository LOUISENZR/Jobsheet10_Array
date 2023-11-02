import java.util.Scanner;

public class BioskopWithScanner16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            
            int menu = sc.nextInt();
            sc.nextLine();  // Membersihkan karakter newline

            switch (menu) {
                case 1:
                    System.out.print("Masukan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();  // Membersihkan karakter newline setelah nextInt()
                    
                    if (isValidSeat(baris, kolom, penonton)) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil diinput.");
                    } else {
                        System.out.println("Input baris/kolom diluar batas atau sudah terisi!");
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang valid (1/2/3).");
            }

            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    // Fungsi untuk memeriksa apakah kursi sudah terisi atau diluar batas
    public static boolean isValidSeat(int baris, int kolom, String[][] penonton) {
        return baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length && penonton[baris - 1][kolom - 1] == null;
    }
}
