package Jobsheet10.ScavangerHunt.TugasNo2;
import java.util.Scanner;
public class ScavengerHunt {
    Node head;
    Node tail;
    
    public void addPoint(String question, String answer) {
        Node newNode = new Node(question, answer);
        if (head == null) {
                head = tail = newNode;
            } else {
                tail.nextPoint = newNode;
                newNode.prevPoint = tail;
                tail = newNode;
            }
        }
    
        public void play() {
            Scanner scanner = new Scanner(System.in);
            Node current = head; // Mulai dari node pertama
            Node lastWrongNode = null; // Menyimpan node terakhir yang jawabannya salah
        
            while (current != null) {
                System.out.println("Pertanyaan: " + current.question);
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
        
                    if (kembali.equals("y")) {
                        if (lastWrongNode != null) {
                            current = lastWrongNode;
                            System.out.println("Kembali ke pertanyaan sebelumnya.\n");
                        } else {
                            System.out.println("Anda tidak memiliki pertanyaan sebelumnya yang dijawab salah.\n");
                        }
                    } else {
                        System.out.println("Lanjut ke pertanyaan berikutnya.\n");
                        lastWrongNode = current;
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
