/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classoverloading2;

/**
 *
 * @author Agata
 */
public class ClassPerkalianKu1941723001angga {
    @Overloading
    void perkalian(int a, int b)
    {
        System.out.println(a * b);
    }
    @Overloading
    void perkalian(double a, double b)
    {
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        ClassPerkalianKu1941723001angga objek = new ClassPerkalianKu1941723001angga();
        
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}
