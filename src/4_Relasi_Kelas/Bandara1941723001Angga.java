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
public class Bandara1941723001Angga {
    private String nama;
    private int id;

    public Bandara1941723001Angga(){
        
    }
    
    public Bandara1941723001Angga(String nama, int id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String info(){
        String info="";
        info += "Id Admin : " +this.id+"\n";
        info += "Nama : "+this.nama + "\n";
        return info;
    }
}
