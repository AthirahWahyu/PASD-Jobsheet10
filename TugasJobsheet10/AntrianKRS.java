package TugasJobsheet10;

class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahDilayani = 0;
    int kapasitasDPA = 30;

    public AntrianKRS(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    void enqueue(Mahasiswa m) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = m;
        size++;
        System.out.println(m.nama + " masuk antrian");
    }
    
    void dequeue2() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk diproses!");
            return;
        }

        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa m = data[front];
            m.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
        }
    }

    void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    void tampilDepan2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
            return;
        }
        System.out.println("2 Antrian terdepan:");
        data[front].tampilkanData();
        data[(front + 1) % max].tampilkanData();
    }

    void tampilAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terakhir:");
            data[rear].tampilkanData();
        }
    }

    int getJumlahAntrian(){
        return size;
    }

    int getJumlahDilayani(){
        return jumlahDilayani;
    }

    int sisaBelumKRS() {
        return kapasitasDPA - jumlahDilayani;
    }
}
