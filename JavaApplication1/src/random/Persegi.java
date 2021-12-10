/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author user11
 */
public class Persegi implements BangunDatar1{
    @Override
    public void Judul() {
        System.out.println("Menghitung Luas dan Keliling Persegi");
    }
    int s;
    double luas, kell;
    @Override
    public double luas() {
        luas = s * s;
        return luas;
    }
    @Override
    public double keliling() {
        kell = 4 * s;
        return kell;
    }
}
