package com.challengemdd;

public class Unggas extends Hewan{
    @Override
    public String  statusHewan() {
        if (umur < 1) return "Belum siap diternakan";
        else return "Siap diternakan";
    }
}
