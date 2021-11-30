/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB3.Enkapsulasi;

/**
 *
 * @author user11
 */
public class HitungBalok {
    private int panjang;
    public int lebar,tinggi;
    int volume;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
    int volumeBalok(){
        volume = getPanjang() * lebar * tinggi;
        return volume; 
    }
}
