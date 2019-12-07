/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classjavaapi;

import java.util.ArrayList;

/**
 *
 * @author Agata
 */
public class ClassInputData {
    ArrayList<ClassMahasiswa> ListMahasiswa;
    
    public ClassInputData(){
        ListMahasiswa = new ArrayList();
    }
    
    public void isiData(String nim, String nama, String alamat){
        ClassMahasiswa mhs = new ClassMahasiswa(nim, nama, alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<ClassMahasiswa> getData(){
        return ListMahasiswa;
    }
}
