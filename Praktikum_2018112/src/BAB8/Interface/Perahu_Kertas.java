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
public class Perahu_Kertas implements buku,penerbit{
    @Override
    public void judul() {
        System.out.println("Perahu Kertas");
    }
    @Override
    public void tahun() {
        System.out.println("2015");
    }
    @Override
    public void pengarang() {
        System.out.println("Raditya Dika");
    }
    @Override
    public void nama_penerbit() {
        System.out.println("Gagas Media");
    }
    @Override
    public void kota() {
        System.out.println("Jakarta");
    }
}
