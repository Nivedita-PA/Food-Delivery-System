package FoodDelivery;

public class Application {

    public static void main(String[] args) {

      System.out.println("-------Welcome to Food Delivery System------");

      Noodles noodles = new Noodles();
      noodles.setPrice(90);
      noodles.setFoodType(FoodType.Non_Veg);
      noodles.setTaste(Taste.Spicy);

      VegWrap vegWrap = new VegWrap();
      vegWrap.setPrice(100);
      vegWrap.setTaste(Taste.Medium_Spicy);
      vegWrap.setFoodType(FoodType.Veg);

      Dosa dosa = new Dosa();
      dosa.setPrice(180);
      dosa.setTaste(Taste.Non_Spicy);
      dosa.setFoodType(FoodType.Veg);

      Peanuts peanuts = new Peanuts();
      peanuts.setPrice(40);

      MasalaPapad masalaPapad = new MasalaPapad();
      masalaPapad.setPrice(100);

      Lassi lassi = new Lassi();
      lassi.setPrice(100);

      FoodStore foodStore = new FoodStore();

      //Adding food items
      foodStore.prepare(noodles);
      foodStore.prepare(vegWrap);
      foodStore.prepare(dosa);
      foodStore.prepare(peanuts);
      foodStore.prepare(masalaPapad);
      foodStore.prepare(lassi);
//      foodStore.print();

//      //Delivering food items
//      foodStore.deliver(vegWrap);
//      System.out.println("Items left after vegWrap delivery-------------");
//      foodStore.print();
//
//      foodStore.deliver(dosa);
//      System.out.println("Items left after dosa delivery-------------");
//      foodStore.print();
//
//      foodStore.deliver(noodles);
//      System.out.println("items left for delivery after noodles-------------");
//      foodStore.print();

      foodStore.createSystemMenu();
    }
}
