package Jobsheet2;

public class Dragon {
    int x, y, direction;
   
    // Konstruktor untuk menginisialisasi posisi dan arah
    public Dragon(int newX, int newY, int initialDirection){
        // Mengatur nilai x sesuai dengan parameter newX
        x = newX;
        // Mengatur nilai y sesuai dengan parameter newY
        y = newY;
        // Mengatur nilai direction sesuai dengan parameter initialDirection
        direction = initialDirection;
    }

    // Metode untuk mengubah arah naga
    public void changeDirection(int newDirection){
        // Memeriksa apakah arah baru valid (1-4)
        if (newDirection >= 1 && newDirection <= 4){
            // Mengubah arah menjadi newDirection jika valid
            direction = newDirection;
        } else {
            // Menampilkan pesan kesalahan jika arah baru tidak valid
            System.out.println("Arah baru tidak valid");
        }
    }

    // Metode untuk menggerakkan naga
    public void move(int steps){
        // Memeriksa arah saat ini dan menggerakkan naga sesuai jumlah langkah (steps)
        switch (direction) {
            case 1: // Jika arah ke atas (direction = 1)
                // Menambahkan steps ke koordinat y (bergerak ke atas)
                y += steps;
                break;
            case 2: // Jika arah ke kanan (direction = 2)
                // Menambahkan steps ke koordinat x (bergerak ke kanan)
                x += steps;
                break;
            case 3: // Jika arah ke bawah (direction = 3)
                // Mengurangi steps dari koordinat y (bergerak ke bawah)
                y -= steps;
                break;
            case 4: // Jika arah ke kiri (direction = 4)
                // Mengurangi steps dari koordinat x (bergerak ke kiri)
                x -= steps;
                break;
            default:
                // Menampilkan pesan kesalahan jika arah tidak valid
                System.out.println("Arah tidak valid.");
        }
    }

    // Metode untuk mencetak status posisi dan arah naga
    public void printStatus(){
        // Menampilkan posisi naga dalam format (x, y)
        System.out.println("Posisi: (" + x + ", " + y + ")");
        // Menampilkan arah naga berdasarkan nilai direction
        switch (direction) {
            case 1:
                // Arah ke atas
                System.out.println("Arah: atas");
                break;
            case 2:
                // Arah ke kanan
                System.out.println("Arah: kanan");
                break;
            case 3:
                // Arah ke bawah
                System.out.println("Arah: bawah");
                break;
            case 4:
                // Arah ke kiri
                System.out.println("Arah: kiri");
                break;
            default:
                // Menampilkan pesan kesalahan jika arah tidak valid
                System.out.println("Arah tidak valid.");
        }
    }
}
