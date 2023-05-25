import java.util.function.Function;

public class SquareOfANumber {
    public static void main (String args[])
    {
        Function<Integer,Integer> square=i->i*i;
        System.out.println("square of a 4 is:"+square.apply(4));
    }
}
