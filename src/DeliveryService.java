import java.util.List;

public class DeliveryService {

    public void assignOrders(List<Customer> customers, List<Driver> drivers) {

        for (Customer customer : customers) {

            boolean assigned = false;

            for (Driver driver : drivers) {

                if (driver.isAvailable(customer.getOrderTime())) {
                    driver.assignOrder(customer.getOrderTime(), customer.getTravelTime());

                    System.out.println("C" + customer.getId() +
                            " - D" + driver.getId());

                    assigned = true;
                    break;
                }
            }

            if (!assigned) {
                System.out.println("C" + customer.getId() +
                        " - No Food :-(");
            }
        }
    }
}