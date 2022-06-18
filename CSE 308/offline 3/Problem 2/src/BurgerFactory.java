public class BurgerFactory extends AbstractFactory{
    @Override
    Burger getAppetizer(String name, Burger b) {
        return null;
    }

    @Override
    Burger getDrinks(String name, Burger b) {
        return null;
    }

    public Burger getBurger(String name){
        if(name.equalsIgnoreCase("Veggi")){
            return new Veggi();
        }
        else if (name.equalsIgnoreCase("Beef")){
            return new Beef();
        }
        else if(name.equalsIgnoreCase("Chicken")){
            return new Chicken();
        }
        else{
            return null;
        }
    }
}
