package bagian1.array;

public class Latihan1 {
    public static void main(String[] args) {
        // Cara 1: deklarasi lalu isi per indeks (ukuran array = 5)
        int[] nilai = new int[5];
        nilai[0] = 80;
        nilai[1] = 75;
        nilai[2] = 90;
        nilai[3] = 60;
        nilai[4] = 85;
        
        // Cara 2: langsung diisi saat dibuat
        String[] nama = {"Andi", "Budi", "Citra"};
        
        System.out.println("Nilai pertama : " + nilai[0]);
        System.out.println("Nilai ketiga : " + nilai[2]);
        System.out.println("Mahasiswa ke-2: " + nama[1]);
        System.out.println("Jumlah nilai : " + nilai.length);
        
        System.out.println("\n--- MEMICU ERROR SEPERTI DI MODUL ---");
        // SENGAJA ERROR: Array 'nilai' hanya punya indeks 0 sampai 4. 
        // Mengakses indeks 5 akan memicu ArrayIndexOutOfBoundsException.
        System.out.println("Mengakses indeks ke-5: " + nilai[5]); 
    }
}