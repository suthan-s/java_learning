package java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
                list.add(i);
        }
        System.out.println(list);
// here using normal logic for getting even no from list
        List<Integer> l1 = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                l1.add(i);
            }
        }
        System.out.println(l1);

        // now we implement using stream for getting even no
        List<Integer> l2 = list.stream().filter(i->(i%2==0)).collect(Collectors.toList());
        System.out.println(l2); //"filter" method using filtering the value based on the condition. "collect" using this collect the even values. using "collectors.toList" list the values.


        long a= l1.stream().filter(i->(i%2==0)).count();
        System.out.println(a);

        List<Integer> b= list.stream().sorted().collect(Collectors.toList()); // using sorted() we can get the all values.
        System.out.println(b);

        Comparator<Integer> c= (i1, i2) -> i1-i2;  //"i1-i2" we can get the values ascending order
        System.out.println(c);
        List<Integer> d= list.stream().sorted(c).collect(Collectors.toList());
        System.out.println(d);
        Comparator<Integer> e= (i1, i2) -> i2-i1;  //"i2-i1" we can get the values descending order
        List<Integer> f= list.stream().sorted(e).collect(Collectors.toList());
        System.out.println(f);

        Integer g= list.stream().max(c).get(); // getting max value
        System.out.println(g);
        Integer h= list.stream().min(c).get(); // get min value
        System.out.println(h);

        list.stream().forEach(i -> System.out.println(i));  // using forEach getting all values





    }
}
