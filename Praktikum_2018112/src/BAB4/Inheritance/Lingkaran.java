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
public class Lingkaran extends BangunDatar{
    double r;
    
    @Override
    public void Luas(){
        luas = (3.14 * r * r);
        System.out.println("Luas lingkaran: " + luas);
    }
}
