package MODUL1;

import java.util.*;

public class Server {
    public static void main(String[] args){
        Database.Insert_Menu("Bakso", "Makanan", 10000);
        Database.Insert_Menu("Es Teh", "Minuman", 5000);
        Database.Insert_Menu("Brownies", "Minuman", 5000);

        User.input();
        while(true){
            System.out.println("1. Menu");
            System.out.println("2. Pilih Menu");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan: ");
            Scanner scan = new Scanner(System.in);
            int pilihan = scan.nextInt();
            scan.close();
            if (pilihan == 1){
                Database.Show_Menu();
            }else if (pilihan == 2){
                Database.Search_Menu();
            }else if (pilihan == 3){
                System.out.println("Terimakasih");
                break;
                
            }

        }
    }
}
