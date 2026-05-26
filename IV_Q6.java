package Ex_May26_Loops;

import java.util.Scanner;

public class IV_Q6 {
    public static void main(String[] args) {
        // program to find number is possitive, negative or zero

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        if (num>0){
            System.out.println("it is positive number");
        } else if (num <0){
            System.out.println("it is negative number");
        }else {
            System.out.println("it is zero");
        }
    }
}
