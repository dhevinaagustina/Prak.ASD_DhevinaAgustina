package Jobsheet2;

public class Snake {
    int x , y;
     
    // Konstruktor untuk menginisialisasi posisi awal ular
    public Snake(int newX, int newY) {
        // Mengatur nilai x sesuai dengan parameter newX
        x = newX;
        // Mengatur nilai y sesuai dengan parameter newY
        y = newY;
    }

    // Metode untuk menggerakkan ular ke kiri
    public void moveLeft() {
        // Mengurangi nilai x untuk bergerak ke kiri
        x--;
    }

    // Metode untuk menggerakkan ular ke kanan
    public void moveRight() {
        // Menambahkan nilai x untuk bergerak ke kanan
        x++;
    }

    // Metode untuk menggerakkan ular ke atas
    public void moveUp() {
        // Menambahkan nilai y untuk bergerak ke atas
        y++;
    }

    // Metode untuk menggerakkan ular ke bawah
    public void moveDown() {
        // Mengurangi nilai y untuk bergerak ke bawah
        y--;
    }

    // Metode untuk mencetak posisi saat ini dari ular
    public void printPosition() {
        // Menampilkan posisi ular dalam format (x, y)
        System.out.println("Snake position: (" + x + ", " + y + ")");
    }
}
