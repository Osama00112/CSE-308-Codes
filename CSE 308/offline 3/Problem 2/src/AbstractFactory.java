public abstract class AbstractFactory {
    abstract Burger getAppetizer(String name, Burger b);
    abstract Burger getDrinks(String name, Burger b);
    abstract Burger getBurger(String name);
}
