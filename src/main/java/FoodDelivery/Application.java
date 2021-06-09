package FoodDelivery;

import java.util.Scanner;

public class Application {
  static Scanner sc = new Scanner(System.in);
  FoodStore foodStore = FoodStore.getInstance();
  public void createSystemMenu() {
    System.out.println("1. Print starters: ");
    System.out.println("2. Print Main Course: ");
    System.out.println("3. Print Snacks: ");
    System.out.println("4. Print Drinks: ");
    System.out.println("5. Add Food Item: ");
    System.out.println("6. Prepare: ");
    System.out.println("7. Deliver: ");
    System.out.println("8. Add Food Item: ");
    System.out.println("Enter your choice: ");

    //FoodStore foodStore =  new FoodStore();
    int choice = sc.nextInt();
    switch (choice) {
      case 1: foodStore.printStarterItems();
        break;
      case 2: foodStore.printMainCourse();
        break;
      case 3: foodStore.printSnacks();
        break;
      case 4: foodStore.printDrinks();
        break;
      case 5: foodStore.addFoodItem();
        break;
      case 6: foodStore.removeFoodItem();
        break;
      case 7:
        break;


    }
  }

    public static void main(String[] args) {

      System.out.println("-------Welcome to Food Delivery System------");

      //Scanner sc = new Scanner(System.in);
        Application application = new Application();
        application.createSystemMenu();


    }
}
