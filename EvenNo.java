import java.util.function.Predicate;

public class EvenNo {
    public static void main(String[] args) {
        Predicate<Integer> even=i->i%2==0;
        System.out.println("4 is a even number:"+even.test(4));
        System.out.println("5 is a even number :"+even.test(5));

    }
}
