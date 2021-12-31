/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

/**
 *
 * @author user11
 */
public class Transaksi implements Perhitungan{
    int jml,harga,bayar,total;
    @Override
    public int totalHarga(){
        return jml * harga;
    }
    
    @Override
    public int kembalian(){
        return bayar - total;
    }
}
