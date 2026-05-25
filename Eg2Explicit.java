package Ex_May26;

public class Eg2Explicit {
    public static void main(String[] args) {
        int course = 200;
        float GST =18.45f;

       // int total = course + GST;  // implicit narrowing not possible
        int total = course + (int) GST;  // Explicit narrowing

        System.out.println(total);


        // there will be loss of .45 from gst amount
    }
}
