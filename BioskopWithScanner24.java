import java.util.Scanner;
public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
            case 1:
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan Kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                    } else {
                        System.out.println("Kursi sudah terisi oleh penonton lain. Silakan pilih kursi lain.");
                    }
                } else {
                    System.out.println("Baris atau kolom kursi tidak tersedia.");
                }
                System.out.print("Input penonton lainnya? (y/n): ");
                next = sc.nextLine();
    
                if (next.equalsIgnoreCase("n"))
                break;

            case 2:
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String namaPenonton = (penonton[i][j] != null) ? penonton[i][j] : "***";
                        System.out.println("Baris Kursi ke- " + (i + 1) + ", Kolom ke- " + (j + 1) + ": " + namaPenonton);
                    }
                }
                break;

            case 3:
                sc.close();
                System.out.println("Terima kasih!");
                System.exit(0);
                break;

                }
        }
    }
}