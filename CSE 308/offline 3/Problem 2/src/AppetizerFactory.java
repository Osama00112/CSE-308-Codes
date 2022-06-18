public class AppetizerFactory extends AbstractFactory{
    public Burger getAppetizer(String name, Burger b){
        if(name.equalsIgnoreCase("OnionRings")){
            return new OnionRings(b);
        }
        else if(name.equalsIgnoreCase("FrenchFries")){
            return new FrenchFries(b);
        }
        else{
            return null;
        }
    }

    @Override
    Burger getDrinks(String name, Burger b) {
        return null;
    }

    @Override
    Burger getBurger(String name) {
        return null;
    }
}
