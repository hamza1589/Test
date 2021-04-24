package Subject;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "ARMY";
        String b = "MARY";
        getAnagram(a, b);


    }

    public static void getAnagram(String a, String b) {
        char[] firstArray = a.toCharArray();
        char[] secondArray = b.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        boolean anagram = Arrays.equals(firstArray, secondArray);
        if (anagram) {
            System.out.println("Values are anagram");
        } else {
            System.out.println("Values aren't anagram");
        }
    }

}

