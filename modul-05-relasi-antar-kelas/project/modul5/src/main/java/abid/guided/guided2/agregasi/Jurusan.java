// package abid.guided.guided2.agregasi;

// public class Jurusan {
//     private  static int jumlahMahasiswa; // gk bisa <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//     private  String kodeJurusan, namaJurusan;
//     private Mahasiswa[] daftarMahasiswa = new Mahasiswa[32];

    // // Constructor
    // public  Jurusan (String kodeJurusan, String namaJurusan){
    //     this.kodeJurusan = kodeJurusan;
    //     this.namaJurusan = namaJurusan;
    // }


//     // Behavior
//     public void addMahasiswa(Mahasiswa m){
//         this.daftarMahasiswa[jumlahMahasiswa] = m;
//         jumlahMahasiswa++;
//     }

//     public  void  displayMahasiswa(){
//         System.out.println("kode jurusan: " + this.kodeJurusan);
//         System.out.println("Nama jurusan: " + this.namaJurusan);

//         System.out.println("daftar mahasiswa: ");

//     }
    

//     for (int i = 0; i<jumlahMahasiswa;i++){
//         System.out.println(i+1 + ". " + daftarMahasiswa[i].getNIM() + " " + daftarMahasiswa[i].getNama());
//     }

//     // Getter
//     public String getKodeJurusan() {
//         return this.kodeJurusan;
//     }

//     public String getNamaJurusan() {
//         return this.namaJurusan;
//     }

//     // Setter
//     public void setKodeJurusan(String kodeJurusan) {
//         this.kodeJurusan = kodeJurusan;
//     }

//     public void setNamaJurusan(String namaJurusan) {
//         this.namaJurusan = namaJurusan;
//     }
    
// }

package abid.guided.guided2.agregasi;

public class Jurusan {
    private int jumlahMahasiswa = 0; // jangan static
    private String kodeJurusan, namaJurusan;
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[32];

    // Constructor
    public Jurusan(String kodeJurusan, String namaJurusan){
        this.kodeJurusan = kodeJurusan;
        this.namaJurusan = namaJurusan;
    }

    // Behavior
    public void addMahasiswa(Mahasiswa m){
        if (jumlahMahasiswa < daftarMahasiswa.length) {
            this.daftarMahasiswa[jumlahMahasiswa] = m;
            jumlahMahasiswa++;
        }
    }

    public void displayMahasiswa(){
        System.out.println("kode jurusan: " + this.kodeJurusan);
        System.out.println("Nama jurusan: " + this.namaJurusan);
        System.out.println("daftar mahasiswa: ");

        for (int i = 0; i < jumlahMahasiswa; i++){
            System.out.println((i+1) + ". " + daftarMahasiswa[i].getNIM() + " " + daftarMahasiswa[i].getNama());
        }
    }

    // Getter
    public String getKodeJurusan() {
        return this.kodeJurusan;
    }

    public String getNamaJurusan() {
        return this.namaJurusan;
    }

    // Setter
    public void setKodeJurusan(String kodeJurusan) {
        this.kodeJurusan = kodeJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }
}