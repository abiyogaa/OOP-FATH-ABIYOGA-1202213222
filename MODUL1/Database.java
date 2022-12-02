package MODUL1;

import java.util.*;

public class Database {
    static ArrayList<String> List_Menu= new ArrayList<String>();
    public static void Insert_Menu(String Name, String Category, int Price) {
        List_Menu.add(Name);
        List_Menu.add(Category);
        List_Menu.add(Integer.toString(Price));
    }

    public static void Show_Menu() {
        System.out.println("===============");
        for (int i =0; i<List_Menu.size(); i+=3){
            System.out.println((i+1)+". "+List_Menu.get(i)+" ("+List_Menu.get(i+1)+") "+"Rp. "+List_Menu.get(i+2));
        }
        System.out.println("===============");
        
    }
    public static void Search_Menu() {
        Scanner scan = new Scanner(System.in);
        String cari = scan.nextLine();
        if (List_Menu.contains(cari)){
            
        }
        
    }
}
