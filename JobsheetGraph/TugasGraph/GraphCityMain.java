package JobsheetGraph.TugasGraph;
import java.util.Scanner;
public class GraphCityMain {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    
        // Input jumlah kota
        System.out.print("Input jumlah kota: "); // Menampilkan pesan untuk meminta jumlah kota dari pengguna
        int jumlahKota = sc.nextInt(); // Menerima jumlah kota dari pengguna
        sc.nextLine(); // Membersihkan karakter baru dari buffer

        GraphCity graph = new GraphCity(jumlahKota); // Membuat objek graph dengan jumlah kota yang telah ditentukan

        // Input nama kota
        for (int i = 0; i < jumlahKota; i++) { // Melakukan iterasi sebanyak jumlah kota
            System.out.print("Input nama kota: "); // Menampilkan pesan untuk meminta nama kota dari pengguna
            String namaKota = sc.nextLine(); // Menerima nama kota dari pengguna
            graph.addCity(namaKota); // Menambahkan kota ke dalam graph
        }

        // Input jumlah jalan
        System.out.print("Input jumlah jalan: "); // Menampilkan pesan untuk meminta jumlah jalan dari pengguna
        int jumlahJalan = sc.nextInt(); // Menerima jumlah jalan dari pengguna
        sc.nextLine(); // Membersihkan karakter baru dari buffer

        for (int i = 0; i < jumlahJalan; i++) { // Melakukan iterasi sebanyak jumlah jalan
            System.out.print("Kota 1: "); // Menampilkan pesan untuk meminta nama kota pertama dari pengguna
            String kota1 = sc.nextLine(); // Menerima nama kota pertama dari pengguna
            System.out.print("Kota 2: "); // Menampilkan pesan untuk meminta nama kota kedua dari pengguna
            String kota2 = sc.nextLine(); // Menerima nama kota kedua dari pengguna
            System.out.print("Jarak " + kota1 + " - " + kota2 + ": "); // Menampilkan pesan untuk meminta jarak antara kedua kota dari pengguna
            int jarak = sc.nextInt(); // Menerima jarak antara kedua kota dari pengguna
            sc.nextLine(); // Membersihkan karakter baru dari buffer

            graph.addEdge(kota1, kota2, jarak); // Menambahkan edge antara kedua kota dengan jarak yang ditentukan ke dalam graph
        }

        graph.printGraph(); // Mencetak isi graph yang telah dibuat
    }

}
    

