public class Sandwich extends Food {
    private String ingredients;

    public Sandwich(int cost, int calories, String ingredients)
    {
        super(cost, calories);
        this.ingredients = ingredients;
    }

    public String getIngredients()
    {
        return ingredients;
    }
}
