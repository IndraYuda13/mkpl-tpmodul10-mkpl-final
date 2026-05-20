package com.praktikkum.tpmodul10;

public class Semut extends Serangga {
    private Koordinat posisi;

    public Semut(String warna, int x, int y) {
        super(warna);
        this.posisi = new Koordinat(x, y);
    }

    public Koordinat getPosisi() {
        return posisi;
    }

    @Override
    public void gerak(int[] sumbu) {
        posisi.setX(sumbu[0]);
        posisi.setY(sumbu[1]);
    }

    @Override
    public void info() {
        System.out.println("Posisi Semut\t: X = " + posisi.getX());
        System.out.println("            \t: Y = " + posisi.getY());
    }
}
