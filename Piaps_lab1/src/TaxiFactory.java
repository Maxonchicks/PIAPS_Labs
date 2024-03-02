public class TaxiFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Taxi();
    }
}
