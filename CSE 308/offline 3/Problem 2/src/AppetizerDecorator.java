public abstract class AppetizerDecorator extends Decorator {
    Burger baseBurger;
    @Override
    public abstract double price();
    public abstract void getDetails();
}
