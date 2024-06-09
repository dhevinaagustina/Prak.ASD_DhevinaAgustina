package JobsheetGraph;

public class Graph {
    public int numVertices; // Deklarasi variabel untuk menyimpan jumlah vertex
    public int[][] adjMatrix; // Deklarasi matriks untuk menyimpan adjacency matrix (matriks ketetanggaan)

    // Konstruktor
    public Graph(int numVertices) { // Mendefinisikan konstruktor yang menerima jumlah vertex sebagai parameter
        this.numVertices = numVertices; // Menginisialisasi jumlah vertex
        this.adjMatrix = new int[numVertices][numVertices]; // Menginisialisasi adjacency matrix
    }

    // Method untuk menambahkan edge (sisi) antara dua vertex dengan bobot tertentu
    public void addEdge(int i, int j, int weight) { // Mendefinisikan method untuk menambahkan edge antara dua vertex
        if (i < adjMatrix.length && j < adjMatrix.length) { // Memeriksa apakah indeks sesuai dengan ukuran adjacency matrix
            adjMatrix[i][j] = weight; // Menambahkan edge antara vertex i dan j dengan bobot tertentu
            adjMatrix[j][i] = weight; // Karena graph tidak berarah, maka edge antara j dan i juga ditambahkan dengan bobot yang sama
        } else {
            System.out.println("Index harus sesuai dengan vertex"); // Menampilkan pesan jika indeks tidak sesuai dengan ukuran adjacency matrix
        }
    }

    // Method untuk menghapus edge antara dua vertex
    public void removeEdge(int i, int j) { // Mendefinisikan method untuk menghapus edge antara dua vertex
        adjMatrix[i][j] = 0; // Menghapus edge antara vertex i dan j
        adjMatrix[j][i] = 0; // Menghapus edge antara vertex j dan i
    }

    // Method untuk mendapatkan informasi apakah terdapat edge antara dua vertex
    public boolean getEdge(int i, int j) { // Mendefinisikan method untuk mendapatkan informasi apakah terdapat edge antara dua vertex
        return adjMatrix[i][j] != 0; // Mengembalikan true jika terdapat edge antara vertex i dan j, dan false jika tidak
    }

    // Method untuk mendapatkan derajat (degree) dari setiap vertex dalam graph
    public void getDegree() { // Mendefinisikan method untuk mendapatkan derajat dari setiap vertex dalam graph
        for (int i = 0; i < numVertices; i++) { // Iterasi melalui setiap vertex
            int degree = 0; // Menginisialisasi derajat vertex
            for (int j = 0; j < numVertices; j++) { // Iterasi melalui setiap vertex lainnya
                if (adjMatrix[i][j] != 0) { // Memeriksa apakah terdapat edge antara vertex i dan j
                    degree++; // Menambahkan satu ke derajat vertex i
                }
            }
            System.out.println("Degree dari vertex " + i + ": " + degree); // Mencetak derajat vertex i
        }
    }

    // Method untuk mencetak adjacency matrix dari graph
    public void print() { // Mendefinisikan method untuk mencetak adjacency matrix dari graph
        for (int i = 0; i < numVertices; i++) { // Iterasi melalui setiap baris adjacency matrix
            System.out.print(i + ": "); // Mencetak nomor vertex

            for (int j = 0; j < numVertices; j++) { // Iterasi melalui setiap kolom adjacency matrix
                System.out.print(adjMatrix[i][j] + " "); // Mencetak bobot edge antara vertex i dan j
            }

            System.out.println(); // Pindah ke baris baru setelah mencetak setiap baris adjacency matrix
        }
    }
}
