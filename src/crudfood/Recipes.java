/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudfood;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Recipes {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Food> recipes = new ArrayList<>();

    public static void addRecipe() {

        System.out.print("Cuisine: ");
        String cuisine = sc.nextLine();

        System.out.print("Main ingredient: ");
        String ingredient = sc.nextLine();

        System.out.print("Meal type: ");
        String mealtype = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        Food r = new Food(cuisine, ingredient, mealtype, name);

        recipes.add(r);

    }

    public static void removeRecipebycuisine() {

        System.out.print("What is the Cuisine:");
        String cuisine = sc.nextLine();

        for (int i = recipes.size() - 1; i >= 0; i--) {

            if (recipes.get(i).getCuisine().equalsIgnoreCase(cuisine)) {
                recipes.remove(i);
            }
        }
    }

    public static void removeRecipebyname() {
        System.out.print("Recipe name to remove:");
        String recipeName = sc.nextLine();

        for (int i = recipes.size() - 1; i >= 0; i--) {
            if (recipes.get(i).getName().equalsIgnoreCase(recipeName)) {
                recipes.remove(i);
            }
        }

    }

    public static void updateRecipe() {
        //ask for name
        System.out.print("Name:");
        String name = sc.nextLine();

        //Find the recipe in the list
        for (int i = 0; i < recipes.size(); i++) {

            if (recipes.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("What do you want to update?");

                System.out.println("\n1.Recipe name");
                System.out.println("2.Cuisine");
                System.out.println("3.Ingredient");

                int usersChoice = sc.nextInt();
                sc.nextLine();

                switch (usersChoice) {
                    case 1:
                        System.out.println("New Recipe name:");
                        String newName = sc.nextLine();

                        recipes.get(i).setName(newName);

                        break;

                    case 2:
                        System.out.print("New Cuisine");
                        String newCuisine = sc.nextLine();

                        recipes.get(i).setCuisine(newCuisine);

                        break;

                    case 3:
                        System.out.print("new main ingredient:");
                        String newIngredient = sc.nextLine();

                        recipes.get(i).setIngredient(newIngredient);

                        break;

                    default:
                        System.out.println("Wrong choice");

                }

            }

        }

        //What do you want update
        //what do you want to update it to
        //use the set method of the recipe to do the update
    }

    public static void showAll() {
        for (int i = 0; i < recipes.size(); i++) {
            System.out.println(recipes.get(i));
        }

    }

    public static void showByName() {
        System.out.println("What is the Name");
        String name = sc.nextLine();

        for (int i = 0; i < recipes.size(); i++) {

            if (recipes.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(recipes.get(i));
            }
        }

    }

    public static void showAllRecipesbyCuisine() {
//ask which cuisine
        System.out.println("Which cuisine:");
        String CuisineName = sc.nextLine();
//go through the arrayList and for each recipe get the cuisine
//if the cuisine is the cuisine we look for print the recipe
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getCuisine().equalsIgnoreCase(CuisineName)) {
                System.out.println(recipes.get(i));
            }
        }
    }

    static void saveToFile() {

        try {
            OutputStream file = new FileOutputStream("saved");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(recipes);
        } catch (IOException ex) {
            System.out.println("Error saving" + ex);
        }

    }

    static void readFromFile() {
        try {
            InputStream file = new FileInputStream("saved");
            ObjectInputStream in = new ObjectInputStream(file);
            recipes = (ArrayList<Food>) in.readObject();
        } catch (Exception ex) {
            System.out.println("Error reading" + ex);
        }
    }

}
