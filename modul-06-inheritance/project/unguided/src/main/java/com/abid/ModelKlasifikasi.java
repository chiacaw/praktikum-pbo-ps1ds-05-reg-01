package com.abid;


public class ModelKlasifikasi extends Model {
    private int jumlahKelas;

    public ModelKlasifikasi(String nama, int jumlahDataLatih,
                            int jumlahKelas) {
        super(nama, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah kelas: " + jumlahKelas);
    }

    @Override
    public int hitungBiaya() {
        return super.hitungBiaya() * jumlahKelas;
    }
}
