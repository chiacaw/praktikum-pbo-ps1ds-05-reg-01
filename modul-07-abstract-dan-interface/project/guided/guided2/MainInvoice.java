package guided.guided2;

public class MainInvoice {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("BRG-001", "Ban Mobil", 4, 250000.0);

        System.out.println("Kode Barang: " + invoice1.getPartNumber());
        System.out.println("Deskripsi: " + invoice1.getPartDescription());
        System.out.println("Jumlah Beli: " + invoice1.getQuantity());
        System.out.println("Harga Satuan: Rp" + invoice1.getPricePerItem());
        System.out.println("Total yang harus dibayar: Rp" + invoice1.getPaymentAmount());
        System.out.println("\n--- Output toString() ---");
        System.out.println(invoice1.toString());
    }
}