package Ex_May26_Loops;

import java.util.Scanner;

public class GradeCalculator_withFaiilCond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter student score");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println(" grade is A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("grade is B ");
        } else if (score >= 70 && score <= 79)
    {
        System.out.println("grade is C ");
    } else if (score >=60 && score<=69) {
            System.out.println("grade is D");
        }
        else if(score>=0 && score <=59){
            System.out.println("fail");
        }

    }
}
