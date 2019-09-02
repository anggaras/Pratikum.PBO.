/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angga Rahmat Adriyadhi
 */
public class KucingBerjalan 
{
    public static void main(String[] args)
    {
        //Buat dua buah objek sepeda
        Kucing kcg1 = new Kucing();
        Kucing kcg2 = new Kucing();
        KucingLari kcg3 = new KucingLari();
        
        //Panggil method didalam objek sepeda
        kcg1.setMerek("Mata");
        kcg1.tambahKecepatan(10);
        kcg1.gantiGear(2);
        kcg1.cetakStatus();

        kcg2.setMerek("Kaki Depan");
        kcg2.tambahKecepatan(10);
        kcg2.gantiGear(2);
        kcg2.tambahKecepatan(10);
        kcg2.gantiGear(3);
        kcg2.cetakStatus();
        
        kcg3.setMerek("Kaki Belakang");
        kcg3.tambahKecepatan(5);
        kcg3.gantiGear(7);
        kcg3.setTipeSuspensi("Cara Berlari");
        kcg3.cetakStatus();
    }
    
}
