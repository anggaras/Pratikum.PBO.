/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorencapsulation;

public class Motor 
{
    public int Kecepatan =0;
    public boolean KontakOn = false;
    public void nyalakanMesin()
            {
                KontakOn = true;
            }
    public void matikanMesin()
    {
        KontakOn = false;
        Kecepatan =0;
    }
    public void tambahKecepatan()
    {
        if(KontakOn == true)
        {
            Kecepatan +=50;
        }
    else
        {
            System.out.println("kecepatan tidak bisa bertambah karena mesin off! \n");         
        }
    }
    public void KurangiKecepatan()
    {
        if(KontakOn == true)
        {
            Kecepatan -=1;
        }
        else
        {
            System.out.println("kecepatan tidak bisa berkurang karena mesin off \n");
        }
    }
    public void printStatus()
    {
        if (KontakOn == true)
        {
            System.out.println("Kontak On");
        }
        else
        {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan" + Kecepatan+"\n");
    }
}
