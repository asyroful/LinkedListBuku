// Node.java
// Class Node merepresentasikan satu simpul (buku) dalam Single Linked List.
public class Node {
    String kodeBuku;   // kode buku (maksimal 5 karakter)
    String judul;      // judul buku
    String penulis;    // nama penulis
    Node next;         // referensi ke node berikutnya

    // Constructor untuk membuat node baru
    public Node(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null; // node baru belum menunjuk ke mana-mana
    }
}
