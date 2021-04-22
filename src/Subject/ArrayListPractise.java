package Subject;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractise {
    public static void main(String[] args) {
        ArrayList<String> listOfCity= new ArrayList<>();
        System.out.println(listOfCity.size());
        listOfCity.add("NY");
        listOfCity.add("PA");
        listOfCity.add("VA");
        listOfCity.remove("VA");
        System.out.println(listOfCity.size());
        System.out.println(listOfCity);
        for(int i=0;i<listOfCity.size();i++){
            System.out.println(listOfCity.get(i));
        }
        listOfCity.add("LA");
        listOfCity.add("NJ");
        listOfCity.add("TX");

        Iterator iterator=listOfCity.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ArrayList <Integer>zipCode=new ArrayList<>();
        zipCode.add(19566);
        zipCode.add(19852);
        zipCode.add(19215);
        for(int i=0;i<zipCode.size();i++){
            System.out.println(zipCode.get(i));
        }

        Iterator iterator1=zipCode.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
