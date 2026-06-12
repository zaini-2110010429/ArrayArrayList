package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanBelanja {
    public static void main(String[] args) {
        ArrayList <String> daftarBelanja = new ArrayList<>();
        
        daftarBelanja.add("Beras");
        daftarBelanja.add("Telur");
        daftarBelanja.add("Sayur");
        daftarBelanja.add("Minyak");
        
        daftarBelanja.remove(1);
        
        System.out.println("Isi daftar belanja : " + daftarBelanja);
        System.out.println("Jumlah akhir item : " + daftarBelanja.size());
    }
}
