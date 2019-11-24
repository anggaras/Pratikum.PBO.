/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classabitance.ClassInterface;

/**
 *
 * @author Agata
 */
public class ClassMahasiswa implements ClassIcumlaude{
    protected String nama;

    public ClassMahasiswa(String nama) {
        this.nama = nama;
    }

    @Override
    public void lulus() {
        System.out.println("Lulusan Terbaik");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
    
    public void KuliahDiKampus()
    {
        System.out.println("Aku mahasiswa, namaku "+ this.nama);
        System.out.println("Aku berkuliah di kampus");
    }
}
