/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classoverloadoverrid;

/**
 *
 * @author Agata
 */
public class Staff1941723001angga extends Karyawan1941723001angga {
    private int lembur;
    private double gajiLembur;

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    
    public int getLembur() {
        return lembur;
    }

     public void setGajiLembur(double gajilembur) {
        this.gajiLembur = gajilembur;
    }

     public double getGajilembur() {
        return gajiLembur;
    }
     
    @Override
    public double getGaji()
    {
        return super.getGaji()+lembur*gajiLembur;
    }
    
    public void lihatinfo()
    {
        System.out.println("NIP:"+this.getNip());
        System.out.println("Nama:"+this.getNama());
        System.out.println("Golongan:"+this.getGolongan());
        System.out.println("Jml Lembur:"+this.getLembur());
        System.out.printf("Gaji Lembur:\n",this.getGajilembur());
        System.out.printf("Gaji:\n",this.getGaji());
    }
    
}
