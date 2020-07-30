package com.challengemdd;

public class Ikan extends Hewan{

    public Ikan (String nama, int umur, String jenis){
        super.nama = nama;
        super.umur = umur;
        super.jenis = jenis;
    }


    // Overloading
    public Integer hitungBerat (int bobot){
        return Math.multiplyExact(umur, bobot);
    }

    public Integer hitungBerat (int bobot, int kandunganAir){
        return Math.multiplyExact(umur, bobot) - kandunganAir;
    }
}
