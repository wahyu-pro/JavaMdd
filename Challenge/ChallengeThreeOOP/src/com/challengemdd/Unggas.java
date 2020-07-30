package com.challengemdd;

public class Unggas extends Hewan{
    @Override
    public void statusHewan() {
        if (umur < 1) System.out.println("Belum siap diternakan");
        else if (umur >= 1) System.out.println("Siap diternakan");
    }
}
