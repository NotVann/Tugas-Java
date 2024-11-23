import java.util.Scanner;

public class Warung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Warung Makan Mas Amba =====\n");
        System.out.println("Makanan : \n1. Soto Ayam\t\t: Rp. 15.000\n2. Mie Ayam\t\t: Rp. 12.000\n3. Rawon Ireng\t\t: Rp. 12.000\n4. Nasi Goreng\t\t: Rp. 12.000\n5. Ayam Geprek\t\t: Rp. 8.000\n");
        System.out.println("Minuman : \n1. Es Teh\t\t: Rp. 3.000\n2. Es Jeruk\t\t: Rp. 4.000\n3. Teh Anget\t\t: Rp. 2.500\n4. Jeruk Anget\t\t: Rp. 3.500\n5. Air Putih\t\t: Rp. 2.500");
        
        System.out.println("\nSilakan pilih menu makanan (1-5): ");
        int pilihanMakanan = scanner.nextInt();
        
        System.out.println("Silakan pilih menu minuman (1-5): ");
        int pilihanMinuman = scanner.nextInt();

        int hargaMakanan = 0;
        int hargaMinuman = 0;

        switch (pilihanMakanan) {
            case 0 -> System.out.println("Anda tidak memilih makanan.");
            case 1 -> hargaMakanan = 15000;
            case 2 -> hargaMakanan = 12000;
            case 3 -> hargaMakanan = 12000;
            case 4 -> hargaMakanan = 12000;
            case 5 -> hargaMakanan = 8000;
            default -> System.out.println("Pilihan makanan tidak valid.");
        }

        switch (pilihanMinuman) {
            case 0 -> System.out.println("Anda tidak memilih minuman.");
            case 1 -> hargaMinuman = 3000;
            case 2 -> hargaMinuman = 4000;
            case 3 -> hargaMinuman = 2500;
            case 4 -> hargaMinuman = 3500;
            case 5 -> hargaMinuman = 2500;
            default -> System.out.println("Pilihan minuman tidak valid.");
        }

        if (hargaMakanan > 0 || hargaMinuman > 0) {
            int totalHarga = hargaMakanan + hargaMinuman;
            System.out.println("\nTotal yang harus dibayar: Rp. " + totalHarga);
        } else {
            System.out.println("\nAnda tidak memesan apa pun.");
        }

        scanner.close();
    }
}