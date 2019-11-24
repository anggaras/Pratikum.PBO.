/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classabitance.ClassAbstract;

/**
 *
 * @author Agata
 */
public class ClassOrang {
    private String nama;
    private ClassHewan HewanPeliharaan;
    
    public ClassOrang (String nama){
        this.nama = nama;
    }
    
    public void Peliharahewan(ClassHewan HewanPeliharaan){
        this.HewanPeliharaan = HewanPeliharaan;
    }
    
    public void AjakPeliharaanJalanJalan(){
        System.out.println("Namaku "+ this.nama);
        System.out.println("Hewan Peliharaan Berjalan Dengan Cara: ");
        this.HewanPeliharaan.bergerak();
        System.out.println("---------------------------------------");
    }
}
