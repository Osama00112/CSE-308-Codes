public class OnionRings extends AppetizerDecorator{
    OnionRings(Burger b){
        baseBurger = b;
        name = "Onion Rings";
    }
    @Override
    public double price() {
        return baseBurger.price() + 70;
    }

    @Override
    public void getDetails() {
        baseBurger.getDetails();;
        System.out.println("Appetizer: Onion Rings");
    }
}
