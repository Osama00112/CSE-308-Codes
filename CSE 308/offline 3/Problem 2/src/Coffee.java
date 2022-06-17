public class Coffee extends DrinksDecorator {
    Coffee(Burger b){
        baseBurger = b;
        name = "Coffee";
    }
    @Override
    public double price() {
        return baseBurger.price() + 60;
    }

    @Override
    public void getDetails() {
        baseBurger.getDetails();
        System.out.println("Drinks: Coffee");
    }
}
