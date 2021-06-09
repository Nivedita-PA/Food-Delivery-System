package FoodDelivery;

public class Peanuts extends FoodItem{
    public Peanuts() {
        this.setFoodName("Peanuts");
        this.setFoodType(FoodType.Veg);
        this.setFoodCategories(FoodCategories.Starter);
        this.setTaste(Taste.Medium_Spicy);
    }
}
