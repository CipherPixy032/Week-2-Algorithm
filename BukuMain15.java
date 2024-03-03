class Buku {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    double harga;
    void tampilInformasi() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
        System.out.println();
    }
    void terjual(int jml) {
        stok -= jml;
        System.out.println(jml + " buku terjual. Stok saat ini: " + stok);
    }
    void gantiHarga(double hrg) {
        harga = hrg;
        System.out.println("Harga buku berhasil diubah menjadi: " + harga);
    }
}

public class BukuMain15 {
    public static void main(String[] args) {
        Buku bk1 = new Buku();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
    }
}
