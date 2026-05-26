package Ex_May26_Loops;

import java.util.Scanner;

public class VerifyVowel_sw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char, I will tell you if it is a vowel or not");
        char input = sc.next().charAt(0);
        System.out.println(input);

        switch (input){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not vowel, it is a consonant");
                break;
        }
    }
}
