package MODUL2_ABIYOGA;

public class MainApp {
    public static void main(String[] args) {
        TransportasiAir TA = new TransportasiAir(4,20000);
        TA.informasi();
        TA.berlayar();
        TA.berlabuh();

        Sampan sampan = new Sampan(20,50000,2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);

        Kapal kapal = new Kapal(50,100000,"Diesel");
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);
        kapal.berlabuh();
    }
    
}
