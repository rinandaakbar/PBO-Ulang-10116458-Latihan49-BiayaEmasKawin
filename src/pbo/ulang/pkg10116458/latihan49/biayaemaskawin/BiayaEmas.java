/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan49.biayaemaskawin;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class BiayaEmas {
    private double emasKawin;
    private double hargaSatuGram;

    public double getEmasKawin() {
        return emasKawin;
    }

    public void setEmasKawin(double emasKawin) {
        this.emasKawin = emasKawin;
    }

    public double getHargaSatuGram() {
        return hargaSatuGram;
    }

    public void setHargaSatuGram(double hargaSatuGram) {
        this.hargaSatuGram = hargaSatuGram;
    }
    
    public double hitungTotalPembayaran(double emas, double harga) {
        return emas * harga;
    }
    
}
