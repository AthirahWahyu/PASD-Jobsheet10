package P1Jobsheet10;

public class Queue {
    // atribut-atribut Queue 
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    // method IsEmpty bertipe boolean yang digunakan
    // untuk mengecek apakah queue kosong.
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // method IsFull bertipe boolean yang digunakan 
    // untuk mengecek apakah queue sudah penuh.
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    // method peek bertipe void 
    // untuk menampilkan elemen queue pada posisi paling depan.
    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    // method print bertipe void 
    // untuk menampilkan seluruh elemen pada queue
    // mulai dari posisi front sampai dengan posisi rear
    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    // method clear bertipe void untuk menghapus semua elemen pada queue
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    //method Enqueue bertipe void untuk menambahkan isi queue dengan 
    // parameter dt yang bertipe integer
    public void Enqueue(int dt){
        if (IsFull()) {
            System.out.println("Queue overflow! Program dihentikan.");   
            System.exit(0);
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    
    // method Dequeue bertipe int 
    // untuk mengeluarkan data pada queue di posisi belakang
    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue underflow! Program dihentikan.");
            System.exit(0);
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}
