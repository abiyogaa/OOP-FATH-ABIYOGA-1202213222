package TPMODUL3_ABIYOGA;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        int Id, jmlhFood;
        Scanner scan = new Scanner(System.in);
        Restaurant resto = new Restaurant();
        try {
            System.out.print("Enter Customer ID: ");
            Id = scan.nextInt();
            
            System.out.print("Enter how much food to made: ");
            jmlhFood = scan.nextInt();
            scan.close();
            
            Thread thrd1 = new Thread(resto);
            Waiters waiters = new Waiters(Id,jmlhFood);
            Thread thrd2 = new Thread(waiters);
    
            thrd1.start();
            thrd2.start();
            thrd1.join();
            thrd2.join();
    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program Selesai");
        }
    }
}
