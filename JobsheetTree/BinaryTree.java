package JobsheetTree;

public class BinaryTree {
    Node root;
    int size;

    // Method untuk memeriksa apakah pohon biner kosong
    boolean isEmpty() { // Mendefinisikan method isEmpty untuk memeriksa apakah pohon biner kosong
        return root == null; // Mengembalikan true jika root adalah null, menunjukkan bahwa pohon biner kosong
    }

    // Method untuk mencari sebuah nilai dalam pohon biner
    boolean find(int data) { // Mendefinisikan method find untuk mencari sebuah nilai dalam pohon biner
        boolean hasil = false; // Mendeklarasikan variabel hasil dengan nilai awal false
        Node current = root; // Menginisialisasi node current dengan root

        while (current != null) { // Melakukan iterasi sampai current tidak null
            if (current.data == data) { // Jika nilai data pada current sama dengan data yang dicari
                hasil = true; // Mengubah nilai hasil menjadi true
                break; // Keluar dari loop
            } else if (data < current.data) { // Jika data yang dicari lebih kecil dari nilai data current
                current = current.left; // Pindah ke anak kiri dari current
            } else { // Jika data yang dicari lebih besar dari nilai data current
                current = current.right; // Pindah ke anak kanan dari current
            }
        }
        return hasil; // Mengembalikan nilai hasil, true jika data ditemukan, false jika tidak
    }

    // Method untuk menambahkan sebuah nilai ke dalam pohon biner
    void add(int data) { // Mendefinisikan method add untuk menambahkan sebuah nilai ke dalam pohon biner
        if (isEmpty()) { // Jika pohon biner kosong
            root = new Node(data); // Menjadikan node baru dengan nilai data sebagai root
        } else { // Jika pohon biner tidak kosong
            Node current = root; // Menginisialisasi node current dengan root (dimulai dari root)

            while (true) { // Melakukan iterasi sampai kondisi true (kondisi break terpenuhi)
                if (data < current.data) { // Jika data yang akan ditambahkan lebih kecil dari nilai data current
                    if (current.left != null) { // Jika anak kiri dari current tidak null
                        current = current.left; // Pindah ke anak kiri dari current
                    } else { // Jika anak kiri dari current null
                        current.left = new Node(data); // Menjadikan node baru dengan nilai data sebagai anak kiri dari current
                        break; // Keluar dari loop
                    }
                } else if (data > current.data) { // Jika data yang akan ditambahkan lebih besar dari nilai data current
                    if (current.right != null) { // Jika anak kanan dari current tidak null
                        current = current.right; // Pindah ke anak kanan dari current
                    } else { // Jika anak kanan dari current null
                        current.right = new Node(data); // Menjadikan node baru dengan nilai data sebagai anak kanan dari current
                        break; // Keluar dari loop
                    }
                } else { // Jika data yang akan ditambahkan sudah ada dalam pohon
                    break; // Keluar dari loop
                }
            }
        }
    }

    // Method untuk melakukan penelusuran pre-order pada pohon biner
    void traversePreOrder(Node node) { // Mendefinisikan method traversePreOrder untuk melakukan penelusuran pre-order pada pohon biner
        if (node != null) { // Jika node tidak null
            System.out.print(" " + node.data); // Mencetak nilai data dari node
            traversePreOrder(node.left); // Rekursif untuk menelusuri anak kiri dari node
            traversePreOrder(node.right); // Rekursif untuk menelusuri anak kanan dari node
        }
    }

    // Method untuk melakukan penelusuran post-order pada pohon biner
    void traversePostOrder(Node node) { // Mendefinisikan method traversePostOrder untuk melakukan penelusuran post-order pada pohon biner
        if (node != null) { // Jika node tidak null
            traversePostOrder(node.left); // Rekursif untuk menelusuri anak kiri dari node
            traversePostOrder(node.right); // Rekursif untuk menelusuri anak kanan dari node
            System.out.print(" " + node.data); // Mencetak nilai data dari node
        }
    }

    // Method untuk melakukan penelusuran in-order pada pohon biner
    void traverseInOrder(Node node) { // Mendefinisikan method traverseInOrder untuk melakukan penelusuran in-order pada pohon biner
        if (node != null) { // Jika node tidak null
            traverseInOrder(node.left); // Rekursif untuk menelusuri anak kiri dari node
            System.out.print(" " + node.data); // Mencetak nilai data dari node
            traverseInOrder(node.right); // Rekursif untuk menelusuri anak kanan dari node
        }
    }

    // Method untuk mendapatkan successor dari node yang akan dihapus
    Node getSuccessor(Node del) { // Mendefinisikan method getSuccessor untuk mendapatkan successor dari node yang akan dihapus
        Node successor = del.right; // Menginisialisasi successor dengan anak kanan dari node yang akan dihapus
        Node successorParent = del; // Menginisialisasi successorParent dengan node yang akan dihapus

        while (successor.left != null) { // Melakukan iterasi sampai successor memiliki anak kiri
            successorParent = successor; // Memperbarui nilai successorParent dengan successor
            successor = successor.left; // Pindah ke anak kiri dari successor
        }

        if (successor != del.right) { // Jika successor bukan anak kanan dari node yang akan dihapus
            successorParent.left = successor.right; // Menjadikan anak kiri dari successor sebagai anak kanan dari parent successor
            successor.right = del.right; // Menjadikan anak kanan dari successor sebagai anak kanan dari node yang akan dihapus
        }

        return successor; // Mengembalikan successor
    }

