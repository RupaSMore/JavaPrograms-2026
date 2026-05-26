package Ex_May26;

public class test4 {
    public static void main(String[] args) {
        int a = 87;
        int b = 99;

        String s1= "KK";
        String s2= "VV";
        System.out.println(s1+s2+a+b);  // o/p: kkvv8799
        System.out.println(s1+s2+(a+b)); // cause of brackets it will follow BODMAS rule


    }
}
