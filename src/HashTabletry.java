import java.util.Hashtable;

public class HashTabletry {
    public static void main(String[] args) {
        Hashtable <Integer,String> Student=new Hashtable<>();
        Student.put(11,"Hamza");
        Student.put(12,"Steve");
        Student.put(13,"Mark");
        System.out.println(Student);
        //HashTable can't contain Null value instead of Hashmap
    }
}
