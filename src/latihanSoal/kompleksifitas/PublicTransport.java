public class PublicTransport {
    // create a vehicle field
    String unitName;
    int capacity;
    String status;

    // create an overloaded constructor that can accept everything
    public PublicTransport(String unitName, int capacity, String status) {
        this.unitName = unitName;
        this.capacity = capacity;
        this.status = status;
    }

    /*
     * create an Overloading constructor that can accept everything without and
     * may if not all
     */
    public PublicTransport(String unitName, int capacity) {
        this.unitName = unitName;
        this.capacity = capacity;
        this.status = "Stanby";
    }

    void displaysTheVehicle() {
        System.out.println("\nUnit Name           : " + unitName);
        if (capacity == 0) {
            System.out.println("Capacity            : " + capacity + " Kg (Belum setting)");
        } else {
            System.out.println("Capacity            : " + capacity + " Kg");
        }
        System.out.println("Status              : " + status);
    }
}
