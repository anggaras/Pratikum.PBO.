/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.relasikelas3;

/**
 *
 * @author Agata
 */
public class MainPercobaan31941723001Angga {
    public static void main(String[] args) {
        Pegawai1941723001Angga masinis = new Pegawai1941723001Angga("1234", "SpongebobSquarepants");
        Pegawai1941723001Angga asisten = new Pegawai1941723001Angga("4567", "Patrick Star");
        KeretaApi1941723001Angga keretaApi = new KeretaApi1941723001Angga("Gaya Baru", "Bisnis",masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
