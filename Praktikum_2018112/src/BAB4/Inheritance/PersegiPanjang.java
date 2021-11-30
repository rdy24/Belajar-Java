/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Inheritance;

/**
 *
 * @author user11
 */
public class PersegiPanjang extends BangunDatar{
    int panjang,lebar;
    
    @Override
    public void Luas(){
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }
}
