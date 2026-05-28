package Ex_May26_Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number, will print the factorial of it");
        int n = sc.nextInt();

        int fact =1;

        for (int i=1; i<=n; i++)
        {
            fact =fact * i;
        }

        System.out.println(fact);
        sc.close();
    }
}
