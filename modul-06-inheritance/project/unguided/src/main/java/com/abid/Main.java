package com.abid;


public class Main {
    public static void main(String[] args) {

        ModelRegresi regresi = new ModelRegresi(
                "Regresi Linier", 500, 4);

        ModelKlasifikasi klasifikasi = new ModelKlasifikasi(
                "Decision Tree", 800, 3);

        ModelDeepLearning deepLearning = new ModelDeepLearning(
                "Neural Network", 1000, 5, 3);

        // Menyimpan objek dalam array bertipe kelas induk
        Model[] daftarModel = {
            regresi,
            klasifikasi,
            deepLearning
        };

        int totalBiaya = 0;

        // Menampilkan informasi dan menghitung total biaya
        for (Model model : daftarModel) {
            model.tampilkanInfo();

            int biaya = model.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");

            totalBiaya += biaya;
        }

        System.out.println("Total biaya: " + totalBiaya);

        // Biaya 10 epoch untuk Neural Network
        System.out.println("Biaya 10 epoch (Neural Network): "
                + deepLearning.hitungBiaya(10));

        // Biaya 10 epoch untuk Regresi Linier
        System.out.println("Biaya 10 epoch (Regresi Linier): "
                + regresi.hitungBiaya(10));

        // Biaya 10 epoch dengan ukuran batch 50
        System.out.println(
                "Biaya 10 epoch batch 50 (Regresi Linier): "
                + regresi.hitungBiaya(10, 50));
    }
}
