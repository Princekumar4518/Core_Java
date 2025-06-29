package Collecton_Framework._List;


import java.util.ArrayList;
import java.util.List;

public class BasicOfList {
    public static void main(String[] args) {

        //### Problem with Arrays
        //1. Size -> Fixed size problem
        //2. array can store **one type of data type. **
        //3. `// There are not in built functions available in the arrays.`
        //    1. `//  sorting, updating, delete, increasing size, decrease size.`


        //JDK 1.2 - 1997
        //`Legacy Classes (old)`
        //
        //1.  // Vector - functions
        //2.  // Stack
        //3.  // Properties
        //4.  // Hash table
        //5.  // Dictionary




        // - **Pre-made** Collection Classes, Interfaces,... -> templates -> sorting(),
        // reverse()., fifo, lifo...unique..



        //The **main purpose of learning the collection framework **is that it provides us pre-made classes
        // and interfaces which can help us to store elements normally, store elements in a sorted order,
        // store elements in a first come, first serve order, store elements by removing duplicates.
        // You can sort it, update it, delete it, whatever you want to do,
        // however you want to store it, everything will be provided by Collection Framework.



        // Collection (I) -> GGF -> LIST, SET, QUEUE (F) (I)
        //
        //1.  LIST -> store duplicates items -> I want to keep the duplicates. -> Balaji, Ramal, Snehal, Ramal.
        //2. SET -> can't store duplicate items ->. Remove the Duplicates.  -> 98765432, 98765 ,97878990
        //3. QUEUE -> FIFO format ( non duplicates,) -> airplane ticket ->



        // List
        //
        //1.  **Collection of items -> ** shoppoing_list ->  shoes, top, nail polish, lipstick ...
        //2. Documentation - [﻿docs.oracle.com/javase/6/docs/api/java/util/List.html](https://docs.oracle.com/javase/6/docs/api/java/util/List.html)
        //3. An ordered collection (also known as a _sequence_) or whatever order user has entered.
        //4. The user of this interface has precise control over where in the list each element is inserted.
        //5. The user can access elements by their** integer index  (0)**
        //6. search for elements in the list.
        //7. lists typically allow duplicate elements.
        //- lists typically allow pairs of elements e1 and e2 such that e1.equals(e2).
        //- allow multiple null elements if they allow null elements at all.
        //- e.g -> 2 Kachori, 4 paranths, 4 Teas.
        //- e.g -> Fruits - Oragne, Apple, Gauva....
        //- Different type of data type also you can store -> 1, Pramod, true, hello, Gaurav, Apple, car, Tesla.
        //- List->. objects -> ref.


        //List -> Interface -> ArrayList (C)


        List fruits=List.of("Orange","mango","grapes","Litchi","pear","orange");
        System.out.println(fruits);

        List arrayList=new ArrayList<>();
        arrayList.add("Watermellon");
        arrayList.add("Mango");
        arrayList.add(fruits);
        arrayList.addFirst("Cherry");

        System.out.println(arrayList);
        System.out.println(arrayList.contains("mango"));
        System.out.println(arrayList.size());

    }
}
