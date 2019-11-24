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
public abstract class ClassHewan {
    private int umur;
    
    protected ClassHewan()
    {
        this.umur = 0;
    }
    
    public void bertambahUmur()
    {
        this.umur += 1;
    }
    
    public abstract void bergerak();
}
