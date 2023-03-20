public class Pizza extends Food {
    private String toppings;

    public Pizza(int cost, int calories, String toppings)
    {
        super(cost, calories);
        this.toppings = toppings;
    }

    public String getToppings()
    {
        return toppings;
    }
}
