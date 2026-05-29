package Ex_May26_others;

public class Functions_f6_withoutPara {
    public static void main(String[] args) {

        function_type1();
        //String f1=function_type1();   -- we can not do this as its a void function which returns nothing

        System.out.println("------------------------------------");
        //function_type2();
        String name = function_type2();
        System.out.println(name);
        System.out.println("------------------------------------");
    }

    static void function_type1() {
        System.out.println("without parameters and without return type");
    }

    static String function_type2() {
        System.out.println("without parameter but with return type");
        return "Rupali";
    }

}
