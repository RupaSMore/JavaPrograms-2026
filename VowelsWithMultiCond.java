package Ex_May26_Loops;

import java.util.Scanner;

public class VowelsWithMultiCond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a','e','i','o','u':
                System.out.println(" vowel");
            default:
                System.out.println("consonant");
        }
    }
}
