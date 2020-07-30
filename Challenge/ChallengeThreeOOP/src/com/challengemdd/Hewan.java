package com.challengemdd;

public class Hewan {
    String nama,jenis;

    public Hewan(String nama, int umur, String jenis) {
        this.nama = nama;
        this.umur = umur;
        this.jenis = jenis;
    }

    public void profileHewan(){
        System.out.println("Profile hewan");
        System.out.print("Nama :" + nama + "\nUmur :" + umur + "\nJenis :" + jenis);
    }

    public void statusHewan(){
        if (umur < 1) System.out.println("belum siap diternakan");
        else if (umur >= 1 && umur <= 4) System.out.println("siap diternakan");
        else if (umur > 5) System.out.println("Hewan sudah tua");
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

    int umur;
}
