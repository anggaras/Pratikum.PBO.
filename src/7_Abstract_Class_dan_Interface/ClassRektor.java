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
public class ClassRektor {
    public void BeriSertifikatCumlaude(ClassIcumlaude ClassMahasiswa)
    {
        System.out.println("Saya REKTOR,memberikan sertifikat cumlaude");
        System.out.println("selamat! silahkan perkenalkan diri anda");
        
        ClassMahasiswa.lulus();
        ClassMahasiswa.meraihIPKTinggi();
        
        System.out.println("------------------------------------------");
    }
}
