package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    // Menampung daftar objek Buku
    private ArrayList<Buku> koleksiBuku;

    // Constructor untuk inisialisasi ArrayList
    public Perpustakaan() {
        this.koleksiBuku = new ArrayList<>();
    }

    // Method untuk menambahkan buku baru ke dalam perpustakaan
    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }
    
    // Method pembantu untuk simulasi meminjam buku (agar bisa diuji saat dikembalikan)
    public void pinjamBuku(String judul) {
        for (Buku b : koleksiBuku) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (!b.isDipinjam()) {
                    b.setDipinjam(true);
                    System.out.println("Berhasil meminjam buku: " + judul);
                } else {
                    System.out.println("Buku '" + judul + "' sedang dipinjam orang lain.");
                }
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan.");
    }

    // =========================================================================
    // SOAL NO 1: Method kembalikanBuku(String judul)
    // Mengubah status dipinjam menjadi false
    // =========================================================================
    public void kembalikanBuku(String judul) {
        boolean ditemukan = false;
        
        for (Buku b : koleksiBuku) {
            // Menggunakan .equalsIgnoreCase agar ketikan huruf besar/kecil tidak sensitif
            if (b.getJudul().equalsIgnoreCase(judul)) {
                b.setDipinjam(false); // Mengubah status di class Buku menjadi false
                System.out.println("Buku '" + judul + "' berhasil dikembalikan.");
                ditemukan = true;
                break; // Keluar dari loop jika buku sudah ketemu
            }
        }
        
        if (!ditemukan) {
            System.out.println("Buku dengan judul '" + judul + "' tidak ditemukan di perpustakaan.");
        }
    }

    // =========================================================================
    // SOAL NO 3: Method cariPenulis(String penulis)
    // Menampilkan semua buku karya penulis tersebut
    // =========================================================================
    public void cariPenulis(String penulis) {
        System.out.println("Hasil pencarian buku karya penulis '" + penulis + "':");
        boolean adaBuku = false;
        
        for (Buku b : koleksiBuku) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                // Memanggil method info() dari class Buku dan mencetaknya
                System.out.println("- " + b.info());
                adaBuku = true;
            }
        }
        
        if (!adaBuku) {
            System.out.println("  [ Tidak ditemukan buku dari penulis tersebut ]");
        }
    }

    // Method untuk menampilkan semua koleksi buku saat ini
    public void tampilkanKoleksi() {
        System.out.println("=== DAFTAR KOLEKSI PERPUSTAKAAN ===");
        if (koleksiBuku.isEmpty()) {
            System.out.println("Perpustakaan masih kosong.");
        } else {
            for (Buku b : koleksiBuku) {
                System.out.println(b.info());
            }
        }
        System.out.println("====================================");
    }
}