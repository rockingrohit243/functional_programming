interface Parent1{
   public void add(int a,int b);
}
public class AddByFi {
    public static void main(String[] args) {
        Parent1 parent1=(a,b)-> System.out.println("the sum of"+a+" and "+b+" is:"+(a+b));
        parent1.add(5,4);
        parent1.add(9,7);
        parent1.add(7878,56985);

    }

}
