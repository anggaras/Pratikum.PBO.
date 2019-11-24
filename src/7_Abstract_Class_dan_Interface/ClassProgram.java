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
public class ClassProgram {
    public static void main(String[] args) {
        ClassKucing KucingKampung = new ClassKucing();
        ClassIkan LumbaLumba = new ClassIkan();
        
        ClassOrang ANI = new ClassOrang("ANI");
        ClassOrang BUDI = new ClassOrang("BUDI");
        
        ANI.Peliharahewan(KucingKampung);
        BUDI.Peliharahewan(LumbaLumba);
        
        ANI.AjakPeliharaanJalanJalan();
        BUDI.AjakPeliharaanJalanJalan();
    }
}
