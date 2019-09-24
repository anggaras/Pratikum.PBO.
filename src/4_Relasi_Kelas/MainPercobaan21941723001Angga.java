/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.relasikelas2;

/**
 *
 * @author Agata
 */
public class MainPercobaan21941723001Angga {

    public static void main(String[] args) {
        Mobil1941723001Angga m = new Mobil1941723001Angga();
        m.setMerk("Avanza");
        m.setBiaya(350000);
        
        Sopir1941723001Angga s = new Sopir1941723001Angga();
        s.setNama("John Doe");
        s.setBiaya(200000);
        
        Pelanggan1941723001Angga p = new Pelanggan1941723001Angga();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        
        System.out.println(p.getMobil().getMerk());
        System.out.println("Biaya Total = "+ p.hitungBiayaTotal());
    }
}
