/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.tugasrelasi;

/**
 *
 * @author Agata
 */
public class BeliTiketBerangkat1941723001Angga {

    private String namakotatujuan;
    private int idtiket;
    private int hargatiket;

    public BeliTiketBerangkat1941723001Angga() {
    }

    public BeliTiketBerangkat1941723001Angga(String namakotatujuan, int idtiket, int hargatiket) {
        this.namakotatujuan = namakotatujuan;
        this.idtiket = idtiket;
        this.hargatiket = hargatiket;
    }

    public String getNamaKotaTujuan() {
        return namakotatujuan;
    }

    public void setNamaKotaTujuan(String namakotatujuan) {
        this.namakotatujuan = namakotatujuan;
    }

    public int getIdTiket() {
        return idtiket;
    }

    public void setIdTiket(int idtiket) {
        this.idtiket = idtiket;
    }

    public int getHargaTiket() {
        return hargatiket;
    }

    public void setHargaTiket(int hargatiket) {
        this.hargatiket = hargatiket;
    }

    public int hitungBiayaBeliCD(int jumlah) {
        return hargatiket * jumlah;
    }

    public String info() {
        String info = "";
        info += "IdTiket : " + this.idtiket + "\n";
        info += "NamaKotaTujuan : " + this.namakotatujuan + "\n";
        info += "HargaTiket : Rp." + this.hargatiket;
        return info;
    }
}
