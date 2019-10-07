/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classinheritance3;

/**
 *
 * @author Agata
 */
public class Tabung1941723001angga extends Bangun1941723001angga {
    protected int t;

    public void setT(int t) {
        this.t = t;
    }

    public void setSuperPhi(double phi) {
        super.phi = phi;
    }

    public void setSuperR(int r) {
        super.r = r;
    }
    
    public void volume()
    {
        System.out.println("Volume Tabung Adalah:"+(super.phi*super.r*super.r*this.t));
    }
}
