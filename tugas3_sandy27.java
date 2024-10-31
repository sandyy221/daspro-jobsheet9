import java.util.Scanner;
public class tugas3_sandy27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.println("Menu Makanan:");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.print("Masukkan nama makanan yang ingin Anda pesan: ");
        String makananDicari = sc.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                System.out.println("Makanan " + makananDicari + " tersedia!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Maaf, makanan " + makananDicari + " tidak tersedia.");
        }
    }
}