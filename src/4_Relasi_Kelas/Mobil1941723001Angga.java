/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.relasikelas2;

/**
 *
 * @author Agata
 */
public class Mobil1941723001Angga {
    private String merk;
    private String nama;
    private int biaya;

    public Mobil1941723001Angga() {
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public String getMerk() {
        return merk;
    }

    public String getNama() {
        return nama;
    }

    public int getBiaya() {
        return biaya;
    }
    
    public int hitungBiayaMobil(int hari) 
    {
    return biaya * hari;
    }
}
