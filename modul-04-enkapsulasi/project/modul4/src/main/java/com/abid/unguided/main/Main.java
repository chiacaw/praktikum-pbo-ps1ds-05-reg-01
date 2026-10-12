package com.abid.unguided.main;

import com.abid.unguided.laporan.LaporanDataset;
import com.abid.unguided.model.Dataset;

public class Main {
    public static void main(String[] args) {
        // Objek 1: Constructor tanpa parameter, isi memakai setter
        Dataset data1 = new Dataset();
        data1.setNama("Titanic");
        data1.setJumlahBaris(891);
        data1.setJumlahKolom(12);
        data1.setJumlahMissing(866);

        // Objek 2: Constructor 1 parameter
        Dataset data2 = new Dataset("Wine Quality");
        // Karena baris dan kolom tidak diset, nilainya default 0

        // Objek 3: Constructor lengkap
        Dataset data3 = new Dataset("Iris", 150, 5, 0);

        // Menyimpan ketiga objek ke dalam array
        Dataset[] daftarDataset = {data1, data2, data3};

        // Instansiasi objek pelapor
        LaporanDataset pelapor = new LaporanDataset();

        // Mencetak laporan dengan perulangan
        for (int i = 0; i < daftarDataset.length; i++) {
            pelapor.cetak(daftarDataset[i]);
        }

        // Menampilkan total dataset dengan memanggil method static
        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}
