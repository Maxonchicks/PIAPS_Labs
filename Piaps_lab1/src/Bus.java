public class Bus implements Vehicle{
    private int passengersLimit = 30;
    private int passengers = 0;
    private Driver driver;

    @Override
    public void loadPassengers(int passengers) {
        if (this.passengers + passengers <= passengersLimit)
        {
            this.passengers += passengers;
        } else {
            System.out.println("Невозможно загрузить больше пассажиров в автобус. Достигнут лимит");
        }
    }

    @Override
    public void startJourney() {
        if (passengers > 0 && driver != null)
        {
            System.out.println("Автобус готов отправиться в путь с " + passengers + " пассажирами");
        }
        if (passengers == 0) {
            System.out.println("Автобус не может отправиться в путь без пассажиров");
        }
    }

    public void setDriver(Driver driver)
    {
        if (this.driver == null) {
            this.driver = driver;
        } else {
            System.out.println("В автобусе уже есть водитель");
        }
    }
}
