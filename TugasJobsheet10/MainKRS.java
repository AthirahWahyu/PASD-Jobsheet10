package TugasJobsheet10;
import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilih;

        do {
            System.out.println("\n--- ANTRIAN KRS ---");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Proses 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Dilayani");
            System.out.println("8. Sisa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    antrian.enqueue(new Mahasiswa(nim, nama, prodi, kelas));
                    break;
                
                case 2:
                    antrian.dequeue2();
                    break;
                
                case 3:
                    antrian.tampilSemua();
                    break;
                
                case 4: 
                    antrian.tampilDepan2();
                    break;
            
                case 5:
                    antrian.tampilAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                
                case 7:
                    System.out.println("Jumlah dilayani: " + antrian.getJumlahDilayani());
                    break;
                
                case 8: 
                    System.out.println("Sisa belum KRS: " + antrian.sisaBelumKRS());
                    break;
                
                case 9: 
                    antrian.clear();
                    break;
            }
            
        } while (pilih != 0);

        sc.close();
    } 
}
