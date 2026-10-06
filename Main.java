// Main.java
// Program utama: Sistem Data Buku Perpustakaan menggunakan Single Linked List.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList daftar = new LinkedList();
        int pilihan;

        do {
            // Tampilkan menu
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            // Validasi input angka
            while (!sc.hasNextInt()) {
                System.out.print("Masukkan angka 1-5: ");
                sc.next();
            }
            pilihan = sc.nextInt();
            sc.nextLine(); // bersihkan newline

            switch (pilihan) {
                case 1: // Tambah Buku
                    System.out.print("Masukkan Kode Buku: ");
                    String kode = sc.nextLine();
                    // Validasi: kode maksimal 5 karakter
                    if (kode.length() > 5) {
                        System.out.println("Kode buku maksimal 5 karakter!");
                        break;
                    }
                    System.out.print("Masukkan Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = sc.nextLine();
                    daftar.tambahBuku(kode, judul, penulis);
                    break;

                case 2: // Hapus Buku
                    daftar.hapusBuku();
                    break;

                case 3: // Cari Buku
                    System.out.print("Masukkan Kode Buku: ");
                    String cari = sc.nextLine();
                    daftar.cariBuku(cari);
                    break;

                case 4: // Lihat Semua Buku
                    daftar.tampilkanSemua();
                    break;

                case 5: // Keluar
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
