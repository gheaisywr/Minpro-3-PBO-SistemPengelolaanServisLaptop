package model;

import interfaces.InformasiPerangkat;
public abstract class Perangkat implements InformasiPerangkat {

    private final String idPerangkat;
    private String merk;
    private String tipe;
    private String kerusakan;

    public Perangkat(String idPerangkat, String merk, String tipe, String kerusakan) {
        this.idPerangkat = idPerangkat;
        this.merk = merk;
        this.tipe = tipe;
        this.kerusakan = kerusakan;
    }
    public String getIdPerangkat() {
        return idPerangkat;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getTipe() {
        return tipe;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public String getKerusakan() {
        return kerusakan;
    }
    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }
    @Override
    public abstract void tampilkanInfo();
}