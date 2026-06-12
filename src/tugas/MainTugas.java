package tugas;

// Nama : Muhammad Zaini
// NPM : 2110010429


public class MainTugas {
    public static void main(String[] args) {
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Sistem Informasi Geografis", "Kecerdasan Buatan"};
        System.out.println("== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();
        
        KelasKuliah kelas = new KelasKuliah();
        
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2110010001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2110010002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2110010003", 75.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "2110010004", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "2110010005", 45.5));
        
        kelas.tampilkanSemua();
        System.out.println();
        
        System.out.println("Rata-rata Nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus : " + kelas.jumlahLulus());
        System.out.println();
        
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "2110010006", 65.0));
        System.out.println("Berhasil menambahkan 1 mahasiswa baru.");
        System.out.println("Jumlah data mahasiswa terbaru : " + kelas.getJumlahMahasiswa());
    }
}
