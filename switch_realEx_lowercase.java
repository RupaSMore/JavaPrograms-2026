package Ex_May26_Loops;

import java.util.Scanner;

public class switch_realEx_lowercase {
    public static void main(String[] args) {
        // to select the browser

        Scanner sc = new Scanner(System.in);

        System.out.println(" select the browser on which code to be executed");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("execute code on chrome");
                break;
            case "firefox":
                System.out.println("execute code on firefox");
                break;
            case "edge":
                System.out.println("execute code on edge");
                break;
            default:
                System.out.println("no idea which browser is this");
                break;
        }
        System.out.println("out of switch loop");
    }
}
