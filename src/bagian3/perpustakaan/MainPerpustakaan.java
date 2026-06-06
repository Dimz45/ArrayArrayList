package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();
        
        // =========================================================================
        // UJI SOAL NO 2: Memasukkan data buku beserta tahun terbitnya
        // =========================================================================
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya", 1981)); // Tambahan untuk tes cari penulis
        
        System.out.println("--- MENAMPILKAN KOLEKSI AWAL ---");
        perpus.tampilkanKoleksi();
        System.out.println();
        
        // Simulasi pinjam buku
        System.out.println("--- SIMULASI PINJAM BUKU ---");
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // Coba pinjam kedua kali (akan muncul pesan sedang dipinjam)
        System.out.println();
        
        // =========================================================================
        // UJI SOAL NO 1: Menguji pengembalian buku yang sedang dipinjam
        // =========================================================================
        System.out.println("--- UJI SOAL 1: PENGEMBALIAN BUKU ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();
        
        // =========================================================================
        // UJI SOAL NO 3: Menguji pencarian berdasarkan nama penulis
        // =========================================================================
        System.out.println("--- UJI SOAL 3: PENCARIAN PENULIS ---");
        perpus.cariPenulis("Pramoedya");
        System.out.println();
        
        System.out.println("--- STATUS AKHIR KOLEKSI ---");
        perpus.tampilkanKoleksi();
    }
}