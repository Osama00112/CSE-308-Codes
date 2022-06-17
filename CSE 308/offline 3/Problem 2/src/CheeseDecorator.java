public class CheeseDecorator extends Decorator {
    Burger baseBurger;
    CheeseDecorator(Burger b){
        baseBurger = b;
    }
    @Override
    public double price() {
        return baseBurger.price() + 20;
    }

    public void getDetails(){
        baseBurger.getDetails();
        System.out.println("Add-ons: Chesse");
    }

}
