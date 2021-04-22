package Subject;

import java.util.HashSet;
import java.util.Iterator;

public class HashSett {
    public static void main(String[] args) {
        HashSet <String> cities= new HashSet<>();
        cities.add("PA");
        cities.add("NY");
        cities.add("VA");
        cities.add("NY");
        System.out.println(cities);
        Iterator iterator=cities.iterator();

        //   while(iterator.hasNext()){
        //
        //            System.out.println(iterator.next());
         //**************************************************
        // if you want to store it in variable then you have to  converse it to String

        while(iterator.hasNext()){
            String x=iterator.next().toString();
            System.out.println(x);
        }

    }
}
