import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N,M:");
        String[] firstLine = scanner.nextLine().split(",");
        int N = Integer.parseInt(firstLine[0].trim());
        int M = Integer.parseInt(firstLine[1].trim());

        List<Customer> customers = new ArrayList<>();

        System.out.println("Enter O,T for each customer:");

        for (int i = 1; i <= N; i++) {
            String[] line = scanner.nextLine().split(",");
            int orderTime = Integer.parseInt(line[0].trim());
            int travelTime = Integer.parseInt(line[1].trim());
            customers.add(new Customer(i, orderTime, travelTime));
        }

        List<Driver> drivers = new ArrayList<>();
        for (int i = 1; i <= M; i++) {
            drivers.add(new Driver(i));
        }

        customers.sort(Comparator.comparingInt(Customer::getOrderTime));

        DeliveryService service = new DeliveryService();
        service.assignOrders(customers, drivers);

        scanner.close();
    }
}