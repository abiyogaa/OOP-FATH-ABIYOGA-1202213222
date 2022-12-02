package TPMODUL2_ABIYOGA;

public class MainApp {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Seagate",8,2.40f,true);
        laptop.informasi();
        laptop.bukaGame("Dota 2");
        laptop.kirimEmail("abiyogadhaniswara@student.telkomuniversity.ac.id");
        laptop.kirimEmail("abiyogadhaniswara@student.telkomuniversity.ac.id", "abiyogadhaniswara1@gmail.com");

        Handphone hp = new Handphone("Sandisk",3,2.20f,false);
        hp.informasi();
        hp.telfon(621202213);
        hp.kirimSMS(621202213);
        hp.kirimSMS(621202213,628138550);
    }
}
