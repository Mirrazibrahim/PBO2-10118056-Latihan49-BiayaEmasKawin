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
public class PBO210118056Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas emas=new Emas();
        emas.setBeratEmas((float) 15.7);
        emas.setHargaEmas(570000);
        System.out.println("====Program Menghitung Harga Emas=====");
        System.out.println("Harga Emas 1 gram : Rp."+emas.getHargaEmas());
        System.out.println("Berat emas yang ingin : "+emas.getBeratEmas()+"gram");
        System.out.println("");
        System.out.println("Total yang harus dibayar : Rp."+emas.totalHarga());
    }
    
}
