/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agata
 */
public class KucingLari extends Kucing
{
    private String tipeBerlari;
    
    public void setTipeSuspensi(String newValue)
    {
        tipeBerlari = newValue;
    }
    
    public void cetakStatus()
    {
        super.cetakStatus();
        System.out.println("Tipe Lari: "+ tipeBerlari);
    }
}