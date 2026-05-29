package Ex_May26_others;

import javax.sound.midi.Soundbank;

public class Functions_f7_withParameters {
    public static void main(String[] args) {


        function_typ3("amit");

        System.out.println("--------------------");
        int sum_result = function_type4(4,5);
        System.out.println("output -> " +sum_result);


    }

    static void function_typ3(String name) {

        System.out.println("with parameters and without return type");
        System.out.println(name);
    }

    static int function_type4(int a, int b) {
        System.out.println("with parameters and with return type");
        return a+b;
    }

}
