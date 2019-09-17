/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.koperasigettersetter;

public class KoperasiDemo1941723001Angga {
    public static void main(String[] args) 
    {
        Anggota anggota1 = new Anggota(" Iwan","Jalan Mawar");
        System.out.println("Simpanan" +anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());
        
        anggota1.setNama("Iwan setiawan");
        anggota1.setAlamat("jalan soekarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("simpanan "+ anggota1.getNama()+ " : Rp "+anggota1.getSimpanan());
        
        anggota1.pinjaman(500);
        System.out.println("simpanan " +anggota1.getNama()+" : Rp "+ anggota1.getSimpanan());
    }
}
