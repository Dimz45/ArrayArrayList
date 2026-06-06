package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Soal No 4: Menyimpan daftar nama mata kuliah dalam array String (minimal 3, ukuran tetap)
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Struktur Data", "Basis Data"};
        
        // Menampilkan daftar mata kuliah
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Membuat objek KelasKuliah sebagai pengelola data
        KelasKuliah kelas = new KelasKuliah();

        // Soal No 3: Menambah minimal 5 objek Mahasiswa di awal
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2410010001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2410010002", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2410010003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi", "2410010004", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Euis", "2410010005", 72.0));

        // Memanggil method untuk menampilkan data awal
        System.out.println("=== DATA AWAL MAHASISWA ===");
        kelas.tampilkanSemua();

        // Soal No 5: Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.println("Rata-rata Nilai Kelas : " + String.format("%.2f", kelas.hitungRataRata()));
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus() + " orang");
        System.out.println("Total Data            : " + kelas.getJumlahData() + " mahasiswa");
        System.out.println();

        // Soal No 6: Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println(">>> Menambahkan 1 Mahasiswa Baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fahri", "2410010006", 65.0));
        System.out.println();

        // Menampilkan kembali seluruh data dan jumlah data terbaru
        System.out.println("=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
        System.out.println("Jumlah Data Terbaru   : " + kelas.getJumlahData() + " mahasiswa");
        System.out.println("Rata-rata Nilai Baru  : " + String.format("%.2f", kelas.hitungRataRata()));
        System.out.println("Jumlah Lulus Terbaru  : " + kelas.jumlahLulus() + " orang");
    }
}