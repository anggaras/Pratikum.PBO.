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
public class Kursi1941723001Angga {

    private String nomor;
    private Penumpang1941723001Angga penumpang;

    public Kursi1941723001Angga(String nomor) {
        this.nomor = nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setPenumpang(Penumpang1941723001Angga penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang1941723001Angga getPenumpang() {
        return penumpang;
    }
    public String info(){
        String info= "";
        info += "Nomor: " + nomor + "\n";
        if(this.penumpang != null){
          info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;            
    }
    
}
