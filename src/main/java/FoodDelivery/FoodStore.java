package FoodDelivery;

import java.util.*;

//Data layer
public class FoodStore {

    Set<FoodItem> list = new HashSet<>();
    private static FoodStore instance;
    private FoodStore() {
    }
    static synchronized FoodStore getInstance() {
        if (instance == null) {
            instance = new FoodStore();
        }
        return instance;
    }

    FoodItem foodItem ;
    Scanner sc = new Scanner(System.in);


    public void deleteFoodItem(String item) {
        list.stream()
                 .filter(del -> del.getFoodName().equals(item))
                 .findFirst()
                 .map(del -> {
                  list.remove(del);
                  return del;
        });
    }

    public void printAllFoodsSelected() {
        list.stream().forEach(System.out::println);
    }

    public void printDrinks() {
        list.stream().filter(s->s.getFoodCategories().equals(FoodCategories.Drinks)).forEach(System.out::println);
    }

    public void printSnacks() {
        list.stream().filter(s->s.getFoodCategories().equals(FoodCategories.Snacks)).forEach(System.out::println);
    }

    public void printMainCourse() {
        list.stream().filter(s->s.getFoodCategories().equals(FoodCategories.Main_Course)).forEach(System.out::println);
    }

    public void printStarterItems() {
        list.stream().filter(s -> s.getFoodCategories().equals(FoodCategories.Starter)).forEach(System.out::println);
    }

    public void addFoodItem() {
        foodItem = new FoodItem();
        System.out.println("Enter:");
        setfoodName();
        setfoodTypeOPt();
        setfoodTasteOpt();
        setfoodCategories();
        setfoodPrice();
        list.add(foodItem);
        printAllFoodsSelected();

    }

    public void setfoodTypeOPt() {
        System.out.println("Enter 1. Veg" + "\n" + "2. NonVeg");
        int choice = this.sc.nextInt();
        switch (choice) {
            case 1:
                foodItem.setFoodType(FoodType.Veg);
                break;
            case 2:
                foodItem.setFoodType(FoodType.Non_Veg);
                break;
        }

    }

    public void setfoodTasteOpt() {
        System.out.println("Enter the taste");
        System.out.println("1. Sweet");
        System.out.println("2. Sour");
        System.out.println("3. Spicy");
        System.out.println("4. Non Spicy");
        System.out.println("5. Medium Spicy");
        System.out.println("6. Salty");
        int Tastechoice = sc.nextInt();
        switch (Tastechoice) {
            case 1:
                foodItem.setTaste(Taste.Sweet);
                break;
            case 2:
                foodItem.setTaste(Taste.Sour);
                break;
            case 3:
                foodItem.setTaste(Taste.Spicy);
                break;
            case 4:
                foodItem.setTaste(Taste.Non_Spicy);
                break;
            case 5:
                foodItem.setTaste(Taste.Medium_Spicy);
                break;
            case 6:
                foodItem.setTaste(Taste.Salty);
                break;

        }
    }

    public void setfoodCategories() {
        System.out.println("Enter food categories: ");
        System.out.println("1. Starter");
        System.out.println("2. Main-Course");
        System.out.println("3. Snacks");
        System.out.println("4. Drinks");
        int foodcategory = sc.nextInt();
        switch (foodcategory) {
            case 1:
                foodItem.setFoodCategories(FoodCategories.Starter);
                break;
            case 2:
                foodItem.setFoodCategories(FoodCategories.Main_Course);
                break;
            case 3:
                foodItem.setFoodCategories(FoodCategories.Snacks);
                break;
            case 4:
                foodItem.setFoodCategories(FoodCategories.Drinks);
                break;
        }
    }

    public void setfoodPrice(){
        System.out.println("Enter food price: ");
        float price = sc.nextInt();
        foodItem.setPrice(price);
    }

    public void setfoodName(){
        System.out.println("Enter food: ");
        String foodName = this.sc.nextLine();
        foodItem.setFoodName(foodName);
    }
}


