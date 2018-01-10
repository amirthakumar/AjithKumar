package in.vamsoft.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SampleList {
  public static void main(String[] args) {

    Collection<String> c = new ArrayList<>();
    ArrayList<Integer> i = new ArrayList<>();
    i.add(10);
    i.add(20);
    for(int i1:i) {

    }
    System.out.println(i.get(0));
    int x = 10;
    Integer integer = x;
    System.out.println("Value of" + Integer.valueOf(integer));

    List<String> l = new ArrayList<>();
    Iterator<String> i2 = l.iterator();
    while (i2.hasNext()) {
      System.out.println(i2.next());
    }
    ListIterator<String> l3 = l.listIterator();
    ArrayList<Integer> as = new ArrayList<>();
    as.add(21);
    as.add(22);
    as.add(23);
    Integer i4[] = (Integer[]) as.toArray(new Integer[as.size()]);
    List<String> ll = new LinkedList<>();
    ll.add("Ajith");
    System.out.println(ll);
    System.out.println(ll.subList(0, 1));
    
  }

}
