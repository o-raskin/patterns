package behavioral.iterator;

import java.util.*;

public class Application {

    /*
     *  Iterator
     *
     *  Allows iterate through collection without information about collection's structure/implementation.
     *
     *  Example: all implementations of java.util.Iterator, java.util.ListIterator, java.util.Enumeration
     */
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "b", "c");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator<String> listIterator = strings.listIterator();
        while (listIterator.hasNext()){
            System.out.println("Index " + listIterator.nextIndex() + ": " + listIterator.next());
        }
        while (listIterator.hasPrevious()){
            System.out.println("Index " + listIterator.previousIndex() + ": " + listIterator.previous());
        }

        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("a","a");
        hashtable.put("b","b");
        hashtable.put("c","c");

        Enumeration<String> enumeration = hashtable.keys();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
