public class Buku15 {
    String judul, pengarang;
    int halaman, stok, harga;
    public Buku15() {}
    public Buku15(String judul, String pengarang, int halaman, int stok, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.halaman = halaman;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}

class BukuMain {
    public static void main(String[] args) {
        Buku15 bk1 = new Buku15();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();


        Buku15 bk2 = new Buku15("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        Buku15 bookKrisna = new Buku15("The Adventures of Krisna", "Krisna Putra", 250, 50, 80000);
    }
}