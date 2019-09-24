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
public class Pelanggan1941723001Angga {
    private String nama;
    private Mobil1941723001Angga mobil;
    private Sopir1941723001Angga sopir;
    private int hari;

    public Pelanggan1941723001Angga() {
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMobil(Mobil1941723001Angga mobil) {
        this.mobil = mobil;
    }

    public void setSopir(Sopir1941723001Angga sopir) {
        this.sopir = sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public String getNama() {
        return nama;
    }

    public Mobil1941723001Angga getMobil() {
        return mobil;
    }

    public Sopir1941723001Angga getSopir() {
        return sopir;
    }

    public int getHari() {
        return hari;
    }
    
    public int hitungBiayaTotal() {
    return mobil.hitungBiayaMobil(hari) +
    sopir.hitungBiayaSopir(hari);
    }
}
