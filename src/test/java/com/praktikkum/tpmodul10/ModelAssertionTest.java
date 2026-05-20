package com.praktikkum.tpmodul10;

public class ModelAssertionTest {

    public static void main(String[] args) {
        testSemutGerakMengubahKoordinat();
        testLebahTerbangMenambahKoordinat();
        testLebahGerakMenggantiKoordinat();
        testSeranggaDefaultJumlahKaki();
        System.out.println("All Java assertion tests passed");
    }

    public void testSemutGerakMengubahKoordinatForSurefire() {
        testSemutGerakMengubahKoordinat();
    }

    public void testLebahTerbangMenambahKoordinatForSurefire() {
        testLebahTerbangMenambahKoordinat();
    }

    public void testLebahGerakMenggantiKoordinatForSurefire() {
        testLebahGerakMenggantiKoordinat();
    }

    public void testSeranggaDefaultJumlahKakiForSurefire() {
        testSeranggaDefaultJumlahKaki();
    }

    private static void testSemutGerakMengubahKoordinat() {
        Semut semut = new Semut("hitam", 60, 80);
        semut.gerak(new int[]{70, 90});
        assert semut.getPosisi().getX() == 70 : "Semut X harus berubah menjadi 70";
        assert semut.getPosisi().getY() == 90 : "Semut Y harus berubah menjadi 90";
    }

    private static void testLebahTerbangMenambahKoordinat() {
        Lebah lebah = new Lebah("kuning", 20, 30, 40);
        lebah.terbang(55, 65, 75);
        assert lebah.getPosisi().getX() == 75 : "Lebah X harus bertambah menjadi 75";
        assert lebah.getPosisi().getY() == 95 : "Lebah Y harus bertambah menjadi 95";
        assert lebah.getPosisi().getZ() == 115 : "Lebah Z harus bertambah menjadi 115";
    }

    private static void testLebahGerakMenggantiKoordinat() {
        Lebah lebah = new Lebah("kuning", 20, 30, 40);
        lebah.gerak(new int[]{25, 35, 45});
        assert lebah.getPosisi().getX() == 25 : "Lebah X harus diganti menjadi 25";
        assert lebah.getPosisi().getY() == 35 : "Lebah Y harus diganti menjadi 35";
        assert lebah.getPosisi().getZ() == 45 : "Lebah Z harus diganti menjadi 45";
    }

    private static void testSeranggaDefaultJumlahKaki() {
        Serangga serangga = new Serangga("coklat");
        assert serangga.getJumlahKaki() == 6 : "Default jumlah kaki serangga harus 6";
        assert "coklat".equals(serangga.getWarna()) : "Warna serangga harus coklat";
    }
}
