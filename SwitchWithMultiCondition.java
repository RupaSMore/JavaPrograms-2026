package Ex_May26_Loops;

public class SwitchWithMultiCondition {
    public static void main(String[] args) {
        int itemcode= 003;
        switch (itemcode){
            case 001, 002, 003:
                System.out.println("it is a electroninc gadget");
                break;
            case 004, 005, 007:
                System.out.println("it is a mechanical gadget");
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}
