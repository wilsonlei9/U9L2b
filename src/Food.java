public class Food {
    private int cost;
    private int calories;

    public Food(int cost, int calories)
    {
        this.cost = cost;
        this.calories = calories;
    }

    public int getCost()
    {
        return cost;
    }

    public int getCalories()
    {
        return calories;
    }

    public void eat()
    {
        System.out.println("eat");
    }
}
