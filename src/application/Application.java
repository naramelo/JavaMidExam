package application;
import java.util.Scanner;
import data.*;


public class Application {
    public static void main(String[] args) {
        String nama, nama_processor, so, jenis;
        int stok, jumlah_core, ram;
        
        Scanner input = new Scanner (System.in);
        Axioo axioo1 = new Axioo();
        Dell dell1 = new Dell();
        
        axioo1.beliAxioo();
        
        System.out.println("*Input Data Pembelian*");
        System.out.print("Nama            : "); // Input Nama
        nama = input.nextLine();
        System.out.print("Nama Processor  : "); // Input Processor
        nama_processor = input.nextLine();
        System.out.print("Sistem Operasi  : "); // Input SO
        so = input.nextLine();
        System.out.print("Jenis Storage   : "); // Input Storage
        jenis = input.nextLine();
        System.out.print("Jumlah Core     : "); // Input core
        jumlah_core =  input.nextInt();
        System.out.print("RAM             : "); // Input RAM
        ram = input.nextInt();
        System.out.print("Jumlah Stok     : "); // Input stok
        stok = input.nextInt();
        axioo1.setNama(nama);
        axioo1.setNamaProcessor(nama_processor);
        axioo1.setSo(so);
        axioo1.setJenis(jenis);
        axioo1.setJumlahCore(jumlah_core);
        axioo1.setRam(ram);
        axioo1.setStok(stok);
        axioo1.dataLaptop();
        
        System.out.println("Storefront position " + axioo1.getNama() + " adalah " + axioo1.etalaseToko());
        System.out.println("--------------------------------------------------------------------------\n");
        
       
        
        dell1.beliDell();
        System.out.print("Nama            : "); // Input Nama
        nama = input.nextLine();
        System.out.print("Nama Processor  : "); // Input Processor
        nama_processor = input.nextLine();
        System.out.print("Sistem Operasi  : "); // Input SO
        so = input.nextLine();
        System.out.print("Jenis Storage   : "); // Input Storage
        jenis = input.nextLine();
        System.out.print("Jumlah Core     : "); // Input core
        jumlah_core =  input.nextInt();
        System.out.print("RAM             : "); // Input RAM
        ram = input.nextInt();
        System.out.print("Jumlah Stok     : "); // Input stok
        stok = input.nextInt();
        dell1.setNama(nama);
        dell1.setNamaProcessor(nama_processor);
        dell1.setSo(so);
        dell1.setJenis(jenis);
        dell1.setJumlahCore(jumlah_core);
        dell1.setRam(ram);
        dell1.setStok(stok);
        dell1.dataLaptop();
        
        System.out.println("Storefront position " + dell1.getNama() + " adalah " + dell1.etalaseToko());
        System.out.println("");
    
    }
    
}
