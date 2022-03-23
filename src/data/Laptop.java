package data;
import java.util.Scanner;
/**
 *
 * @author Ahzka
 */
public class Laptop {
    private String nama, brand, nama_processor, so, jenis;
    private int jumlah_core, ram, stok;
   
    
    public Laptop(String nama, String brand, String nama_processor, String so, String jenis,
            int jumlah_core, int ram, int stok){
        this.nama = nama;
        this.brand = brand;
        this.nama_processor = nama_processor;
        this.so = so;
        this.jenis = jenis;
        this.jumlah_core = jumlah_core;
        this.ram = ram;
        this.stok = stok;
    }
    
//    OVERLOADING
    public Laptop(){
        this.nama = "none";
        this.brand = "none";
        this.nama_processor = "none";
        this.so = "none";
        this.jenis = "none";
        this.jumlah_core = 0;
        this.ram = 0;
        this.stok = 0;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String text){
        nama = text;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String text){
        brand = text;
    }
    
    public String getNamaProcessor(){
        return nama_processor;
    }
    
    public void setNamaProcessor(String text){
        nama_processor = text;
    }
    
    public String getSo(){
        return so;
    }
    
    public void setSo(String text){
        so = text;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setJenis(String text){
        jenis = text;
    }
 
    public int getJumlahCore(){
        return jumlah_core;
    }
    
    public void setJumlahCore(int angka){
        jumlah_core = angka;
    }
   
    public int getRam(){
        return ram;
    }
    
    public void setRam(int angka){
        ram = angka;
    }
    
    public int getStok(){
        return stok;
    }
    
    public void setStok(int angka){
        stok = angka;
    }
    
    public void dataLaptop(){
        System.out.println("Nama            : " + nama);
        System.out.println("Brand           : " + brand);
        System.out.println("Nama Processor  : " + nama_processor);
        System.out.println("Sistem Operasi  : " + so); 
        System.out.println("Jenis Storage   : " + jenis);
        System.out.println("Jumlah Core     : " + jumlah_core);
        System.out.println("RAM             : " + ram);
        System.out.println("Jumlah Stok     : " + stok);
    }
    
}
    

