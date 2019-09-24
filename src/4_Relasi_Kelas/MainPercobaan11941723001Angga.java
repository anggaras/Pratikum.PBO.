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
public class MainPercobaan11941723001Angga {

    public static void main(String[] args) {
        Processor1941723001Angga p = new Processor1941723001Angga("Intel i5", 3);
        Laptop1941723001Angga L = new Laptop1941723001Angga("Thinkpad", p);
        
        L.info();
        
        Processor1941723001Angga p1 = new Processor1941723001Angga();
        p1.setMerk("Intel i5");
        p1.setCache(4);
        
        Laptop1941723001Angga L1 = new Laptop1941723001Angga();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}
