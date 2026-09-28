/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class laprakmodul1 {
    public static void main(String[] args) {

        // 1. Deklarasi konstanta KKM dengan keyword final
        final double KKM = 75.0;

        // 2. Array 1 Dimensi untuk 3 nama mahasiswa (tipe data String)
        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};

        // 3. Array 2 Dimensi Rectangular 3x2 untuk nilai 2 modul (tipe data double)
        double[][] nilaiModul = {
            {80.0, 85.0}, // Andi
            {70.0, 65.0}, // Budi
            {90.0, 90.0} // Citra
        };

        // Tampilan header
        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        System.out.println();

        // 4. Perulangan untuk mengakses array & hitung rata-rata
        for (int i = 0; i < namaMahasiswa.length; i++) {

            double total = nilaiModul[i][0] + nilaiModul[i][1];
            double rataRata = total / 2;

            // 5. Percabangan untuk evaluasi status kelulusan
            String status;
            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }

            // Output sesuai ekspektasi
            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1 : " + nilaiModul[i][0]);
            System.out.println("Nilai Modul 2 : " + nilaiModul[i][1]);
            System.out.println("Rata-rata : " + rataRata);
            System.out.println("Status : " + status);
            System.out.println();
        }
    }
}
