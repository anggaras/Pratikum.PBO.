/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.relasikelas;

/**
 *
 * @author Agata
 */
public class Laptop1941723001Angga {
    private String merk;
    private Processor1941723001Angga proc;

    public Laptop1941723001Angga() {
    }
    
    public Laptop1941723001Angga(String merk, Processor1941723001Angga proc) {
        this.merk = merk;
        this.proc = proc;
    }
    
    public void info() {
    System.out.println("Merk Laptop = " + merk);
    proc.info();
    }   

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setProc(Processor1941723001Angga proc) {
        this.proc = proc;
    }

}
