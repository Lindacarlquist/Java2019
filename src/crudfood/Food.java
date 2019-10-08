/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudfood;

import java.io.Serializable;

public class Food implements Serializable{
    private String cuisine;
    private String ingredient;
    private String mealtype;
    private String name;

    public Food(String cuisine, String ingredient, String mealtype, String name) {
        this.cuisine = cuisine;
        this.ingredient = ingredient;
        this.mealtype = mealtype;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getMealtype() {
        return mealtype;
    }

    public void setMealtype(String mealtype) {
        this.mealtype = mealtype;
    }

    @Override
    public String toString() {
        return  "Cuisine=" + cuisine + ",Main ingredient=" + ingredient + ", Meal type=" + mealtype + ", Name=" + name ;
    }
    
    

}
