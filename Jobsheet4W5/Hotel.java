package Jobsheet4W5;

public class Hotel {
    String nama;
    int harga;
    int rating;

    //konstraktor
    public Hotel(String nama, int harga, int rating) {
        this.nama = nama;
        this.harga = harga;
        this.rating = rating;
    }

    //method bubble sort untuk harga
    public static void bubbleSortHarga(Hotel[] hotels) {
        boolean tukar;
        do {
            tukar = false;
            for (int i = 0; i < hotels.length - 1; i++) {
                if (hotels[i].harga > hotels[i + 1].harga) {
                    Hotel temp = hotels[i];
                    hotels[i] = hotels[i + 1];
                    hotels[i + 1] = temp;
                    tukar = true;
                }
            }
        } while (tukar);
    }

    //metod selection sort untuk rating
    public static void selectionSortRating(Hotel[] hotels) {
        for (int i = 0; i < hotels.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < hotels.length; j++) {
                if (hotels[j].rating > hotels[minIndex].rating) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Hotel temp = hotels[i];
                hotels[i] = hotels[minIndex];
                hotels[minIndex] = temp;
            }
        }
    }
}
