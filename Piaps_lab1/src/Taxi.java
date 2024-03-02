public class Taxi implements Vehicle{
    private int passengerLimit = 4;
    private int passengers = 0;
    private Driver driver;


    @Override
    public void loadPassengers(int passengers) {
        if (this.passengers + passengers <= passengerLimit) {
            this.passengers += passengers;
        } else {
            System.out.println("Невозможно загрузить больше пассажиров в такси. Достигнут лимит");
        }
    }

    @Override
    public void startJourney() {
        if (passengers > 0) {
            System.out.println("Такси готово отправиться в путь с " + passengers + " пассажирами");
        }
        if (passengers == 0){
            System.out.println("Такси не может отправиться в путь без пассажиров");
        }
    }

    public void setDriver(Driver driver) {
        if (this.driver == null) {
            this.driver = driver;
        } else {
            System.out.println("В такси уже есть водитель");
        }
    }
}

