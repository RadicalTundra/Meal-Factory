package factory.meals.american;

import factory.meals.Meal;


/**
 *
 * @author tgrady4
 */
public class Breakfast implements Meal {

    private String description;
    private int calories;

    public Breakfast() {
        description = "Dever Omelette";
        calories = 1500;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + calories + " calories.");
    }
    
}
