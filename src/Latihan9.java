import java.util.Scanner;
class Kasir{
    String namaBarang;
    int jumlahBarang;
    int hargaBarang;
    int bayar;
    int kembalian;
    Scanner sc = new Scanner(System.in);


    void hitung () {
        System.out.print(" Pilih barang: ");
        String barang = sc.next();
    }
     void jumlah (){
        System.out.print("Jumlah Barang: ");
        int jumlah = sc.nextInt();
        System.out.print("Harga Barang: ");
        int harga = sc.nextInt();
        int total = jumlah * harga;
        System.out.println("Total= Rp " + total);
        System.out.print("Masukkan uang= ");
        int bayar1 = sc.nextInt();
        System.out.println("nominal uang= Rp " +bayar1 );
        int kembalian = bayar1 - total;
        System.out.println("Kembalian= Rp " + kembalian);
    }

}


public class Latihan9 {
    public static void main(String[] args) {
        System.out.println("|=============================================================================|");
        System.out.println("|                           Daftar barang dan Harga                           |");
        System.out.println("|=============================================================================|");
        System.out.println("|             Nama Barang              ||                Harga                |");
        System.out.println("|======================================||=====================================|");
        System.out.println("|             Pensil                   ||              Rp. 2000               |");
        System.out.println("|             Pena                     ||              Rp. 3000               |");
        System.out.println("|             Tipex                    ||              Rp. 3500               |");
        System.out.println("|             Spidol                   ||              Rp. 5000               |");
        System.out.println("|             Peruncing                ||              Rp. 2500               |");
        System.out.println("|             Buku                     ||              Rp. 4000               |");
        System.out.println("|=============================================================================|");
        Kasir kasir = new Kasir();
        kasir.hitung();
        kasir.jumlah();


    }
}