    // Method untuk menghapus sebuah nilai dari pohon biner
    void delete(int data) { // Mendefinisikan method delete untuk menghapus sebuah nilai dari pohon biner
        if (isEmpty()) { // Jika pohon biner kosong
            System.out.println("Tree is empty!"); // Menampilkan pesan bahwa pohon biner kosong
            return; // Keluar dari method
        }

        //find node (current) that will be deleted
        Node parent = root; // Menginisialisasi parent dengan root
        Node current = root; // Menginisialisasi current dengan root
        boolean isLeftChild = false; // Mendeklarasikan variabel isLeftChild dengan nilai awal false

        // Melakukan iterasi sampai ditemukan node yang akan dihapus atau sampai akhir pohon
        while (current != null) { // Melakukan iterasi sampai current null
            if (current.data == data) { // Jika nilai data pada current sama dengan data yang akan dihapus
                break; // Keluar dari loop
            } else if (data < current.data) { // Jika data yang akan dihapus lebih kecil dari nilai data current
                parent = current; // Mengubah nilai parent menjadi current
                current = current.left; // Pindah ke anak kiri dari current
                isLeftChild = true; // Mengubah nilai isLeftChild menjadi true
            } else if (data > current.data) { // Jika data yang akan dihapus lebih besar dari nilai data current
                parent = current; // Mengubah nilai parent menjadi current
                current = current.right; // Pindah ke anak kanan dari current
                isLeftChild = false; // Mengubah nilai isLeftChild menjadi false
            }
        }

        // Jika current null, artinya data yang akan dihapus tidak ditemukan dalam pohon
        if (current == null) {
            System.out.println("Couldn't find data!"); // Menampilkan pesan bahwa data tidak ditemukan
            return; // Keluar dari method
        } else {
            // Jika node yang akan dihapus tidak memiliki anak, maka bisa dihapus secara langsung
            if (current.left == null && current.right == null) { // Jika current tidak memiliki anak (leaf)
                if (current == root) { // Jika current adalah root
                    root = null; // Menjadikan root null
                } else { // Jika current bukan root
                    if (isLeftChild) { // Jika current adalah anak kiri dari parent
                        parent.left = null; // Menjadikan anak kiri dari parent null
                    } else { // Jika current adalah anak kanan dari parent
                        parent.right = null; // Menjadikan anak kanan dari parent null
                    }
                }
            }
            // Jika node yang akan dihapus memiliki satu anak (anak kiri atau anak kanan)
            else if (current.left == null) { // Jika current tidak memiliki anak kiri
                if (current == root) { // Jika current adalah root
                    root = current.right; // Menjadikan anak kanan dari current sebagai root
                } else { // Jika current bukan root
                    if (isLeftChild) { // Jika current adalah anak kiri dari parent
                        parent.left = current.right; // Menjadikan anak kanan dari current sebagai anak kiri dari parent
                    } else { // Jika current adalah anak kanan dari parent
                        parent.right = current.right; // Menjadikan anak kanan dari current sebagai anak kanan dari parent
                    }
                }
            } else if (current.right == null) { // Jika current tidak memiliki anak kanan
                if (current == root) { // Jika current adalah root
                    root = current.left; // Menjadikan anak kiri dari current sebagai root
                } else { // Jika current bukan root
                    if (isLeftChild) { // Jika current adalah anak kiri dari parent
                        parent.left = current.left; // Menjadikan anak kiri dari current sebagai anak kiri dari parent
                    } else { // Jika current adalah anak kanan dari parent
                        parent.right = current.left; // Menjadikan anak kiri dari current sebagai anak kanan dari parent
                    }
                }
            } else { // Jika node yang akan dihapus memiliki dua anak
                Node successor = getSuccessor(current); // Mendapatkan successor dari current
                if (current == root) { // Jika current adalah root
                    root = successor; // Menjadikan successor sebagai root
                } else { // Jika current bukan root
                    if (isLeftChild) { // Jika current adalah anak kiri dari parent
                        parent.left = successor; // Menjadikan successor sebagai anak kiri dari parent
                    } else { // Jika current adalah anak kanan dari parent
                        parent.right = successor; // Menjadikan successor sebagai anak kanan dari parent
                    }
                    successor.left = current.left; // Menjadikan anak kiri dari current sebagai anak kiri dari successor
                }
            }
        }
    }

    // Method untuk mencetak semua leaf nodes dalam pohon biner
    void printLeaf(Node node) { // Mendefinisikan method printLeaf untuk mencetak semua leaf nodes dalam pohon biner
        if (node != null) { // Jika node tidak null
            if (node.left == null && node.right == null) { // Jika node adalah leaf (tidak memiliki anak kiri dan anak kanan)
                System.out.print(node.data + " "); // Mencetak nilai data dari node
            }
            printLeaf(node.left); // Rekursif untuk mencetak leaf nodes pada anak kiri dari node
            printLeaf(node.right); // Rekursif untuk mencetak leaf nodes pada anak kanan dari node
        }
    }

    // Method untuk menghitung jumlah leaf nodes dalam pohon biner
    int countLeaf(Node node) { // Mendefinisikan method countLeaf untuk menghitung jumlah leaf nodes dalam pohon biner
        if (node == null) { // Jika node null
            return 0; // Mengembalikan nilai 0
        }
        if (node.left == null && node.right == null) { // Jika node adalah leaf (tidak memiliki anak kiri dan anak kanan)
            return 1; // Mengembalikan nilai 1
        }
        // Rekursif untuk menghitung jumlah leaf nodes pada sub-pohon kiri dan kanan
        int leftCount = countLeaf(node.left); // Menghitung jumlah leaf nodes pada sub-pohon kiri
        int rightCount = countLeaf(node.right); // Menghitung jumlah leaf nodes pada sub-pohon kanan
        // Mengembalikan jumlah leaf nodes pada sub-pohon kiri dan kanan
        return leftCount + rightCount; // Mengembalikan jumlah leaf nodes pada sub-pohon kiri dan kanan
    }
}