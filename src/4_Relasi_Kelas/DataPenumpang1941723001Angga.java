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
public class DataPenumpang1941723001Angga {
    private String nama;
    private int ktp;
    private BeliTiketBerangkat1941723001Angga belitiketberangkat;
    private BeliTiketPulang1941723001Angga belitiketpulang;
    private int tiket;
    private int jumlah;

    public DataPenumpang1941723001Angga() {
    }
    
    public DataPenumpang1941723001Angga(String nama, int ktp, BeliTiketBerangkat1941723001Angga belitiketberangkat, BeliTiketPulang1941723001Angga belitiketpulang, int tiket, int jumlah) {
        this.nama = nama;
        this.ktp = ktp;
        this.belitiketberangkat = belitiketberangkat;
        this.belitiketpulang = belitiketpulang;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }



    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKtp() {
        return ktp;
    }

    public void setKtp(int ktp) {
        this.ktp = ktp;
    }

    public BeliTiketBerangkat1941723001Angga getBeliTiketBerangkat() {
        return belitiketberangkat;
    }

    public void setBeliTiketBerangkat(BeliTiketBerangkat1941723001Angga belitiketberangkat) {
        this.belitiketberangkat = belitiketberangkat;
    }

    public BeliTiketPulang1941723001Angga getHargaTiket() {
        return belitiketpulang;
    }

    public void setBeliTiketPulang(BeliTiketPulang1941723001Angga belitiketpulang) {
        this.belitiketpulang = belitiketpulang;
    }

    public int getTiket() {
        return tiket;
    }

    public void setTiket(int tiket) {
        this.tiket = tiket;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
        
    public int hitungBiayaTotal(){
       return belitiketpulang.hitungBiayaTiket(tiket)+belitiketberangkat.hitungBiayaBeliCD(jumlah);
    }
    
    public String info(){
        String info="";
        info += "Nama = "+this.nama + "\n";
        info += "Ktp = " +this.ktp+"\n\n";
        info += "BeliTiketBerangkat  \n"+this.belitiketberangkat.info()+"\n\n";
        info += "BeliTiketPulang  \n"+this.belitiketpulang.info()+"\n\n";
        info += "Keterangan \n";
        info += "Jumlah Tiket = "+this.tiket+" Tiket"+"\n";
        info += "Jumlah Tiket = "+this.jumlah+" Tiket"+"\n";
        info += "Biaya Total = Rp."+this.hitungBiayaTotal();
        return info;
    }
}
