import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList number=new ArrayList();
        number.add(10);
        number.add(3);
        number.add("Ahmet");
        System.out.println(number.size());
        System.out.println(number.get(2));
        number.set(0,444);
        System.out.println(number.get(0));
        number.remove(1);
        for (Object s:number){
            System.out.println(s);
        }
    }
}
