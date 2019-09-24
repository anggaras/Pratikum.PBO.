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
public class Penumpang1941723001Angga {

    private String nama;
    private String ktp;

    public Penumpang1941723001Angga(String nama, String ktp) 
    {
        this.nama = nama;
        this.ktp = ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public String getKtp() {
        return ktp;
    }

    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
