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
        if (stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("Stok tidak cukup untuk penjualan.");
        }
    }
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    int hitungHargaTotal(int jumlahTerjual) {
        return harga * jumlahTerjual;
    }
    double hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            return hargaTotal * 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return hargaTotal * 0.05;
        } else {
            return 0;
        }
    }

    double hitungHargaBayar(int jumlahTerjual) {
        int hargaTotal = hitungHargaTotal(jumlahTerjual);
        double diskon = hitungDiskon(hargaTotal);
        return hargaTotal - diskon;
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
        int hargaTotal = bk1.hitungHargaTotal(5);
        double diskon = bk1.hitungDiskon(hargaTotal);
        double hargaBayar = bk1.hitungHargaBayar(5);
        System.out.println("Harga Total: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga Bayar: Rp " + hargaBayar);

        Buku15 bk2 = new Buku15("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        hargaTotal = bk2.hitungHargaTotal(11);
        diskon = bk2.hitungDiskon(hargaTotal);
        hargaBayar = bk2.hitungHargaBayar(11);
        System.out.println("Harga Total: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga Bayar: Rp " + hargaBayar);

        Buku15 bookKrisna = new Buku15("The Adventures of Krisna", "Krisna Putra", 250, 50, 80000);
    }
}