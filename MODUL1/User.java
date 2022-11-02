package MODUL1;

import java.util.*;

public class User {
    public static void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("No. Handphone: ");
        int no_hp = scan.nextInt();

        System.out.println("Register Succes");
        System.out.println("Name: "+ nama);
        System.out.println("Phone Number: "+ no_hp);
        System.out.println("===============");
        scan.close();
    }
}
