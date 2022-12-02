package TPMODUL2_ABIYOGA;

public class Handphone extends Perangkat{
    protected boolean fingerprint;

    // Constructor
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    // Overriding method informasi dari class Perangkat
    @Override
    public void informasi(){
        if (fingerprint == true){
            System.out.println("\nHandphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu Handphone ini juga memiliki fingerprint");
        }else{
            System.out.println("\nHandphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz. Selain itu Handphone ini TIDAK memiliki fingerprint");
        }
    }

    // Method void telfon
    public void telfon (int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No "+no_hp);
    }

    // Overloading Method kirimSMS
    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No "+ no_hp);
    }
    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No "+ no_hp1+" dan ke No "+no_hp2);
    }
}
