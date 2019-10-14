/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classoverloading;

/**
 *
 * @author Agata
 */
public class PerkalianKu1941723001angga {
    @Overloading
    void perkalian(int a, int b)
    {
        System.out.println(a*b);
    }
    @Overloading
    void perkalian(int a, int b, int c)
    {
        System.out.println(a*b*c);
    }
    public static void main(String[] args) {
        PerkalianKu1941723001angga objek = new PerkalianKu1941723001angga();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}
