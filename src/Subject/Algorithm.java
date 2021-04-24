package Subject;

import java.util.HashMap;

public class Algorithm {
    //hamza
    public static void main(String[] args) {
        String data= "Java is programming language Java is citi in Indonesia";
        String []splitedData= data.split(" ");
        HashMap<String,Integer> occurences=new HashMap<>();
        for(int i=0;i< splitedData.length;i++){
            Integer previousCount=occurences.get(splitedData[i]);
            if(previousCount==null){
                previousCount=0;
            }
            occurences.put(splitedData[i],previousCount+1);
        }
        System.out.println(occurences);

    }
}
