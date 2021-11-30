/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoLaptop;

/**
 *
 * @author user11
 */
public abstract class Laptop {
    public String namaLaptop,merk,tahun;
    public int harga,diskon;
    protected String stok;
    
    public abstract String stokKosong();

    public String getStok() {
        return "Tersedia " + this.stok + " laptop";
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
}


