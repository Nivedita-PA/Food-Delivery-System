package FoodDelivery;

public class Lassi extends FoodItem {
    public Lassi() {
        this.setFoodName("Lassi");
        this.setFoodType(FoodType.Veg);
        this.setTaste(Taste.Sweet);
        this.setFoodCategories(FoodCategories.Drinks);
    }
}
