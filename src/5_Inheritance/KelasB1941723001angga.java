/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classinheritance2;

/**
 *
 * @author Agata
 */
public class KelasB1941723001angga extends KelasA1941723001angga {
    public int z;

    public void setZ(int z) 
    {
        this.z = z;
    }
    
    public void getNilaiZ()
    {
        System.out.println("nilai Z:"+z);
    }
    public void getJumlah()
    {
        System.out.println("jumlah:"+(x+y+z));
    }
}
