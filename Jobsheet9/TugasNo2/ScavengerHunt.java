package Jobsheet9.TugasNo2;
import java.util.Scanner;
public class ScavengerHunt {
    Node head;
    Node tail;
    
        // Methode untuk menambahkan titik baru ke dalam scavanger hunt
        public void addPoint(String question, String answer) {
            Node newNode = new Node(question, answer); //membuat node baru
            if (head == null) { //memeriksa apakah node head adalah null (kosong)
                    head = tail = newNode; //mengatur head dan tail ke node baru jika linkedd list kosong
                } else { //jika head bukan null (tidak kosong)
                    tail.nextPoint = newNode; //mengatur next node terakhir ke node baru
                    newNode.prevPoint = tail; //mengatur prev node terakhir ke node baru
                    tail = newNode; //mengatur node baru sbg tail
                }
            }
    

        // Method untuk memainkan
        public void play() {
            Scanner scanner = new Scanner(System.in);
            Node current = head; // Mulai dari node pertama
            Node lastWrongNode = null; // Menyimpan node terakhir yang jawabannya salah
        
            while (current != null) { //looping sampai node terakhir (null)
                System.out.println("Pertanyaan: " + current.question); //mencetak pertanyaan dari node saat ini
                System.out.print("Jawaban: ");
                String jawaban = scanner.nextLine().toLowerCase();
                
                // Periksa apakah jawaban benar
                if (jawaban.equals(current.answer.toLowerCase())) { 
                    System.out.println("Jawaban benar!\n");
                    current = current.nextPoint; // Lanjut ke node berikutnya
                    lastWrongNode = null; // Reset node terakhir yang jawabannya salah
                // Jawaban salah
                } else {
                    System.out.println("Maaf, jawaban Anda salah. Coba lagi.\n");
                    System.out.print("Apakah Anda ingin kembali ke pertanyaan sebelumnya? (Y/T): ");
                    String kembali = scanner.nextLine().toLowerCase();
        
                    if (kembali.equals("y")) { //memeriksa apakah user ingin kembali ke pertanyaan sebelumnya
                        if (lastWrongNode != null) { //memeriksa apakah ada pertanyaan sebelumnya yang dijawab salah
                            current = lastWrongNode; //kembali ke pertanyaan sebelumnya
                            System.out.println("Kembali ke pertanyaan sebelumnya.\n");
                        } else { //jika tidak memiliki jawaban salah
                            System.out.println("Anda tidak memiliki pertanyaan sebelumnya yang dijawab salah.\n");
                        }
                    } else { //jika tidak memilih kembali ke pertanyaan yg salah
                        System.out.println("Lanjut ke pertanyaan berikutnya.\n");
                        lastWrongNode = current; //menyimpan node saat ini sebagai node terakhir yang jawabannya salah
                        current = current.nextPoint; // Lanjut ke pertanyaan berikutnya
                    }
                    
                }
            }
        
            scanner.close();
            System.out.println("============================================");
            System.out.println("|   SELAMAT ANDA MENEMUKAN HARTA KARUN!!!  |");
            System.out.println("============================================");
        }
    

}

    // public void addPoint(String question, String answer) {
    //     Node newNode = new Node(question, answer);
    //     if (head == null) {
    //         head = newNode;
    //     } else {
    //         Node current = head;
    //         while (current.nextPoint != null) {
    //             current = current.nextPoint;
    //         }
    //         current.nextPoint = newNode;
    //     }
    // }

    // public void play() {
    //     Scanner scanner = new Scanner(System.in);
    //     Node current = head;
    //     while (current != null) {
    //         System.out.println("Pertanyaan: " + current.question);
    //         System.out.print("Jawaban: ");
    //         String jawaban = scanner.nextLine().trim().toLowerCase();
    //         if (jawaban.equals(current.answer.toLowerCase())) {
    //             System.out.println("Jawaban benar!\n");
    //             current = current.nextPoint;
    //         } else {
    //             System.out.println("Maaf, jawaban Anda salah. Coba lagi.\n");
    //         }
    //     }
    //     scanner.close();
    //     System.out.println("============================================");
    //     System.out.println("|   SELAMAT ANDA MENEMUKAN HARTA KARUN!!!  |");
    //     System.out.println("============================================");

    // }
