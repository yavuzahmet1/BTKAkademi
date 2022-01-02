import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<String>();
        country.add("Adana");
        country.add("Ankara");
        country.add("İstanbul");
        country.add("Kocaeli");
        country.add("Konya");
        country.add("Kayseri");
        country.remove("İstanbul");
        Collections.sort(country);//ArrayListi sıralar.
        for (String s : country) {
            System.out.println(s);
        }
    }
}
