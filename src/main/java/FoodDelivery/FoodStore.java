package FoodDelivery;

import java.util.ArrayList;
import java.util.Scanner;

//Data layer
public class FoodStore {

    ArrayList<FoodItem> list = new ArrayList<>();


    public void prepare(FoodItem foodItem){
        list.add(foodItem);
    }

    public void deliver(FoodItem foodItem){
        list.remove(foodItem);

    }
//    public void prepare(Noodles noodle){
//        list.prepare(noodle);
//    }
//
//    public void prepare(VegWrap vegWrap){
//        list.prepare(vegWrap);
//    }
//
//    public void prepare(Dosa dosa){
//        list.prepare(dosa);
//    }


    public void print(){
        for (FoodItem foodItem:list) {
            System.out.println(foodItem);
        }
    }

    public void createSystemMenu() {
        System.out.println("1. Print starters: ");
        System.out.println("2. Print Main Course: ");
        System.out.println("3. Print Snacks: ");
        System.out.println("4. Print Drinks: ");
        System.out.println("5. Prepare: ");
        System.out.println("6. Deliver: ");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        switch (choice) {
            case 1: printStarterItems();
                break;
            case 2: printMainCourse();
                break;
            case 3: printSnacks();
                break;
            case 4: printDrinks();
                break;
            case 5: prepareFoodItem();
                break;
            case 6:
                break;


        }
    }

    private void prepareFoodItem() {
        Scanner sc = new Scanner(System.in);
        for(FoodItem item : list){
            if(item.getFoodName() == sc.next()){
                System.out.println("Selected food: " + item);
            }
        }
    }


    private void printDrinks() {
        for (FoodItem drinks : list) {
            if(drinks.getFoodCategories() == FoodCategories.Drinks){
                System.out.println("Drinks: " + drinks);
            }
        }
    }

    private void printSnacks() {
        for (FoodItem snacks : list) {
            if((snacks.getFoodCategories()) == (FoodCategories.Drinks)){
                System.out.println("Snacks: " + snacks);
            }
        }
    }

    private void printMainCourse() {
        for(FoodItem mainCourse : list){
            if((mainCourse.getFoodCategories()) == (FoodCategories.Main_Course)){
                System.out.println("Main course: " + mainCourse);
            }
        }
    }

    private void printStarterItems() {
        for (FoodItem starters : list) {
            if((starters.getFoodCategories()) == (FoodCategories.Starter)) {
                System.out.println("Starters: " + starters);
            }
        }
    }
}
