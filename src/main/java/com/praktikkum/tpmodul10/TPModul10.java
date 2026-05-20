package com.praktikkum.tpmodul10;

public class TPModul10 {

    public static void main(String[] args) {
        Serangga semut = new Semut("hitam", 60, 80);
        System.out.println("Warna Semut: " + semut.getWarna());
        semut.info();
        semut.gerak(new int[]{70, 90});
        semut.info();

        Lebah lebah = new Lebah("kuning", 20, 30, 40);
        System.out.println("Warna Lebah: " + lebah.getWarna());
        lebah.terbang(55, 65, 75);
        lebah.info();
        lebah.gerak(new int[]{25, 35, 45});
        lebah.info();
    }
}
