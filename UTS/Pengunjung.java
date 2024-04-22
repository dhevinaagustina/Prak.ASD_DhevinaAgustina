package UTS;

public class Pengunjung {
    private String kategori;
    private String nama;
    private int durasi; // dalam jam

    public Pengunjung(String kategori, String nama, int durasi) {
        this.kategori = kategori;
        this.nama = nama;
        this.durasi = durasi;
    }

    public String getKategori() {
        return kategori;
    }

    public String getNama() {
        return nama;
    }

    public int getDurasi() {
        return durasi;
    }

    public int hitungBiaya() {
        int biaya;
        if (kategori.equalsIgnoreCase("anak")) {
            biaya = durasi * 10000;
        } else if (kategori.equalsIgnoreCase("dewasa")) {
            biaya = durasi * 20000;
        } else {
            biaya = 0;
        }
        return biaya;
    }
}
