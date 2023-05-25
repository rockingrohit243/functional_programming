import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        arrayList.stream().forEach(System.out::println);
        List<Integer> list=arrayList.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list);

    }

}
