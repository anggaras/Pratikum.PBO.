/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.classpolimorfisme4;

/**
 *
 * @author Agata
 */
public class ClassBarrier implements ClassDestroyable{
    private int strength;

    public ClassBarrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void Destroyed() {
        strength = (int) (strength - (strength * 0.1));
        if(strength <= 0){
            System.out.println("Barrier Hancur..!");
        }
    }
    
    public String getBarrierInfo(){
        String info = "";
        info += "Barrier Strength ="+ strength;
        return info;
    }
}
