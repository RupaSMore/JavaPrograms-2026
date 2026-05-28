package Ex_May26_Loops;

public class For_eg6 {
    public static void main(String[] args) {

        final boolean b1=true;

        for (int i=0; b1; i++)
        {
            System.out.println("hello");   // it will go into infinite loop as boolean always be true
        }
    }
}
