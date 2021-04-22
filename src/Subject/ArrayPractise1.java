package Subject;

public class ArrayPractise1 {
    public static void main(String[] args) {
        String [] name={"John","Hamza","David","Mark","Eric"};
//        System.out.println(name[0]);
//        System.out.println(name[1]);
        for(int i=0;i< name.length;i++){
            System.out.println(name[i]);


        }
        try{
            System.out.println(name[5]);
        }
        catch (Exception e){
            System.out.println("Try to fix your index");
            e.printStackTrace();

        }
        String []cars= new String[5];
        cars[0]="BMW";
        cars[1]="TOYOTA";
        cars[2]="MERCEDES";
        cars[3]="LEXUS";
        cars[4]="HONDA";
        System.out.println(cars.length);
        System.out.println(cars[4]);
       String []myCars= cars.clone();
        System.out.println(myCars.length);

    }
}
