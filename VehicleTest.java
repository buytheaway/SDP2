public class VehicleTest {
    public static void main(String[] args) {
        Vehicle fullyLoadedVehicle = new Vehicle.Builder()
                .withEngineType("V8")
                .withTransmission("Automatic")
                .withColor("Red")
                .withSunroof(true)
                .withNumberOfDoors(4)
                .build();

        System.out.println("Fully Loaded Vehicle: " + fullyLoadedVehicle);

        Vehicle basicVehicle = new Vehicle.Builder()
                .withEngineType("Electric")
                .withTransmission("Manual")
                .withColor("Black")
                .withNumberOfDoors(2)
                .build();

        System.out.println("Basic Vehicle: " + basicVehicle);
    }
}
