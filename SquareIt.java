interface Square{
    public int squareIt(int a);
}
public class SquareIt {
    public static void main(String[] args) {
        Square square = a -> a * a;
        System.out.println("square of the number is:"+square.squareIt(5));
    }


}
