/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.praktikkum.tpmodul10;

/**
 *
 * @author Rendy
 */
public class TPModul10 {

    public static void main(String[] args) {
        Serangga S = new Semut("hitam", 60, 80);
        System.out.println("Warna Semut\t: " + S.getWarna());
        S.info();
        S.gerak(new int[]{70, 90});
        S.info();
        Serangga L = new Lebah("kuning", 20,30,40);
        System.out.println("Warna Lebah\t: " + L.getWarna());
        L.terbang(55,65,75);
        L.info();
        L.gerak(new int[]{25, 35, 45});
        L.info();
    }
}
