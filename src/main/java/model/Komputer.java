package model;

public class Komputer extends Perangkat {
    private String jenisCasing;
    public Komputer(String idPerangkat, String merk, String tipe, String kerusakan, String jenisCasing) {
        super(idPerangkat, merk, tipe, kerusakan);
        this.jenisCasing = jenisCasing;
    }
    public String getJenisCasing() {
        return jenisCasing;
    }
    public void setJenisCasing(String jenisCasing) {
        this.jenisCasing = jenisCasing;
    }
    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis        : Komputer");
        System.out.println("ID Komputer  : " + getIdPerangkat());
        System.out.println("Merk         : " + getMerk());
        System.out.println("Tipe         : " + getTipe());
        System.out.println("Kerusakan    : " + getKerusakan());
        System.out.println("Jenis Casing : " + jenisCasing);
    }
}