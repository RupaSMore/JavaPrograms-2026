package Ex_May26;

public class Str_test5 {
    public static void main(String[] args) {
        String s1 = "Pramod";
        char c = s1.charAt(5);
        System.out.println(s1);
        System.out.println(c);

        //s1.concat("dutta");  // value not stored in any variable
        s1=s1.concat("dutta");// value stored in s1 now.
        System.out.println(s1);

    }
}
