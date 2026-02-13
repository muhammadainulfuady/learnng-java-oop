public class SpecificVehicle extends PublicTransport {
    int minimumTemperatur;

    public SpecificVehicle(String unitName, int capacity, String status, int minimumTemperatur) {
        super(unitName, capacity, status);
        this.minimumTemperatur = minimumTemperatur;
    }

    @Override
    void displaysTheVehicle() {
        super.displaysTheVehicle();
        System.out.println("Suhu Minimum        : " + minimumTemperatur + " Derajat Celcius");
    }
}