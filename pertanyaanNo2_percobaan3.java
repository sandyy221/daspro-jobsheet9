import java.util.Scanner;

public class pertanyaanNo2_percobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        // Membuat array dengan ukuran sesuai input
        int[] nilaiMhs = new int[jumlahMahasiswa];

        // Memasukkan nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Menghitung total nilai, jumlah mahasiswa lulus, dan jumlah mahasiswa tidak lulus
        int totalLulus = 0, totalTidakLulus = 0, jumlahLulus = 0, jumlahTidakLulus = 0;
        for (int nilai : nilaiMhs) {
            if (nilai >= 70) {
                totalLulus += nilai;
                jumlahLulus++;
            } else {
                totalTidakLulus += nilai;
                jumlahTidakLulus++;
            }
        }

        // Menghitung rata-rata nilai lulus dan tidak lulus
        double rataRataLulus = (jumlahLulus == 0) ? 0 : (double) totalLulus / jumlahLulus;
        double rataRataTidakLulus = (jumlahTidakLulus == 0) ? 0 : (double) totalTidakLulus / jumlahTidakLulus;

        // Menampilkan hasil
        System.out.println("Rata-rata nilai lulus: " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rataRataTidakLulus);
    }
}