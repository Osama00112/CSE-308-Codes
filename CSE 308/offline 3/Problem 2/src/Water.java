public class Water extends DrinksDecorator{
    Water(Burger b){
        baseBurger = b;
        name = "Water";
    }
    @Override
    public double price() {
        return baseBurger.price() + 40;
    }

    @Override
    public void getDetails() {
        baseBurger.getDetails();
        System.out.println("Drinks: Water");
    }
}
