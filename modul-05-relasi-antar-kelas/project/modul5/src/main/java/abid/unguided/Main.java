package abid.unguided;

import abid.unguided.ItemPesanan;
import abid.unguided.Kasir;
import abid.unguided.Pesanan;
import abid.unguided.RincianHarga;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Kasir
        Kasir kasir = new Kasir("Budi");

        // Membuat objek ItemPesanan secara independen
        ItemPesanan item1 = new ItemPesanan(
            "Iced Americano", 18000
        );

        ItemPesanan item2 = new ItemPesanan(
            "Beef Croissant", 25000
        );

        ItemPesanan item3 = new ItemPesanan(
            "Matcha Latte", 22000
        );

        // Membuat objek Pesanan untuk meja 4
        Pesanan pesanan = new Pesanan(4, 5);

        // Memasukkan item ke dalam Pesanan (Agregasi)
        pesanan.tambahItem(item1);
        pesanan.tambahItem(item2);
        pesanan.tambahItem(item3);

        // Menampilkan daftar pesanan
        pesanan.tampilkanPesanan();

        // Memproses pembayaran (Asosiasi)
        kasir.prosesPembayaran(pesanan);
    }
}
