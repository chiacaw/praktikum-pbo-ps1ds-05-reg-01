package unguided;

public class Main {
    public static void main(String[] args) {
        // 1. Uji Proteksi Abstraksi: TiketBioskop bersifat abstrak sehingga tidak bisa diinstansiasi langsung
        // TiketBioskop tiketPalsu = new TiketBioskop("Interstellar", 40000, 2); // Error saat kompilasi

        // 2. Buka Kasir lewat method static interface
        ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

        // 3. Buat Objek Transaksi
        TiketReguler tiketReguler = new TiketReguler("Interstellar", 40000.0, 2, 3);
        TiketVIP tiketVIP = new TiketVIP("Dune: Part Two", 60000.0, 2, 25000.0);
        PaketSnack paketSnack = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000.0);

        // 4. Array Polimorfik Heterogen
        ItemTransaksi[] keranjang = { tiketReguler, tiketVIP, paketSnack };

        // 5. Pemrosesan Dinamis (Loop)
        System.out.println("\n=== DAFTAR TRANSAKSI BIOSKOP ===");
        double totalTransaksi = 0.0;

        for (ItemTransaksi item : keranjang) {
            item.cetakRincianItem();
            totalTransaksi += item.getNominalBayar();
        }

        System.out.println("TOTAL TRANSAKSI: Rp" + totalTransaksi);
        System.out.println("=======================================================");

        // 6. Tutup Kasir
        ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}