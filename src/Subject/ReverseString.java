package Subject;

public class ReverseString {
    public static void main(String[] args) {
        String data="Application";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(data);
        String dataReverse=stringBuilder.reverse().toString();
        System.out.println(dataReverse);
    }
}
