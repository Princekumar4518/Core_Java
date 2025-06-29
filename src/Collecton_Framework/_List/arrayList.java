package Collecton_Framework._List;

import java.util.*;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {


        // ## ArrayList(C)
        //- Class
        //- Arrays -> Underline Storage Mechanism is Arrays.
        //- Dynamic Size
        //    - 10 -> 9th -> create a new AL with 20 and copy there.
        //- Growable in nature.
        //- It is fast to access the elements, **but slow to insert and delete the elements. **
        //- ArrayList allows duplicates and it is **implemented as a resizable array.**
        //- ArrayList elements will be stored internally **using indexing notation.**
        //- This is one of the most widely **used concrete class.**

        List list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("prince");
        list.add(true);
        list.add(123);
        list.add(true);

//        System.out.println(list.size());  // 9
//        System.out.println(list.isEmpty()); // false
//        System.out.println(list.contains(123));  // true
//        System.out.println(list.indexOf(true));  // 6
//        System.out.println(list.lastIndexOf(true)); // 8
        list.remove(true); // remove which get first
        list.removeFirst();
        list.addFirst("kumarr");
        System.out.println(list);
//
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//
//        for(Object o:list){   // object is used because we use multiple type of data
//            System.out.println(o);
//        }
        System.out.println("***************************************");
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
