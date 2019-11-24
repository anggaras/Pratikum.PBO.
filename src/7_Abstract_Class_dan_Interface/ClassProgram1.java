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
public class ClassProgram {
    public static void main(String[] args) {
        ClassRektor pakRektor = new ClassRektor();
        
        ClassMahasiswa MahasiswaBiasa = new ClassMahasiswa("Charlie");
        ClassSarjana SarjanaCumlaude = new ClassSarjana("Dini");
        ClassPascaSarjana MasterCumlaude = new ClassPascaSarjana("Elok");
        
        pakRektor.BeriSertifikatCumlaude(MahasiswaBiasa);
        MahasiswaBiasa.KuliahDiKampus();
        pakRektor.BeriSertifikatCumlaude(SarjanaCumlaude);
        SarjanaCumlaude.KuliahDiKampus();
        pakRektor.BeriSertifikatCumlaude(MasterCumlaude);
        MasterCumlaude.KuliahDiKampus();
    }
}
