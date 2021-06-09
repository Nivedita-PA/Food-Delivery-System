package FoodDelivery;

enum Taste{
     Sweet,Sour,Spicy,Non_Spicy,Medium_Spicy,Salty;
}

enum FoodType{
    Veg,Non_Veg;
}

enum FoodCategories{
    Starter,Main_Course,Snacks,Drinks;
}

public class FoodItem {
    private String FoodName;
    private float Price;
    private FoodType FoodType;
    private Taste Taste;
    private FoodCategories foodCategories;

    public String getFoodName() {
        return FoodName;
    }

    protected void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public FoodDelivery.FoodType getFoodType() {
        return FoodType;
    }

    public void setFoodType(FoodDelivery.FoodType foodType) {
        FoodType = foodType;
    }

    public FoodDelivery.Taste getTaste() {
        return Taste;
    }

    public void setTaste(FoodDelivery.Taste taste) {
        Taste = taste;
    }

    public FoodCategories getFoodCategories() {
        return foodCategories;
    }

    public void setFoodCategories(FoodCategories foodCategories) {
        this.foodCategories = foodCategories;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "FoodName='" + FoodName + '\'' +
                ", Price=" + Price +
                ", FoodType=" + FoodType +
                ", Taste=" + Taste +
                ", foodCategories=" + foodCategories +
                '}';
    }
}


