package com.abid.guided2;

class Manager extends Employee {
    private String alamat;

    public Manager(String nama, String s) {
    /*memanggil konstruktor employee*/
    super(nama);
    this.alamat = s;
    }

    public void tampilInformasi() {
        super.tampilNama();
        System.out.println("alamat : "  +   alamat);
        System.out.println("departemen : "  + super.departemen);
}

}
