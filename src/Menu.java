
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("SELAMAT DATANG SILAHKAN PILIH MENU ANDA ");
        System.out.println(" ===================================================== ");
        System.out.println("| 1. Nasi Goreng  |  2. Nasi Ramas   |  3. Nasi Telur  |");
        System.out.println("| 4. Mie  rebus   |  5. MIe  Goreng  |  6. Mie Ayam    |");
        System.out.println("| 7. Burger       |  8. Roti Bakar   |  9. Roti Canai  |");
        System.out.println("|10. Ayam Geprek  | 11. Ayam Bakar   | 12. Ayam Golek  |");
        System.out.println(" ===================================================== ");
        String [] makanan = {"INi awal","Nasi Goreng","Nasi Ramas","Nasi terlu","Mie rebus","MIe Goreng","Mie Ayam","Burger","Roti Bakar","Roti Canai","Ayam Geprek","Ayam Bakar","Ayam Golek" };
        System.out.print("Jenis makanan yang ingin di pesan : ");
        int input = in.nextInt();
        String [] makanan1 = new String[input];
        for (int a = 0 ; a <= input ; a++){
            System.out.println("Makanan ke- " + a );
            makanan1[a] = in.nextLine();
        }
        for (int a =1; a <= input; a++){
            System.out.println("Makanan; " + a + ": " + makanan1[a]);
        }





    }


}
