package MODUL3_ABIYOGA;

import java.util.*;
import java.io.*;

public class Main {
    public static boolean repeat = true;
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in); Kalo pake scanner ngerepeat terus
        Console input = System.console();
        Calculation calc = new Calculation();
        Thread t1 = new Thread(calc);
        do {
            try{
                System.out.println("\n==Menu Program==");
                System.out.println("1. Square\n2. Circle\n3. Trapezoid");
                System.out.print("Select menu: ");
                int selectMenu = Integer.parseInt(input.readLine());

                switch (selectMenu) {
                    case 1:
                        System.out.print("Enter the length of the side of the square: ");
                        //double side = input.nextDouble();
                        double side = Double.parseDouble(input.readLine());
                        t1.start();
                        calc.setSquare(side);
                        t1.join();
                        System.out.println("\nThe calculation result: "+calc.getSquare());
                        repeat = false;
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle: ");
                        //double radius = input.nextDouble(); 
                        double radius = Double.parseDouble(input.readLine()); 
                        t1.start();
                        calc.setCircle(radius);
                        t1.join();
                        System.out.println("\nThe calculation result: "+calc.getCircle());
                        repeat = false;
                        break;
                    case 3:
                        System.out.print("Enter the side of the base of the trapezoid: ");
                        //double base = input.nextDouble();
                        double base = Double.parseDouble(input.readLine());
                        System.out.print("Enter the upper side of the trapezoid: ");
                        //double upper = input.nextDouble();
                        double upper = Double.parseDouble(input.readLine());
                        System.out.print("Enter the height of the trapezoid: ");
                        //double height = input.nextDouble();
                        double height = Double.parseDouble(input.readLine());
                        t1.start();
                        calc.setTrapezoid(base, upper, height);
                        t1.join();
                        System.out.println("\nThe calculation result: "+calc.getTrapezoid());
                        repeat = false;
                        break;
                    case 0:
                        System.out.println("Terimakasih sudah menggunakan program kami!");
                        repeat = false;
                        break;
                    default:
                        System.out.println("Option not available");
                        continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("====Error: Input must be a number====");    
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        } while (repeat);
    }
}
