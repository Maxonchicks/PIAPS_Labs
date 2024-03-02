public class Main {
    public static void main(String[] args) {
        Driver driver1 = Driver.getInstance("Права водителя1");
        Driver driver2 = Driver.getInstance("Права водителя2");

        System.out.println(driver1 == driver2);
        //Водитель1 и водитель2 относятся к одному и тому же экземпляру

        VehicleFactory busFactory = new BusFactory();
        Vehicle bus = busFactory.createVehicle();
        VehicleFactory taxiFactory = new TaxiFactory();
        Vehicle taxi = taxiFactory.createVehicle();

        //Установим водителей для автобуса и такси
        bus.setDriver(driver1);
        taxi.setDriver(driver2);

        //Пытаемся установить двух водитей в одну машину
        taxi.setDriver(driver1);


        //Загружаем пассажиров
        bus.loadPassengers(31);
        taxi.loadPassengers(5);

        //Загружаем пассажиров сверх лимита
//        bus.loadPassengers(10);


        bus.startJourney();
        taxi.startJourney();
    }
}
