package Ex_May26_Loops;

import java.util.Scanner;

public class If_L8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter Num1");
        int num1 =sc.nextInt();

        System.out.println("enter num2");
        int num2 = sc.nextInt();

        if (num1>num2)
        {
            System.out.println(num1 + " is greater number");
        }
        else if (num2>num1){
            System.out.println(num2 + " is greater number");
        } else
        {
            System.out.println(" both are equal number");
        }
    }
}
