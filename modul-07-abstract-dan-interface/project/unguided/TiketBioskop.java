package unguided;

public abstract class TiketBioskop implements ItemTransaksi {
    private String judulFilm;
    private double hargaDasar;
    private int jumlahKursi;

    public TiketBioskop(String judulFilm, double hargaDasar, int jumlahKursi) {
        this.judulFilm = judulFilm;
        this.hargaDasar = hargaDasar;
        this.jumlahKursi = jumlahKursi;
    }

    public String getJudulFilm() {
        return this.judulFilm;
    }

    public double getHargaDasar() {
        return this.hargaDasar;
    }

    public int getJumlahKursi() {
        return this.jumlahKursi;
    }

    // Abstract method spesifik tiket
    public abstract double hitungTotalBayar();
    
    @Override
    public abstract String getNamaTransaksi();

    // Realisasi kontrak getNominalBayar() dari ItemTransaksi
    @Override
    public double getNominalBayar() {
        return hitungTotalBayar();
    }
}