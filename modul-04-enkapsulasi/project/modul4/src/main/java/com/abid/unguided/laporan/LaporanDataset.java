package com.abid.unguided.laporan;

import com.abid.unguided.model.Dataset;

public class LaporanDataset {
    // Method untuk menampilkan laporan
    public void cetak(Dataset d) {
        System.out.println("=== Laporan Dataset ===");
        // Menangani kasus jika nama belum diisi (null)
        System.out.println("Nama         : " + (d.getNama() == null ? "-" : d.getNama()));
        System.out.println("Jumlah Baris : " + d.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + d.getJumlahKolom());
        
        // Menggunakan printf untuk format angka di belakang koma
        System.out.printf("Missing      : %d sel (%.2f%%)\n", d.getJumlahMissing(), d.getPersentaseMissing());
        
        String status = d.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih";
        System.out.println("Status       : " + status);
        System.out.println(); // Baris kosong sebagai pemisah antar laporan
    }
}
