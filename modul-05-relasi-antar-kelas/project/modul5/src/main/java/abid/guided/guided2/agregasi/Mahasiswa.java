package abid.guided.guided2.agregasi;

public class Mahasiswa {
    private String NIM, Nama;

    public Mahasiswa(String NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
    }

    // getter

    public String getNIM() {
        return NIM;
    }

    public  String getNama(){
        return  Nama;
    }

    // setter

    public  void  setnama(String Nama){
        this.Nama = Nama;
    }

    public  void  setnNIM(String NIM){
        this.NIM = NIM;
    }
}
