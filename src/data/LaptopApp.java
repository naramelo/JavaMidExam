package data;
import java.util.Scanner;

public class LaptopApp {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama = "", brand = "", nama_processor = "", so = "" , jenis = "";
        int jumlah_core = 0, ram = 0, stok = 0;
        Laptop jual = new Laptop(nama, brand, nama_processor, so, jenis, jumlah_core, ram, stok);
        
        System.out.println("====Input Data Pembelian====");
        System.out.print("Nama            : "); // Input Nama
        nama = input.nextLine();  
        System.out.print("Brand           : "); // Input Brand
        brand = input.nextLine();
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
        
        
        System.out.println("\n====Output Data Pembelian====");
        System.out.println("Nama            : " + nama); // Ouput nama
        System.out.println("Brand           : " + brand); //Output brand
        System.out.println("Nama Processor  : " + nama_processor); //Outpur processor
        System.out.println("Sistem Operasi  : " + so); // Output SO
        System.out.println("Jenis Storage   : " + jenis); //Output storage
        System.out.println("Jumlah Core     : " + jumlah_core); //Output core
        System.out.println("RAM             : " + ram); //Output ram
        System.out.println("Jumlah Stok     : " + stok); //Outpur stok
        
        input.close();
        jual.dataLaptop();
}
}

