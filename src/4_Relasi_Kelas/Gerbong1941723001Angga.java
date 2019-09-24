/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.relasikelas4;

/**
 *
 * @author Agata
 */
public class Gerbong1941723001Angga {

    private String kode;
    private Kursi1941723001Angga[] arraykursi;
    private int jumlah;
    
    public Gerbong1941723001Angga(String kode, int jumlah){
        this.kode = kode;
        this.arraykursi = new Kursi1941723001Angga[jumlah];
        this.initKursi();
    }
    private void initKursi(){
      for (int i = 0; i < arraykursi.length; i++){
          this.arraykursi[i] = new Kursi1941723001Angga(String.valueOf(i + 1));
      }  
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getKode(){
        return kode;
    }
    public void setPenumpang(Penumpang1941723001Angga penumpang, int nomor){
        this.arraykursi[nomor - 1].setPenumpang(penumpang);
    }
    public Kursi1941723001Angga[] getArrayKursi(){
        return arraykursi;
    }
    public String info (){
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi1941723001Angga kursi : arraykursi){
            info += kursi.info();
        }
        return info;
    }
}
