package com.challengemdd;

public class NumberTwo {
    public static void main(String args []){
        var lyric = "Aku ingin begini\n" +
                "Aku ingin begitu\n" +
                "Ingin ini itu banyak sekali\n\n" +
                "Semua semua semua\n" +
                "Dapat dikabulkan\n" +
                "Dapat dikabulkan\n" +
                "Dengan kantong ajaib\n\n" +
                "Aku ingin terbang bebas\n" +
                "Di angkasa\n" +
                "Hei… baling baling bambu\n\n" +
                "La... la... la...\n" +
                "Aku sayang sekali\n" +
                "Doraemon\n\n" +
                "La... la... la...\n" +
                "Aku sayang sekali";

        System.out.println("Aku = " + countWord(lyric, "aku"));
        System.out.println("ingin = " + countWord(lyric, "ingin"));
        System.out.println("la... = " + countWord(lyric, "la..."));
    }

    public static int countWord(String lyric, String text){

        String lirik = lyric.replace("\n", " ").toLowerCase();
        return lirik.split(text.toLowerCase(), -1).length-1;
    }

}
