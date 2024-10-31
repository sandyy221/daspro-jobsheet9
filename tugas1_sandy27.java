import java.util.Scanner;
public class tugas1_sandy27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double rata2 = 0;

        System.out.print("Masukkan banyaknya nilai yang akan di input: ");
        int jumlahNilai = sc.nextInt();
        int[] nilaiMhs = new int[jumlahNilai];

        for (int i = 0; i <jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + (i+1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i =0; i < nilaiMhs.length; i++) {
            total+=nilaiMhs[i];
        }
        for (int i=0; i<nilaiMhs.length; i++)
        System.out.println("Nilai mahasiswa ke-" +i+ " adalah " + nilaiMhs[i] );
        rata2 = total/nilaiMhs.length;
        System.out.print("Rata rata nilai = " +  rata2);


    }
}