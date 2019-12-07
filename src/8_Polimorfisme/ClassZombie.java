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
abstract class ClassZombie implements ClassDestroyable{
    protected int health;
    protected int level;
    
    abstract void Heal();

    @Override
    abstract public void Destroyed();
    
    public String getZombieInfo(){
        String info = "";
        info += "Health" + health;
        info += "Level" + level;
        return info;
    }
}
