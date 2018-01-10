package in.vamsoft.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {
  public static void main(String[] args) {
    
    
  List<Integer> list=new ArrayList<>();
  list.add(12);
  list.add(13);
  list.add(7);
  list.add(2);
  Collections.sort(list);
  System.out.println(Collections.binarySearch(list, 13));
  System.out.println(Collections.emptyList());
  //Collections.checkedList(list, type)
  Map<Integer, String> m=new HashMap<>();
  System.out.println(m.put(1, "Ajith"));
  m.put(2, "Kumar");
  System.out.println(m.get(1));
  System.out.println(m);
  if(!m.containsKey(1))
  {
    m.put(1, "Luv");
  }
  else
  {
    m.put(2, "Aji");
    m.put(3, "Hi");
  }
  System.out.println(m);
  }
  Map.Entry<Integer, String> mp=m.

}
