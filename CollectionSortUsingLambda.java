import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSortUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        arrayList.add(45);
        arrayList.add(12);
        arrayList.add(56);
        arrayList.add(7);
        arrayList.add(78);
        arrayList.add(8);
        System.out.println("before sorting"+arrayList);
        Comparator<Integer> comparator=(a,b)->(a<b)?-1:(a>b)?+1:0;
        Collections.sort(arrayList,comparator);
        System.out.println("After sorting:"+ arrayList);

    }

}
