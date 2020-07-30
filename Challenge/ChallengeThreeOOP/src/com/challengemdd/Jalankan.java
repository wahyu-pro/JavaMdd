package com.challengemdd;

public class Jalankan {

    public static void main(String[] args) {
        // object reptil
        Hewan reptil = new Hewan("buaya", 2, "vertebatra");
        reptil.profileHewan();

        System.out.println("\n --- \n");

        // object murai
        Unggas murai = new Unggas();
        murai.setNama("murai batu");
        murai.setUmur(6);
        murai.setJenis("vertebatra");

        // tampilkan profile dan status hewan
        murai.profileHewan();
        murai.statusHewan();

        System.out.println("\n --- \n");

        // object tenggiri
        Ikan tengiri = new Ikan("tengiri", 3, "vertebatra");
        tengiri.profileHewan();
        tengiri.statusHewan();
        System.out.println("berat dengan kandungan air = " + tengiri.hitungBerat(10, 5));
        System.out.println("berat tanpa kandungan air = " + tengiri.hitungBerat(10));
    }
}
