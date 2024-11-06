/**
 * Kelas Kalkulator menyediakan operasi dasar matematika seperti penjumlahan,
 * pengurangan, perkalian, dan pembagian.
 * 
 * @author Nama Anda
 * @since 1.0
 */
public class kalkulator {

    /**
     * Menambahkan dua angka dan mengembalikan hasilnya.
     * 
     * @param a Angka pertama.
     * @param b Angka kedua.
     * @return Hasil penjumlahan antara a dan b.
     */
    public double tambah(double a, double b) {
        return a + b;
    }

    /**
     * Mengurangi dua angka dan mengembalikan hasilnya.
     * 
     * @param a Angka pertama.
     * @param b Angka kedua.
     * @return Hasil pengurangan antara a dan b.
     */
    public double kurang(double a, double b) {
        return a - b;
    }

    /**
     * Mengalikan dua angka dan mengembalikan hasilnya.
     * 
     * @param a Angka pertama.
     * @param b Angka kedua.
     * @return Hasil perkalian antara a dan b.
     */
    public double kali(double a, double b) {
        return a * b;
    }

    /**
     * Membagi dua angka dan mengembalikan hasilnya.
     * 
     * @param a Angka pembilang.
     * @param b Angka penyebut.
     * @return Hasil pembagian antara a dan b.
     * @throws ArithmeticException Jika b adalah 0, karena pembagian dengan 0 tidak diperbolehkan.
     */
    public double bagi(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh 0");
        }
        return a / b;
    }

    /**
     * Menampilkan menu kalkulator untuk digunakan oleh pengguna.
     */
    public void tampilkanMenu() {
        System.out.println("Pilih operasi matematika:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Keluar");
    }

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            kalkulator.tampilkanMenu();
            System.out.print("Masukkan pilihan (1-5): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator.");
                break;
            }

            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            double hasil = 0;
            try {
                switch (pilihan) {
                    case 1:
                        hasil = kalkulator.tambah(angka1, angka2);
                        System.out.println("Hasil penjumlahan: " + hasil);
                        break;
                    case 2:
                        hasil = kalkulator.kurang(angka1, angka2);
                        System.out.println("Hasil pengurangan: " + hasil);
                        break;
                    case 3:
                        hasil = kalkulator.kali(angka1, angka2);
                        System.out.println("Hasil perkalian: " + hasil);
                        break;
                    case 4:
                        hasil = kalkulator.bagi(angka1, angka2);
                        System.out.println("Hasil pembagian: " + hasil);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
