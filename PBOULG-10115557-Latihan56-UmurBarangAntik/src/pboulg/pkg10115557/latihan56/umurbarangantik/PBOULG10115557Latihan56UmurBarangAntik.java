/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan56.umurbarangantik;

/**
 *
 * @author RyanJuan
 * NAMA                 : Rayan
 * KELAS                : PBOULG
 * NIM                  : 10115557
 * Deskripsi Program    : Program Menampilkan menghitung umur
 * barang antik
 */
public class PBOULG10115557Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama barang antik ini : " + r.getName());
        r.tampilUmur();
    }
    
}
