import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "Ahmet", "YAVUZ"));
        customers.add(new Customer(2, "Hakan", "KARA"));
        customers.add(new Customer(3, "Mehmet", "AKMAN"));
        
        for (Customer s : customers) {
            System.out.println(s.firstName);
        }
    }
}
