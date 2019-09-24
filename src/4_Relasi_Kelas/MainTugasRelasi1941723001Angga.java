/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.tugasrelasi;

/**
 *
 * @author Agata
 */
public class MainTugasRelasi1941723001Angga {
    public static void main(String[] args) {
        Bandara1941723001Angga B = new Bandara1941723001Angga("Angga",1941723009);
        B.info();
        
        BeliTiketBerangkat1941723001Angga T = new BeliTiketBerangkat1941723001Angga("Jakarta-Bali",16957754,1200000);
        BeliTiketPulang1941723001Angga T2 = new BeliTiketPulang1941723001Angga("Bali-Jakarta",90927856,1200000);
        DataPenumpang1941723001Angga CS = new DataPenumpang1941723001Angga("Willy Subastian",456543376,T,T2,1,1);
        
        
        System.out.println("====================================");
        System.out.println(CS.info());
        System.out.println("====================================");
    }
}
