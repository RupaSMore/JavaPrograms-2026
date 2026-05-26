package Ex_May26_Loops;

import java.util.Scanner;

public class IV_Q4 {
    public static void main(String[] args) {
        // program to print name, age, salary
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Name");
        String name = sc.next();
        System.out.println("enter age");
        int age =sc.nextInt();
        System.out.println("enter salary");
        double salary = sc.nextDouble();

        System.out.println(" your name is " + name);
        System.out.println(" your age is " + age);
        System.out.println(" your salary is " + salary);
        sc.close();
    }
}
