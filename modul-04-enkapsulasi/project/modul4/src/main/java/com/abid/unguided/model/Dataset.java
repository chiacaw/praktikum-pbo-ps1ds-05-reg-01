package com.abid.unguided.model;

public class Dataset {
// Atribut (enkapsulasi dengan access modifier private)
    private String nama;
    private int jumlahBaris;
    private int jumlahKolom;
    private int jumlahMissing;

    // Konstanta batas missing value (5.0%)
    public static final double BATAS_MISSING = 5.0;
    
    // Variabel milik class untuk menghitung total objek yang dibuat
    private static int totalDataset = 0;

    // --- Constructor Overloading ---

    // 1. Constructor tanpa parameter
    public Dataset() {
        totalDataset++; // Menambah hitungan
    }

    // 2. Constructor dengan 1 parameter
    public Dataset(String nama) {
        this.nama = nama;
        totalDataset++; // Menambah hitungan
    }

    // 3. Constructor lengkap
    public Dataset(String nama, int jumlahBaris, int jumlahKolom, int jumlahMissing) {
        this.nama = nama;
        // Memastikan nilai awal tidak diset negatif
        if (jumlahBaris >= 0) this.jumlahBaris = jumlahBaris;
        if (jumlahKolom >= 0) this.jumlahKolom = jumlahKolom;
        if (jumlahMissing >= 0) this.jumlahMissing = jumlahMissing;
        totalDataset++;
    }

    // --- Method ---

    public static int getTotalDataset() {
        return totalDataset;
    }

    // Getter untuk semua atribut
    public String getNama() { return nama; }
    public int getJumlahBaris() { return jumlahBaris; }
    public int getJumlahKolom() { return jumlahKolom; }
    public int getJumlahMissing() { return jumlahMissing; }

    // Setter untuk atribut nama
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    // Setter dengan validasi agar nilai tidak negatif
    public void setJumlahBaris(int jumlahBaris) {
        if (jumlahBaris >= 0) {
            this.jumlahBaris = jumlahBaris;
        }
    }

    public void setJumlahKolom(int jumlahKolom) {
        if (jumlahKolom >= 0) {
            this.jumlahKolom = jumlahKolom;
        }
    }

    public void setJumlahMissing(int jumlahMissing) {
        if (jumlahMissing >= 0) {
            this.jumlahMissing = jumlahMissing;
        }
    }

    // Mengembalikan persentase sel kosong
    public double getPersentaseMissing() {
        int totalSel = jumlahBaris * jumlahKolom;
        if (totalSel == 0) {
            return 0.0; // Mencegah error pembagian dengan nol
        }
        return ((double) jumlahMissing / totalSel) * 100.0;
    }

    // Mengecek apakah dataset perlu dibersihkan
    public boolean perluDibersihkan() {
        return getPersentaseMissing() > BATAS_MISSING;
    }
}