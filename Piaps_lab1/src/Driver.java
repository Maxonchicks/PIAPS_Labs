public class Driver {
    private static Driver instance;
    private String category;

    private Driver(String category) {
        this.category = category;
    }

    public static Driver getInstance(String category)
    {
        if (instance == null)
        {
            instance = new Driver(category);
        }
        return instance;
    }

    public String getCategory()
    {
        return category;
    }

}