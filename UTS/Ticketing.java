package UTS;
import java.util.Scanner;
public class Ticketing {
    private Pengunjung[] pengunjungs = new Pengunjung[100]; // Menggunakan array dengan kapasitas 100
    private int jumlahPengunjung = 0; // Menghitung jumlah pengunjung yang telah ditambahkan

    public void inputData() {
        if (jumlahPengunjung >= pengunjungs.length) {
            System.out.println("Kapasitas penuh, tidak bisa menambahkan data.");
            return;
        }
        //Input data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kategori pengunjung (anak/dewasa): ");
        String kategori = scanner.nextLine();
        System.out.print("Nama pengunjung: ");
        String nama = scanner.nextLine();
        System.out.print("Durasi bermain (jam): ");
        int durasi = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Menghitung biaya berdasarkan kategori dan durasi
        int biayaPerJam;
        if (kategori.equalsIgnoreCase("anak")) {
            biayaPerJam = 10000; // Biaya per jam untuk anak
        } else if (kategori.equalsIgnoreCase("dewasa")) {
            biayaPerJam = 20000; // Biaya per jam untuk dewasa
        } else {
            System.out.println("Kategori tidak valid.");
            return;
        }
        int biaya = durasi * biayaPerJam;
        System.out.println("Biaya yang dikeluarkan: " + biaya);

        Pengunjung pengunjung = new Pengunjung(kategori, nama, durasi);
        pengunjungs[jumlahPengunjung] = pengunjung; // Menambahkan pengunjung ke array
        jumlahPengunjung++; // Meningkatkan jumlah pengunjung
        System.out.println("Data berhasil ditambahkan.");
    }

    public void cariData() {
        //sequential search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama pengunjung yang dicari: ");
        String nama = scanner.nextLine();
        for (int i = 0; i < jumlahPengunjung; i++) {
            String[] namaPengunjungKataKunci = pengunjungs[i].getNama().split("\\s+");//memisahkan nama
            for (String kata : namaPengunjungKataKunci) {
                if (kata.toLowerCase().contains(nama.toLowerCase())) {
                    System.out.println("Tipe Pengunjung: " + pengunjungs[i].getKategori() + ", Nama: " + pengunjungs[i].getNama() + ", Durasi: " + pengunjungs[i].getDurasi() + ", Biaya: " + pengunjungs[i].hitungBiaya());
                    break; // Keluar dari loop kata saat kata kunci ditemukan
                }
            }
        }
        if (jumlahPengunjung == 0) {
            System.out.println("Data tidak ditemukan.");
        }
    }
    
    public void lihatData() {
        // Mengurutkan data berdasarkan biaya dengan bubble sort
        for (int i = 0; i < jumlahPengunjung - 1; i++) {
            for (int j = i + 1; j < jumlahPengunjung; j++) {
                if (pengunjungs[i].hitungBiaya() > pengunjungs[j].hitungBiaya()) {
                    Pengunjung temp = pengunjungs[i];
                    pengunjungs[i] = pengunjungs[j];
                    pengunjungs[j] = temp;
                }
            }
        }

        for (int i = 0; i < jumlahPengunjung; i++) {
            System.out.println( "Tipe Pengunjung: " + pengunjungs[i].getKategori() + ", Nama: " + pengunjungs[i].getNama()+ ", Durasi: " + pengunjungs[i].getDurasi() + ", Biaya: " + pengunjungs[i].hitungBiaya());
        }
    }

    public void laporan() {
        int totalAnak = 0;
        int totalDewasa = 0;

        for (int i = 0; i < jumlahPengunjung; i++) {
            if (pengunjungs[i].getKategori().equalsIgnoreCase("anak")) {
                totalAnak += 1;
            } else if (pengunjungs[i].getKategori().equalsIgnoreCase("dewasa")) {
                totalDewasa += 1;
            }
        }

        System.out.println("Total Pendapatan");
        System.out.println("Total pendapatan dewasa: " + totalDewasa);
        System.out.println("Total pendapatan anak: " + totalAnak);
    }
}
