package JobsheetStack.Percobaan2;

public class Stack {
    public int size;
    public char [] data;
    public int top;

    public Stack (int size) {
        this.size = size;
        this.data = new char[size];
        this.top = -1;
    }

    // Method untuk memeriksa apakah stack kosong
    public boolean isEmpty() {
        return (top == -1); //mengembalikan true jika nilai top adalah -1 (kosong)
    }

    // Method untuk memeriksa apakah stack penuh
    public boolean isFull() {
        return (top == size -1); //mengembalikan nilai true jika nilai top adalah nilai size-1 (full)
    }

    // Method untuk menambahkan elemen ke dalam stack 
    public void push(char dt) {
        if (!isFull()) { //memeriksa apakah stack tidak penuh
            top++; //increment nilai top
            data[top] = dt; //menambahkan elemen baru di posisi top 
        }else { //jika stack penuh
            System.out.println("Stack Penuh"); //print ketika stack penuh 
        }
    }

    // Method untuk mengeluarkan elemen dari stack
    public char pop() {
        if (!isEmpty()) { //memeriksa apakah stack tidak kosong
            char temp = data[top]; //menyimpan elemen top of stack ke dalam variable temporary
            top--;  //decrement nilai top
            return temp; //mengembalikan elemen pada variable temporary
        }else{ //jika stack kosong
            return '\0'; //mengembalikan nilai null sbg indikator stack kosong
        }
    }

    // Method untuk melihat elemen top of stack tanpa mengeluarkannya
    public char peek() {
        if (!isEmpty()) { //memeriksa apakah stack tidak kosong
            return data[top]; //mengembalikan elemen top of stack
        }else { //jika stack kosong
            return '\0'; //mengembalikan nilai null sbg indikator stack kosong
        }
    }
}
