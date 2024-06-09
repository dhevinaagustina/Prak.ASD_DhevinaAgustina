package JobsheetStack;

public class Stack {
    public int size;
    public String [] data;
    public int top;

    public Stack(int size) {
        this.size = size;
        this.data = new String[size];
        this.top = -1;
    }

    //Method unutk memeriksa apakah stack kosong
    public boolean isEmpty() {
        return (top == -1); //mengembalikan true jika top adalah-1 (kosong)
    }

    //Method untuk memeriksa apakah stack penuh
    public boolean isFull() {
        return (top == size - 1); //mengembalikan true jika nilai top adalah nilai size-1
    }

    //Method untuk menambahkan elemen ke stack
    public void push(String dt) {
        if (!isFull()){ //memeriksa apakah stack tidak penuh
            top++; //increment nilai top
            data[top] = dt; //menambahkan elemen baru di posisi top
        } else { //jika stack penuh
            System.out.println("Stack penuh"); //print ketika stack penuh
        }
    }
    
    //Method untuk mengeluarkan elemen dari stack
    public String pop() {
        if (!isEmpty()){ // memeriksa apakah stack tidak kosong
            String temp = data[top]; // menyimpan elemen top of stack kedalam variable temporary
            top--; //decrement nilai top
            return temp; //mengembalikan elemen pada variable temporary
        }else{ //jika stack kosong
            System.out.println("Stack kosong"); //print ketika stack kosong
            return " "; //mengembalikan string kosong
        }
    }

    //Method untuk melihat elemen teratas stack tanpa mengeluarkannya
    public String peek() {
        if (!isEmpty()) { //memeriksa apakah stack tidak kosong
            return data[top]; //mengembalikan elemen top of stack
        }else{ //jika stack kosong
            System.out.println("Stack kosong"); //print ketika stack kosong
            return null; //mengembalikan nilai null
        }
    }

    //Method untuk mengosongkan stack
    public void clear() { 
        top = -1; //reset nilai top of stack menjadi -1 (menunjukan bahwa stack kosong)
    }

    //Method untuk mencetak semua elemen di stack
    public void print() {
        for (int i = top; i >= 0; i--) { //loop dari top ke bottom stack
            System.out.println(data[i]); //mencetak setiap elemen
        }
    }
}
