package FoodDelivery;

import java.util.ArrayList;
import java.util.Scanner;

//Data layer
public class FoodStore {

    ArrayList<FoodItem> list = new ArrayList<>();
    private static FoodStore instance;

    private FoodStore(){

    }
    static synchronized  FoodStore getInstance(){
        if(instance == null){
            instance =  new FoodStore();
        }
        return instance;
    }

    public void add(FoodItem foodItem){
        list.add(foodItem);
    }

    public void removeFood(FoodItem foodItem){
        list.remove(foodItem);

    }
//    public void add(Noodles noodle){
//        list.add(noodle);
//    }
//
//    public void add(VegWrap vegWrap){
//        list.add(vegWrap);
//    }
//
//    public void add(Dosa dosa){
//        list.add(dosa);
//    }


    public void print(){
        for (FoodItem foodItem:list) {
            System.out.println(foodItem);
        }
    }



//    public void prepareFoodItem() {
//        Scanner sc = new Scanner(System.in);
//        for(FoodItem item : list){
//            if(item.getFoodName() == sc.next()){
//                System.out.println("Selected food: " + item);
//            }
//        }
//    }


    public void printDrinks() {
        for (FoodItem drinks : list) {
            if(drinks.getFoodCategories() == FoodCategories.Drinks){
                System.out.println("Drinks: " + drinks);
            }
        }
    }

    public void printSnacks() {
        for (FoodItem snacks : list) {
            if((snacks.getFoodCategories()) == (FoodCategories.Drinks)){
                System.out.println("Snacks: " + snacks);
            }
        }
    }

    public void printMainCourse() {
        for(FoodItem mainCourse : list){
            if((mainCourse.getFoodCategories()) == (FoodCategories.Main_Course)){
                System.out.println("Main course: " + mainCourse);
            }
        }
    }

    public void printStarterItems() {
        for (FoodItem starters : list) {
            if((starters.getFoodCategories()) == (FoodCategories.Starter)) {
                System.out.println("Starters: " + starters);
            }
        }
    }

    public void addFoodItem() {
        Scanner sc =  new Scanner(System.in);
        FoodItem foodItem = new FoodItem();

        System.out.println("Enter food categories: ");
        System.out.println("1. Starter");
        System.out.println("2. Main-Course");
        System.out.println("3. Snacks");
        System.out.println("4. Drinks");
        int foodcategory = sc.nextInt();
        switch (foodcategory){
            case 1:
                foodItem.setFoodCategories(FoodCategories.Starter);
                break;
            case 2:
                foodItem.setFoodCategories(FoodCategories.Main_Course);
            case 3:
                foodItem.setFoodCategories(FoodCategories.Snacks);
            case 4:
                foodItem.setFoodCategories(FoodCategories.Drinks);
        }

        System.out.println("Enter the food name: ");
        String foodName = sc.nextLine();
        foodItem.setFoodName(foodName);
        System.out.println("Enter food price: ");
        float price = sc.nextInt();
        foodItem.setPrice(price);
        System.out.println("Enter 1. Veg" +"\n" + "2. NonVeg");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                foodItem.setFoodType(FoodType.Veg);
                break;
            case 2:
                foodItem.setFoodType(FoodType.Non_Veg);
        }
        System.out.println("Enter the taste");
        System.out.println("1. Sweet");
        System.out.println("2. Sour");
        System.out.println("3. Spicy");
        System.out.println("4. Non Spicy");
        System.out.println("5. Medium Spicy");
        System.out.println("6. Salty");
        int Tastechoice = sc.nextInt();
        switch(Tastechoice){
            case 1:
                foodItem.setTaste(Taste.Sweet);
            case 2:
                foodItem.setTaste(Taste.Sour);
            case 3:
                foodItem.setTaste(Taste.Spicy);
            case 4:
                foodItem.setTaste(Taste.Non_Spicy);
            case 5:
                foodItem.setTaste(Taste.Medium_Spicy);
            case 6:
                foodItem.setTaste(Taste.Salty);

        }
        add(foodItem);

    }


    public void removeFoodItem() {
        
    }
}
