/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agata
 */
public class Promo1941723001Angga {
    public int code;
    public String namaBarang;
    public int hargaBarang;
    public float potongan;
    
    public void TampilkanSetelahPromo(){
        System.out.println("Kode Barang : " +code);
        System.out.println("Nama Barang : " +namaBarang);
        System.out.println("Harga Dasar : " +hargaBarang);
        System.out.println("Diskon : " +potongan +("%"));
        System.out.println("Total : "+setelahpromo());
    }
    public float setelahpromo(){
       float setelahpromo = (hargaBarang * potongan);
       return setelahpromo;
    }
}
