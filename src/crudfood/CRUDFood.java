/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudfood;

import java.util.Scanner;

/**
 *
 * @author froke
 */
public class CRUDFood {

    static boolean loop = true;

    public static void main(String[] args) {

        while (loop) {
            menu();
        }

    }

    public static void menu() {
        System.out.println("1. Add recipe");
        System.out.println("2. Remove recipe by cuisine");
        System.out.println("3. Remove recipe by name");
        System.out.println("4. Update recipe");
        System.out.println("5. Show all recipes ");
        System.out.println("6. Show a certain recipe");
        System.out.println("7. Show all recipes by cuisine");
        System.out.println("8. Save all to file");
        System.out.println("9. Read all from file");
        System.out.println("0. Exit");
        System.out.print("\nMake a choice");

        int choice = Recipes.sc.nextInt();
        Recipes.sc.nextLine();

        switch (choice) {
            case 0:
                loop = false;
                break;

            case 1:
                Recipes.addRecipe();
                break;

            case 2:
                Recipes.removeRecipebycuisine();
                break;

            case 3:
                Recipes.removeRecipebyname();
                break;

            case 4:
                Recipes.updateRecipe();
                break;

            case 5:
                Recipes.showAll();
                break;

            case 6:
                Recipes.showByName();
                break;

            case 7:
                Recipes.showAllRecipesbyCuisine();
                break;
            case 8:
                Recipes.saveToFile();
                break;
            case 9:
                Recipes.readFromFile();
                break;

        }

    }

}
