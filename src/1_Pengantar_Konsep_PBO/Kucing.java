/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angga Rahmat Adriyadhi
 */
public class Kucing 
{
    private String mata;
    private int kakidepan;
    private int kakibelakang;
    
    public void setMerek(String newValue)
    {
        mata = newValue;
    }
    
    public void gantiGear(int newValue)
    {
        kakibelakang = newValue;
    }
    
    public void tambahKecepatan(int increment)
    {
        kakidepan = kakidepan + increment;
    }
    
    public void rem(int decrement)
    {
        kakidepan = kakidepan - decrement;
    }
    
    public void cetakStatus()
    {
        System.out.println("Mata: "+ mata);
        System.out.println("KakiDepan: "+ kakidepan);
        System.out.println("KakiBelakang: "+ kakibelakang);
    }
    
}
