package JobsheetGraph.TugasGraph;

public class GraphCity {
    public String[] cities;
    public int[][] adjMatrix;
    public int cityCount;


    // Konstraktor
    public GraphCity(int numOfCities) { // Mendefinisikan konstruktor yang menerima jumlah kota sebagai parameter
        cities = new String[numOfCities]; // Menginisialisasi array nama kota
        adjMatrix = new int[numOfCities][numOfCities]; // Menginisialisasi matriks jarak antar kota
        cityCount = 0; // Menginisialisasi jumlah kota menjadi 0
    }

    // Method untuk menambahkan kota
    public void addCity(String city) { // Mendefinisikan method untuk menambahkan kota ke array
        if (cityCount < cities.length) { // Memeriksa apakah masih ada ruang kosong di array kota
            cities[cityCount++] = city; // Menambahkan kota ke array
        }
    }

    // Method untuk menambahkan edge (jarak) tiap vertex (kota)
    public void addEdge(String city1, String city2, int distance) { // Mendefinisikan method untuk menambahkan edge antara dua kota
        int index1 = getCityIndex(city1); // Mendapatkan indeks kota pertama dalam array kota
        int index2 = getCityIndex(city2); // Mendapatkan indeks kota kedua dalam array kota
        if (index1 != -1 && index2 != -1) { // Memastikan kedua kota ditemukan dalam array
            adjMatrix[index1][index2] = distance; // Menambahkan jarak dari kota pertama ke kota kedua dalam matriks
            adjMatrix[index2][index1] = distance; // Untuk graf tidak berarah, menambahkan jarak dari kota kedua ke kota pertama juga
        }
    }

    // Method untuk mencetak isi dalam graph
    public void printGraph() { // Mendefinisikan method untuk mencetak graph
        for (int i = 0; i < cityCount; i++) { // Iterasi melalui setiap kota
            System.out.println(cities[i] + ":"); // Mencetak nama kota
            for (int j = 0; j < cityCount; j++) { // Iterasi melalui setiap kota lainnya
                if (adjMatrix[i][j] != 0) { // Memeriksa apakah ada jarak antara dua kota
                    System.out.println(" - Jarak ke " + cities[j] + ": " + adjMatrix[i][j]); // Mencetak jarak antara kota tersebut dengan kota lainnya
                }
            }
        }
    }

    // Metode untuk mendapatkan indeks suatu kota dalam array cities
    public int getCityIndex(String city) { // Mendefinisikan method untuk mendapatkan indeks kota dalam array
        for (int i = 0; i < cityCount; i++) { // Iterasi melalui setiap kota dalam array
            if (cities[i].equals(city)) { // Memeriksa apakah nama kota cocok
                return i; // Mengembalikan indeks kota jika ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika kota tidak ditemukan
    }
}
