/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkum.tpmodul10;

/**
 *
 * @author Rendy
 */
public class Serangga {
    private int jumlahKaki;
    private String warna;

    public Serangga(String warna) {
        this.jumlahKaki = 6;
        this.warna = warna;
    }
    
    public void gerak(int[] sumbu){
        System.out.println("Serangga Bergerak");
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public void info(){
        System.out.println("Posisi Serangga ada pada x, y, dan z");
    }
    
}
