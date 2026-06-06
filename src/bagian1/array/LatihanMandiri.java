package bagian1.array;

public class LatihanMandiri {
    public static void main(String[] args) {
        
        // =========================================================================
        // SOAL 1: Array berisi 6 suhu harian (double). Tampilkan tertinggi & terendah.
        // =========================================================================
        System.out.println("--- SOAL 1: SUHU HARIAN ---");
        double[] suhuHarian = {28.5, 31.2, 29.0, 34.6, 27.8, 30.1};
        
        // Asumsikan elemen pertama sebagai nilai awal tertinggi dan terendah
        double suhuTertinggi = suhuHarian[0];
        double suhuTerendah = suhuHarian[0];
        
        // Lakukan perulangan untuk mencari nilai tertinggi dan terendah yang sebenarnya
        for (int i = 1; i < suhuHarian.length; i++) {
            if (suhuHarian[i] > suhuTertinggi) {
                suhuTertinggi = suhuHarian[i];
            }
            if (suhuHarian[i] < suhuTerendah) {
                suhuTerendah = suhuHarian[i];
            }
        }
        
        System.out.println("Suhu Tertinggi: " + suhuTertinggi + "°C");
        System.out.println("Suhu Terendah : " + suhuTerendah + "°C");
        System.out.println(); // Baris baru kosong sebagai pemisah

        
        // =========================================================================
        // SOAL 2: Array String berisi 5 nama hari. Cetak yang memiliki > 5 huruf.
        // =========================================================================
        System.out.println("--- SOAL 2: HARI DENGAN LEBIH DARI 5 HURUF ---");
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("Hari yang memiliki lebih dari 5 huruf:");
        for (int i = 0; i < namaHari.length; i++) {
            // Gunakan .length() untuk menghitung jumlah huruf pada String
            if (namaHari[i].length() > 5) {
                System.out.println("- " + namaHari[i] + " (" + namaHari[i].length() + " huruf)");
            }
        }
        System.out.println(); // Baris baru kosong sebagai pemisah

        
        // =========================================================================
        // SOAL 3: Hitung dan tampilkan berapa banyak angka genap di dalam array angka.
        // =========================================================================
        System.out.println("--- SOAL 3: MENGHITUNG ANGKA GENAP ---");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;
        
        for (int i = 0; i < angka.length; i++) {
            // Angka genap adalah angka yang jika dibagi 2, sisa baginya (modulus %) adalah 0
            if (angka[i] % 2 == 0) {
                jumlahGenap++;
            }
        }
        
        System.out.println("Banyaknya angka genap di dalam array: " + jumlahGenap);
    }
}