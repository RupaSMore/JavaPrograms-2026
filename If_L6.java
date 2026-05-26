package Ex_May26_Loops;

import java.util.Scanner;

public class If_L6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int user_input =sc.nextInt();

        if(user_input%2==0)
        {
            System.out.println("even");
        } else
        {
            System.out.println("odd");
        }
    }
}
