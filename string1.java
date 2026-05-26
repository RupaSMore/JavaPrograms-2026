package Ex_May26;

import java.util.Locale;

public class string1 {
    public static void main(String[] args) {
        String name = "Rupali";
        String name2 = new String("More");
        System.out.println(name);
        System.out.println(name2);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));
     //   System.out.println(name.charAt(10));  throw exception : index out of bound as index is bigger we provided


    }
}
