/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lingkaran;

public class SebuahLingkaran1941723001Angga {
    public double phi;
    public double jarijari;
    public double hitungLuas;
    public double hitungKeliling;
    
    public void tampilkanDetailLingkaran()
    {
        hitungLuas = phi*jarijari*jarijari;
        hitungKeliling = 2*phi*jarijari;
        System.out.println("phi lingkaran = " +phi);
        System.out.println("jari-jari lingkaran = " +jarijari);
        System.out.println("Total Keliling : " +hitungKeliling +("cm"));
        System.out.println("Total Luas : " +hitungLuas +("cm"));
    }
}
