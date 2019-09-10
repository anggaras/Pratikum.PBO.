/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tokogame;

public class DataGame1941723001Angga {
    public int ID;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int waktuSewa;
    public int total;
    
public void tampilkanTotalHarga(){
    total = waktuSewa*harga;
    System.out.println("ID Member : " +ID);
    System.out.println("Nama Member : " +namaMember);
    System.out.println("Nama Game : " +namaGame);
    System.out.println("Lama Sewa : " +waktuSewa +("hari"));
    System.out.println("Harga Sewa : " +harga);
    System.out.println("Harga Total : " +total);
}
}