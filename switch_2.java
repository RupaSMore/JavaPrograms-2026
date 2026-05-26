package Ex_May26_Loops;

import java.util.Scanner;

public class switch_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day 1 to 7, I will tell you which day it is");
        int day = sc.nextInt();


        // without break statement all the code will get excuted from the number entered
        switch (day){
            case 1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(" No idea which day it is");
                break;
        }
        System.out.println("outside the loop");
    }
}
