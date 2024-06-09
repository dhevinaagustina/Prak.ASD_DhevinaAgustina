package Jobsheet9.TugasNo2;

public class ScavengerMain {
    public static void main(String[] args) {
        ScavengerHunt huntGame = new ScavengerHunt();

        // Menambahkan point-point dan kunci jawabannya
        huntGame.addPoint("Struktur data apa yang konsepnya FIFO?", "Queue");
        huntGame.addPoint("Disebut apa tipe data untuk satu karakter", "Char");
        huntGame.addPoint("Dalam do - while loop apakah harus melakukan iterasi minimal 1 kali? (ya/tidak)", "ya");
        huntGame.addPoint("Tipe data tanpa kembalian disebut?", "Void");
        huntGame.addPoint("Kondisi dimana stack penuh disebut?", "Stack overflow");


        // Memulai permainan
        System.out.println("Selamat datang di Scavenger Hunt!");
        System.out.println("Anda harus menjawab pertanyaan 5 untuk memukan harta karun.");
        System.out.println();
        huntGame.play();
    }
}
