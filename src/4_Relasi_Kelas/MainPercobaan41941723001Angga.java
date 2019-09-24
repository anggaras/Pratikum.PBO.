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
public class MainPercobaan41941723001Angga {
    public static void main(String[] args) 
    {
        Penumpang1941723001Angga p = new Penumpang1941723001Angga("12345", "Mr. Krab");
        Gerbong1941723001Angga gerbong = new Gerbong1941723001Angga("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
    }
}
