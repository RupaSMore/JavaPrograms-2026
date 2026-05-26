package Ex_May26_Loops;

import java.util.Scanner;

public class IV_Q7 {
    public static void main(String[] args) {
        // program to find largest number betwwen 3 numbers

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter first number");
        int num1 =sc.nextInt();
        System.out.println("enter 2nd number");
        int num2= sc.nextInt();
        System.out.println("enter 3rd number");
        int num3= sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1 + "is the gretest number");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2 + " is the greatest number");
        }
        else if(num3 >num1 && num3>num2){
            System.out.println(num3 + "is the greatest numner");
        }else {
            System.out.println(" equal numbers");
        }
    }
}
