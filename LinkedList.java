// LinkedList.java
// Class LinkedList mengelola kumpulan Node (daftar buku) dengan Single Linked List.
public class LinkedList {
    private Node head; // penunjuk ke node pertama
    private int jumlah; // menyimpan total buku

    public LinkedList() {
        this.head = null;
        this.jumlah = 0;
    }

    // ===== TAMBAH BUKU (PUSH) =====
    // Menambahkan buku baru di AKHIR daftar.
    public void tambahBuku(String kodeBuku, String judul, String penulis) {
        Node baru = new Node(kodeBuku, judul, penulis);
        if (head == null) {
            // daftar masih kosong, node baru menjadi head
            head = baru;
        } else {
            // telusuri sampai node terakhir, lalu sambungkan
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = baru;
        }
        jumlah++;
        System.out.println("Data berhasil ditambahkan!");
    }

    // ===== HAPUS BUKU (POP) =====
    // Menghapus buku TERAKHIR dari daftar.
    public void hapusBuku() {
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus.");
            return;
        }
        if (head.next == null) {
            // hanya ada satu node
            System.out.println("Buku '" + head.judul + "' berhasil dihapus.");
            head = null;
        } else {
            // telusuri sampai node sebelum terakhir
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            System.out.println("Buku '" + temp.next.judul + "' berhasil dihapus.");
            temp.next = null; // putuskan node terakhir
        }
        jumlah--;
    }

    // ===== CARI BUKU =====
    // Mencari buku berdasarkan kodeBuku.
    public void cariBuku(String kodeBuku) {
        Node temp = head;
        while (temp != null) {
            if (temp.kodeBuku.equalsIgnoreCase(kodeBuku)) {
                System.out.println("Buku ditemukan:");
                System.out.println("Kode: " + temp.kodeBuku + " | Judul: " + temp.judul + " | Penulis: " + temp.penulis);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Buku tidak ditemukan.");
    }

    // ===== TAMPILKAN SEMUA BUKU =====
    public void tampilkanSemua() {
        if (head == null) {
            System.out.println("Daftar buku masih kosong.");
            return;
        }
        System.out.println("Daftar Buku:");
        Node temp = head;
        while (temp != null) {
            System.out.println("Kode: " + temp.kodeBuku + " | Judul: " + temp.judul + " | Penulis: " + temp.penulis);
            temp = temp.next;
        }
        System.out.println("Total Buku: " + jumlah);
    }

    public int getJumlah() {
        return jumlah;
    }
}
