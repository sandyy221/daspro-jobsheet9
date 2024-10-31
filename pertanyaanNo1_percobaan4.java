import java.util.Scanner;

public class pertanyaanNo1_percobaan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int jumlahNilai = sc.nextInt();
        int[] nilaiMahasiswa = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int nilaiDicari = sc.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < jumlahNilai; i++) {
            if (nilaiMahasiswa[i] == nilaiDicari) {
                System.out.println("Nilai " + nilaiDicari + " ketemu, merupakan nilai mahasiswa ke " + (i + 1));
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + nilaiDicari + " tidak ditemukan.");
        }
        
    }
}