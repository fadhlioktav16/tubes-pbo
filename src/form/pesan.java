/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author Asus
 */
public class pesan {
    private static String kode, nama, id;
    private static int  harga, jumlah, total;
    
    public static String getKode(){
        return kode;
    }
    
    public static void setKode(String kode){
        pesan.kode = kode;
    }
    
    public static String getNama(){
        return nama;
    }
    
    public static void setNama(String nama){
        pesan.nama = nama;
    }
    
    public static String getId(){
        return id;
    }
    
    public static void setId(String id){
        pesan.id = id;
    }
    
    public static int getHarga(){
        return harga;
    }
    
    public static void setHarga(int harga){
        pesan.harga = harga;
    }
    
    public static int getJumlah(){
        return jumlah;
    }
    
    public static void setJumlah(int jumlah){
        pesan.jumlah = jumlah;
    }
    
    public static int getTotal(){
        return total;
    }
    
    public static void setTotal(int total){
        pesan.total = total;
    }
    
    
}
