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
public class Manager1941723001angga extends Karyawan1941723001angga {
    private double tunjangan;
    private String bagian;
    private Staff1941723001angga st[];

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }
    
    public void setStaff(Staff1941723001angga st[]) {
        this.st=st;
    }
    
    public void viewStaff()
    {
        int i;
        System.out.println("--------------");
        for (i = 0; i < st.length; i++) {
        st[i].lihatinfo();
        }
        System.out.println("---------------");
    }
    
    public void lihatinfo()
    {
        System.out.println("Manager:"+this.getBagian());
        System.out.println("NIP:"+this.getNip());
        System.out.println("Nama:"+this.getNama());
        System.out.println("Golongan:"+this.getGolongan());
        System.out.printf("Tunjangan:\n"+this.getTunjangan());
        System.out.printf("Gaji:\n"+this.getGaji());
        System.out.println("Bagian:"+this.getBagian());
        this.viewStaff();
    }

    @Override
    public double getGaji()
    {
        return super.getGaji()+tunjangan;
    }  
}
