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
public class BeliTiketPulang1941723001Angga {
    private String namakotatujuan;
    private int nomotiket;
    private int hargatiket;

    public BeliTiketPulang1941723001Angga() {
    }

    public BeliTiketPulang1941723001Angga(String nama, int nomortiket, int hargatiket) {
        this.namakotatujuan = nama;
        this.nomotiket = nomortiket;
        this.hargatiket = hargatiket;
    }

    public String getNamaKotaTujuan() {
        return namakotatujuan;
    }

    public void setNamaKotaTujuan(String namakotatujuan) {
        this.namakotatujuan = namakotatujuan;
    }

    public int getnomortiket() {
        return nomotiket;
    }

    public void setnomortiket(int nomortiket) {
        this.nomotiket = nomortiket;
    }

    public int getHargaTiket() {
        return hargatiket;
    }

    public void setHargaTiket(int hargatiket) {
        this.hargatiket = hargatiket;
    }
    
    
    public int hitungBiayaTiket(int hari){
        return hargatiket;
    }
    
    public String info(){
        String info="";
        info += "IdTiket : " +this.nomotiket+"\n";
        info += "NamaKotaTujuan : "+this.namakotatujuan + "\n";
        info += "HargaTiket : Rp."+this.hargatiket;
        return info;
    }
}
