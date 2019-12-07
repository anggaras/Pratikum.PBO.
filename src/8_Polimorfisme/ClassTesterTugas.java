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
public class ClassTesterTugas {
    public static void main(String[] args) {
        ClassWalkingZombie wz = new ClassWalkingZombie(100,1);
        ClassJumpingZombie jz = new ClassJumpingZombie(100,2);
        ClassBarrier b = new ClassBarrier(100);
        ClassPlant p = new ClassPlant();
        
        System.out.println(""+ wz.getZombieInfo());
        System.out.println(""+ jz.getZombieInfo());
        System.out.println(""+ b.getBarrierInfo());
        System.out.println("-------------------------");
        
        for(int i = 0; i < 4; i++){
            p.DoDestroy(wz);
            p.DoDestroy(jz);
            p.DoDestroy(b);
        }
         
        System.out.println(""+ wz.getZombieInfo());
        System.out.println(""+ jz.getZombieInfo());
        System.out.println(""+ b.getBarrierInfo());
    }
}
