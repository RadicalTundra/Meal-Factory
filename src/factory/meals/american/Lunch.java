/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.meals.american;

import factory.meals.Meal;

/**
 *
 * @author tgrady4
 */
public class Lunch implements Meal {
    private String description;
    private boolean heartAttackInducing;
    public Lunch() {
        description = "Culvers Bacon Deluxe";
        heartAttackInducing = true;
    }

    @Override
    public void dispayMeal() {
        System.out.println(description + " is " + (heartAttackInducing ? "heart attack inducing." : "normal American food."));
    }
}
