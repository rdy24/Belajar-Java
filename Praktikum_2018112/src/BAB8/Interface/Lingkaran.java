/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB8.Interface;

/**
 *
 * @author user11
 */
public class Lingkaran implements BangunDatar{
    int r;
    double luas,kell;
    @Override
    public double luas() {
        luas = phi * r * r;
        return luas;
    }
    @Override
    public double keliling() {
        kell = phi * 2 * r;
        return kell;
    }
}
