import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class CollectionSort1 implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return -1;
        else if (o1 > o2)
            return +1;
        else
            return 0;
    }

}
public class CollectionSortWithoutLambda {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(12);
        arrayList.add(56);
        arrayList.add(7);
        arrayList.add(78);
        arrayList.add(8);
        Collections.sort(arrayList,new CollectionSort1());
        System.out.println(arrayList);

    }
}
