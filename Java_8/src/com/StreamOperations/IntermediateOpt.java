package com.StreamOperations;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOpt {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sambit", "Anil", "Rakesh", "Sunil", "Ansh", "Pritam");

//!     1.filter
        Stream<String> filtered = list.stream().filter(x -> x.startsWith("A"));
        List<String> l = filtered.toList();
        System.out.println(l);// [Anil, Ansh]

//!     2.map
        Stream<String> uppercased = list.stream().map(String::toUpperCase);
        List<String> l1 = uppercased.toList();
        System.out.println(l1);// [SAMBIT, ANIL, RAKESH, SUNIL, ANSH, PRITAM]

//!     3.sorted
        Stream<String> sorted = list.stream().sorted();
        List<String> l2 = sorted.toList();
        System.out.println(l2); // [Anil, Ansh, Pritam, Rakesh, Sambit, Sunil]

        Stream<String> sortedStr = list.stream().sorted((a, b) -> a.length() - b.length());
        List<String> l3 = sortedStr.toList();
        System.out.println(l3);// [Anil, Ansh, Sunil, Sambit, Rakesh, Pritam]

//!     4.distinct
        List<Integer> list1 = Arrays.asList(1, 8, 1, 7, 1, 7, 9);
        List<Integer> distinct = list1.stream().distinct().toList();
        System.out.println(distinct);// [1, 8, 7, 9]

//!     5.limit
        List<Integer> l4 = Stream.iterate(1, x -> x + 2).limit(5).toList();
        System.out.println(l4);// [1, 3, 5, 7, 9]

//!     6.skip
        List<Integer> l5 = Stream.iterate(1, i -> i + 1).skip(5).limit(5).toList();// [6, 7, 8, 9, 10]
        System.out.println(l5);

//      7.peek()
        Stream.iterate(1,x-> x+1).skip(10).limit(5).peek(p->System.out.print(p+" ")).count();
//	  11 12 13 14 15 

//      8.flatMap()
        // Ex-1
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("Apple", "Banana"),
                Arrays.asList("Orange", "Kiwi"),
                Arrays.asList("Pear", "Grape"));
        System.out.println(listOfList.get(1).get(1));// Kiwi
        System.out.println(listOfList.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());
        // [APPLE, BANANA, ORANGE, KIWI, PEAR, GRAPE]
        // Ex-2
        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java streams are powerful",
                "flatMap is useful"
                );
        System.out.println(sentences
                .stream()
                .flatMap(sent->Arrays.stream(sent.split(" ")))
                .map(String::toUpperCase)
                .toList());
        //[HELLO, WORLD, JAVA, STREAMS, ARE, POWERFUL, FLATMAP, IS, USEFUL]


    }
}
