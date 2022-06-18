public class DrinksFactory extends AbstractFactory {
    @Override
    Burger getAppetizer(String name, Burger b) {
        return null;
    }

    public Burger getDrinks(String name, Burger b){
        if(name.equalsIgnoreCase("Water")){
            return new Water(b);
        }
        else if(name.equalsIgnoreCase("Coke")){
            return new Coke(b);
        }
        else if (name.equalsIgnoreCase("Coffee")){
            return new Coffee(b);
        }
        else {
            return null;
        }
    }

    @Override
    Burger getBurger(String name) {
        return null;
    }
}
