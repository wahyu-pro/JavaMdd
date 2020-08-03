package com.challengemdd;

public class Hewan {
    String nama,jenis;
    int umur;

    public Hewan(String nama, int umur, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }

    public String profileHewan(){
        System.out.println("--- Profile hewan ---");
        return "Nama :" + nama + "\nUmur :" + umur + "\nJenis :" + jenis;
    }

    public String statusHewan(){
        System.out.println("--- Status hewan ---");
        if (umur < 1) return "belum siap diternakan";
        else if (umur <= 4) return "siap diternakan";
        else return "Hewan sudah tua";
    }

    public Hewan() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

}
