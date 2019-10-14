/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classtugasoverloading;

/**
 *
 * @author Agata
 */
public class ClassSegitiga1941723001angga {
    private static int sudut;
    public static void main(String[] args) {
        sudut=30;
        System.out.println(totalSudut(sudut));
        System.out.println(totalSudut(sudut, sudut));
        System.out.println(keliling(sudut, sudut, sudut));
        System.out.println(keliling(sudut, sudut, sudut));
        
        System.out.println("");
        
        System.out.println(totalSudut((float)sudut, (float)sudut));
        System.out.println(totalsudut(sudut));
        System.out.println(keliling((float)sudut, sudut, sudut));
        System.out.println(keliling((float)sudut, sudut));
        
    }
    
    public static int totalSudut(int sudutA){
        return 0;
    }
    
    public static int totalSudut(int sudutA, int sudutB){
        return 0;
    }
    
    public static int keliling(int sisiA, int sisiB, int sisiC){
        return 0;
    }
    
    public static double keliling(int sisiA, int sisiB){
        return 0;
    }
    
    public static int totalsudut(float sudutA){
        return (int) ((int)180 - sudutA);
    }
    
    public static int totalSudut(float sudutA, float sudutB){
        return (int) ((int) 180 - (sudutA+sudutB));
    }
    
    public static int keliling(float sisiA, int sisiB, int sisiC){
        return(int) ((int) sisiB+sisiA+sisiC);
    }
    
    public static double keliling(float sisiA, int sisiB){
        return Math.pow(Math.sqrt(sisiA),2) + Math.pow(Math.sqrt(sisiA),2);
    } 
}
