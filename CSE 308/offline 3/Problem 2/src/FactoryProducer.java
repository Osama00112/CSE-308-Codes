public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Burger")){
            return new BurgerFactory();
        }
        else if(choice.equalsIgnoreCase("Appetizer")){
            return new AppetizerFactory();
        }
        else if(choice.equalsIgnoreCase("Drinks")){
            return new DrinksFactory();
        }
        else{
            return null;
        }
    }
}
