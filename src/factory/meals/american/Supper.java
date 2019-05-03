package factory.meals.american;

import factory.meals.Meal;

/**
 *
 * @author tgrady4
 */
public class Supper implements Meal{
    private String description;

    public Supper() {
        description = "Catfish with leamon and deep fried mashed potatoes";
    }

    @Override
    public void dispayMeal() {
        System.out.println(description);
    }
}
