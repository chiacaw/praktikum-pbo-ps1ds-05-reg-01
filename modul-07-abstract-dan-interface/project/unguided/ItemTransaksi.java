package unguided;

public interface ItemTransaksi {
    // Kontrak antarmuka
    double getNominalBayar();
    String getNamaTransaksi();

    // Default Method (Java 8+) untuk mencetak rincian item
    default void cetakRincianItem() {
        System.out.println(getNamaTransaksi() + " | Total: Rp" + getNominalBayar());
    }

    // Static Method (Java 8+) untuk mencatat log sistem kasir
    static void catatLogKasir(String pesan) {
        System.out.println("[LOG SISTEM KASIR] " + pesan);
    }
}