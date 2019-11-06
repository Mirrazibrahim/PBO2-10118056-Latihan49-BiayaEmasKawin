/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan49.biayaemaskawin;

/**
 *
 * @author 
 *  Nama : Mirraz Ibrahim
 * Nim : 10118056
 * Kelas: IF-2
 */
public class Emas {
    private float beratEmas;
    private int hargaEmas;

    public float getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(float beratEmas) {
        this.beratEmas = beratEmas;
    }

    public int getHargaEmas() {
        return hargaEmas;
    }

    public void setHargaEmas(int hargaEmas) {
        this.hargaEmas = hargaEmas;
    }
    
    public int totalHarga(){
        return (int) (hargaEmas*beratEmas);
    }
}
