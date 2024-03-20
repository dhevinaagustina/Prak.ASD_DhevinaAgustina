package Jobsheet4W5;

public class DemoHotel {
    public static void main(String[] args) {
        Hotel[] hotels = new Hotel[5];
        hotels[0] = new Hotel("Hotel A", 2000000, 5);
        hotels[1] = new Hotel("Hotel B", 100000, 4);
        hotels[2] = new Hotel("Hotel C", 1200000, 3);
        hotels[3] = new Hotel("Hotel D", 900000, 2);
        hotels[4] = new Hotel("Hotel E", 60000, 1);
    
        // Mengurutkan berdasarkan harga
        Hotel.bubbleSortHarga(hotels);
        System.out.println("Menurut harga(murah - mahal):");
        for (Hotel hotel : hotels) {
            System.out.println(hotel.nama + ", " + "Rp."+hotel.harga + ", " + hotel.rating);
        }
        System.out.println();
        // Mengurutkan berdasarkan rating
        Hotel.selectionSortRating(hotels);
        System.out.println("Menurut rating(tinggi - rendah): ");
        for (Hotel hotel : hotels) {
            System.out.println(hotel.nama + ", " + "Rp."+ hotel.harga + ", " + hotel.rating);
        }
    }
}
