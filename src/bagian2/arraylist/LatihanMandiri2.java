package bagian2.arraylist;

// Import library ArrayList yang diperlukan
import java.util.ArrayList;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        
        // =========================================================================
        // SOAL 1: ArrayList<String> daftar belanja. Tambah 4 item, hapus item ke-2,
        //         tampilkan isi list beserta jumlah akhirnya.
        // =========================================================================
        System.out.println("--- SOAL 1: DAFTAR BELANJA ---");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Menambah 4 item
        daftarBelanja.add("Minyak Goreng"); // Indeks 0
        daftarBelanja.add("Beras");         // Indeks 1 (Item ke-2)
        daftarBelanja.add("Gula Pasir");    // Indeks 2
        daftarBelanja.add("Telur Ayam");    // Indeks 3
        
        // Hapus item ke-2 (berada di indeks 1 karena indeks dimulai dari 0)
        daftarBelanja.remove(1);
        
        // Tampilkan isi list
        System.out.println("Isi daftar belanja saat ini:");
        for (String item : daftarBelanja) {
            System.out.println("- " + item);
        }
        
        // Tampilkan jumlah akhirnya menggunakan .size()
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
        System.out.println(); // Baris pemisah

        
        // =========================================================================
        // SOAL 2: ArrayList<Integer> berisi 5 angka. Tampilkan nilai terbesar
        //         dengan menelusuri seluruh elemen.
        // =========================================================================
        System.out.println("--- SOAL 2: NILAI TERBESAR ---");
        ArrayList<Integer> listAngka = new ArrayList<>();
        
        // Menambahkan 5 angka
        listAngka.add(24);
        listAngka.add(87);
        listAngka.add(45);
        listAngka.add(99);
        listAngka.add(12);
        
        // Mengasumsikan elemen pertama sebagai nilai terbesar awal
        int nilaiTerbesar = listAngka.get(0);
        
        // Menelusuri seluruh elemen dengan loop
        for (int i = 1; i < listAngka.size(); i++) {
            if (listAngka.get(i) > nilaiTerbesar) {
                nilaiTerbesar = listAngka.get(i);
            }
        }
        
        System.out.println("Angka di dalam list: " + listAngka);
        System.out.println("Nilai terbesar adalah: " + nilaiTerbesar);
        System.out.println(); // Baris pemisah

        
        // =========================================================================
        // SOAL 3: Menambah 6 nama ke dalam ArrayList, cetak hanya nama yang
        //         diawali huruf A (gunakan method startsWith pada String).
        // =========================================================================
        System.out.println("--- SOAL 3: FILTER NAMA DIAWALI HURUF A ---");
        ArrayList<String> daftarNama = new ArrayList<>();
        
        // Menambahkan 6 nama
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Ahmad");
        daftarNama.add("Citra");
        daftarNama.add("Anisa");
        daftarNama.add("Dedi");
        
        System.out.println("Nama yang diawali huruf 'A':");
        for (String nama : daftarNama) {
            // Menggunakan method .startsWith() untuk mengecek huruf depan
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}