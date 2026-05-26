package Ex_May26;

public class Str_test6 {
    public static void main(String[] args) {

        String password = "Pramod@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);
        System.out.println(password == pass_u);
        System.out.println(password.equals(pass_u));
        System.out.println(password.equalsIgnoreCase(pass_u));  // ignores the case anf match content
    }
}
