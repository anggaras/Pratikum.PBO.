/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.relasikelas3;

/**
 *
 * @author Agata
 */
public class KeretaApi1941723001Angga {

    private String nama;
    private String kelas;
    private Pegawai1941723001Angga masinis;
    private Pegawai1941723001Angga asisten;

    public KeretaApi1941723001Angga(String nama, String kelas, Pegawai1941723001Angga masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi1941723001Angga(String nama, String kelas, Pegawai1941723001Angga masinis, Pegawai1941723001Angga asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setMasinis(Pegawai1941723001Angga masinis) {
        this.masinis = masinis;
    }

    public void setAsisten(Pegawai1941723001Angga asisten) {
        this.asisten = asisten;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public Pegawai1941723001Angga getMasinis() {
        return masinis;
    }

    public Pegawai1941723001Angga getAsisten() {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
}
