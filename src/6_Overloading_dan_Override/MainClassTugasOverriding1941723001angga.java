/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classtugasoverriding;

/**
 *
 * @author Agata
 */
public class MainClassTugasOverriding1941723001angga {
    public static void main(String[] args) {
        ClassManusia1941723001angga man = new ClassManusia1941723001angga();
        ClassManusia1941723001angga mandmd1 = new ClassDosen1941723001angga();
        ClassManusia1941723001angga mandmd2 = new ClassMahasiswa1941723001angga();
        
        System.out.println("manusia");
        man.bernafas();
        man.makan();
        System.out.println("dosen");
        mandmd1.bernafas();
        mandmd1.makan();
        System.out.println("mahasiswa");
        mandmd2.bernafas();
        mandmd2.makan();
    }
}
