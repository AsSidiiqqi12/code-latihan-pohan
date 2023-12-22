import java.util.Scanner;

public class Menu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar makanan
        String[] menuItems = {"Nasi Goreng", "Mie Goreng", "Ayam Goreng", "Sate Ayam"};
        double[] menuPrices = {15.0, 12.0, 20.0, 25.0};

        // Tampilkan menu
        System.out.println("Menu Makanan:");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i] + " - Rp" + menuPrices[i]);
        }

        // Input pilihan user
        System.out.print("Masukkan nomor makanan yang diinginkan (0 untuk selesai): ");
        int choice = scanner.nextInt();

        // Inisialisasi total harga
        double totalHarga = 0;

        // Proses pilihan user
        while (choice != 0) {
            if (choice >= 1 && choice <= menuItems.length) {
                System.out.print("Masukkan jumlah " + menuItems[choice - 1] + " yang diinginkan: ");
                int jumlah = scanner.nextInt();

                // Hitung total harga
                totalHarga += menuPrices[choice - 1] * jumlah;

                System.out.print("Masukkan nomor makanan yang diinginkan (0 untuk selesai): ");
                choice = scanner.nextInt();
            } else {
                System.out.println("Nomor makanan tidak valid. Silakan coba lagi.");
                System.out.print("Masukkan nomor makanan yang diinginkan (0 untuk selesai): ");
                choice = scanner.nextInt();
            }
        }

        // Tampilkan total harga
        System.out.println("Total Harga: Rp" + totalHarga);

        // Tutup scanner
        scanner.close();
    }
}
