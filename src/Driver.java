public class Driver {

    private int id;
    private int availableTime;

    public Driver(int id) {
        this.id = id;
        this.availableTime = 0;
    }

    public int getId() {
        return id;
    }

    public int getAvailableTime() {
        return availableTime;
    }

    public boolean isAvailable(int orderTime) {
        return availableTime <= orderTime;
    }

    public void assignOrder(int orderTime, int travelTime) {
        this.availableTime = orderTime + travelTime;
    }
}