package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan daftar mahasiswa menggunakan ArrayList
    private ArrayList<Mahasiswa> daftarMahasiswa;

    // Constructor
    public KelasKuliah() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    // Method untuk menambah mahasiswa ke koleksi
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method untuk menghitung rata-rata nilai kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method untuk menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int hitung = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                hitung++;
            }
        }
        return hitung;
    }

    // Method untuk mendapatkan jumlah total data terbaru
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }

    // Method untuk menampilkan semua data mahasiswa beserta status kelulusannya
    public void tampilkanSemua() {
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-10s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("-------------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-15s %-15s %-10.2f %-10s\n", mhs.getNpm(), mhs.getNama(), mhs.getNilai(), status);
        }
        System.out.println("-------------------------------------------------");
    }
}