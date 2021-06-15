package FoodDelivery;

import java.util.Scanner;

public class Application {
  static Scanner sc = new Scanner(System.in);

  FoodStore foodStore = FoodStore.getInstance();

  public void createSystemMenu() {
    boolean loop= true;
    while(loop){
    System.out.println("1. Print starters: ");
    System.out.println("2. Print Main Course: ");
    System.out.println("3. Print Snacks: ");
    System.out.println("4. Print Drinks: ");
    System.out.println("5. Add Food Items: ");
    System.out.println("6. Delete Food Items: ");
    System.out.println("7. Print Food Items: ");
    System.out.println("8. Add order:"  );
    System.out.println("9. Exit: ");
    System.out.println("Enter your choice: ");

    //FoodStore foodStore =  new FoodStore();
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        foodStore.printStarterItems();
        break;
      case 2:
        foodStore.printMainCourse();
        break;
      case 3:
        foodStore.printSnacks();
        break;
      case 4:
        foodStore.printDrinks();
        break;
      case 5:
        foodStore.addFoodItem();
        break;
      case 6: System.out.println("Enter name of food to delete");
        String name = sc.nextLine();
        sc.nextLine();
        foodStore.deleteFoodItem(name);
        break;
      case 7:
        foodStore.printAllFoodsSelected();
        break;
      case 8: OrderManager orderManager = new OrderManager();
              orderManager.placeOrder();
              break;
      case 9: loop = false;
        break;

     }
    }
  }

    public static void main(String[] args) {

      System.out.println("-------Welcome to Food Delivery System------");

      //Scanner sc = new Scanner(System.in);
        Application application = new Application();
        application.createSystemMenu();


    }
}
