package Subject;

import java.util.HashMap;

public class HashMalpractice {
    public static void main(String[] args) {
        HashMap<Integer,String> studentInformation= new HashMap<>();
        studentInformation.put(2,"Hamza");
        studentInformation.put(1,"Forex");
        System.out.println(studentInformation.get(2));
        System.out.println(studentInformation.get(1));
    }
}
