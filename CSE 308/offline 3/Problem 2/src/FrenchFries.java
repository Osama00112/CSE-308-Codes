public class FrenchFries extends AppetizerDecorator{
    FrenchFries(Burger b){
        baseBurger = b;
        name = "French Fries";
    }
    @Override
    public double price() {
        return baseBurger.price() + 80;
    }

    @Override
    public void getDetails() {
        baseBurger.getDetails();
        System.out.println("Appetizer: French fries");
    }
}
