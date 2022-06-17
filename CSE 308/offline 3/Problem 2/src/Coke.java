public class Coke extends DrinksDecorator{
    Coke(Burger b){
        baseBurger = b;
        name = "Coke";
    }
    @Override
    public double price() {
        return baseBurger.price() + 55;
    }

    @Override
    public void getDetails() {
        baseBurger.getDetails();
        System.out.println("Drinks: Coke");
    }
}
