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
public class Persegi extends BangunDatar{
    int sisi;
    
    @Override
    public void Luas(){
        luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }
}
