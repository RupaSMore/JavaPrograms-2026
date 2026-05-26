package Ex_May26_Loops;

public class SwitchWithMultiCondiiArrow {
    public static void main(String[] args) {
        int itemcode= 003;
        switch (itemcode){
            case 001 ->
                System.out.println("laptop");
            case 002 ->
                System.out.println("Desktop");
                case 003, 004->
                    System.out.println("mobile");
            default->
                System.out.println("Hello");

        }
    }
}
