package model;

public class Laptop extends Perangkat {
    private String ukuranLayar;
    public Laptop(String idPerangkat, String merk, String tipe, String kerusakan, String ukuranLayar) {
        super(idPerangkat, merk, tipe, kerusakan);
        this.ukuranLayar = ukuranLayar;
    }
    public String getUkuranLayar() {
        return ukuranLayar;
    }
    public void setUkuranLayar(String ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }
    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis        : Laptop");
        System.out.println("ID Laptop    : " + getIdPerangkat());
        System.out.println("Merk         : " + getMerk());
        System.out.println("Tipe         : " + getTipe());
        System.out.println("Kerusakan    : " + getKerusakan());
        System.out.println("Ukuran Layar (Inci) : " + ukuranLayar + " Inci");
    }
}