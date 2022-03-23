package data;
/**
 *
 * @author Ahzka
 */
public class Dell extends Laptop{
    public Dell(String nama, String nama_processor, String so, String jenis, int jumlah_core,
            int ram, int stok){
        super(nama, "Dell", nama_processor, so, jenis, jumlah_core, ram, stok);
    }
    
    public Dell(){
        super();
        super.setBrand("Dell");
    }
    
    public void beliDell(){
        System.out.println("=======================");
        System.out.println("Pembelian Laptop Dell");
        System.out.println("========================");
        System.out.println("*Input Data Pembelian*");
    }
    
    @Override
    public void dataLaptop(){
        beliDell();
        super.dataLaptop();
    }
    
    @Override
    public void setRam(int angka){
        if(angka < 0){
            System.out.println("Ukuran RAM salah");
            super.setRam(4);
        }else{
            super.setRam(angka);
        }
    }
    
    @Override
    public void setJumlahCore(int angka){
        if(angka < 0){
            System.out.println("Jumlah Core salah!");
            super.setJumlahCore(2);
        }else{
            super.setJumlahCore(angka);
        }
    }
    
    @Override
    public void setStok(int angka){
        if(angka < 0){
            System.out.println("Jumlah Stok Laptop salah!");
            super.setStok(0);
        }else{
            super.setStok(angka);
        }
    }
    
    public String etalaseToko(){
        String storage = super.getJenis().toLowerCase().replaceAll("\\s+","");
        switch(storage){
            case "ssdm.2" ->{
                return "Best";
            }
            case "ssdsata" ->{
                return "Good";
            }
            case "hdd" ->{
                return "Middle";
            }
            default ->{
                    return "none";
                    }
        }
    }
}
