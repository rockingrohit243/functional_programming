@FunctionalInterface
interface  Interface1{
    void m1();
}
public class CallingLeByFI {
    public static void main(String[] args) {
        Interface1 interface1;
        interface1 = () ->System.out.println("hello by lambda expression ");
interface1.m1();
    }
}
