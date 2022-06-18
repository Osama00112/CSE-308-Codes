import java.util.Scanner;

public class Process {
    Burger MainMeal;
    public Burger getBurger(String option){
        String customOption;
        Scanner sc = new Scanner(System.in);
        String burger;
        String Appetizer;
        int count;
        AbstractFactory drinksFactory;

        switch (option) {
            case "1" -> {
                MainMeal = new Beef();
                MainMeal = new CheeseDecorator(MainMeal);
                MainMeal = new FrenchFries(MainMeal);
                MainMeal.getDetails();
                System.out.println("Price : " + MainMeal.price());
            }
            case "2" -> {
                MainMeal = new Veggi();
                MainMeal = new OnionRings(MainMeal);
                MainMeal = new Water(MainMeal);
                MainMeal.getDetails();
                System.out.println("Price : " + MainMeal.price());
            }
            case "3" -> {
                MainMeal = new Veggi();
                MainMeal = new FrenchFries(MainMeal);
                MainMeal = new Coke(MainMeal);
                MainMeal.getDetails();
                System.out.println("Price : " + MainMeal.price());
            }
            case "4" -> {
                MainMeal = new Veggi();
                MainMeal = new OnionRings(MainMeal);
                MainMeal = new Coffee(MainMeal);
                MainMeal = new Water(MainMeal);
                MainMeal.getDetails();
                System.out.println("Price : " + MainMeal.price());
            }
            case "5" -> {
                MainMeal = new Beef();
                MainMeal.getDetails();
                System.out.println("Price : " + MainMeal.price());
            }
            case "6" -> {
                System.out.println("Select Your Burger:\n" +
                        "1.Beef\n" +
                        "2.Veggi\n" +
                        "3.Chicken\n");
                customOption = sc.next();
                if(customOption.equalsIgnoreCase("1"))
                    burger = "Beef";
                else if(customOption.equalsIgnoreCase("2"))
                    burger = "Veggie";
                else if(customOption.equalsIgnoreCase("3"))
                    burger = "Chicken";
                else
                    burger = null;
                AbstractFactory burgerFactory = FactoryProducer.getFactory("Burger");
                MainMeal = burgerFactory.getBurger(burger);

                System.out.println("Do you want Add-on Cheese?");
                customOption = sc.next();
                if(customOption.equalsIgnoreCase("yes"))
                    MainMeal = new CheeseDecorator(MainMeal);

                System.out.println("Select Your Appetizer:\n" +
                        "1.Onion Rings\n" +
                        "2.French Fries\n");
                customOption = sc.next();
                if(customOption.equalsIgnoreCase("1"))
                    Appetizer = "OnionRings";
                else if(customOption.equalsIgnoreCase("2"))
                    Appetizer = "FrenchFries";
                else
                    Appetizer = null;
                AbstractFactory appetizerFactory = FactoryProducer.getFactory("Appetizer");
                MainMeal = appetizerFactory.getAppetizer(Appetizer,MainMeal);

                drinksFactory = FactoryProducer.getFactory("Drinks");
                //Ordering Water
                System.out.println("Select the number of Water You want:");
                customOption = sc.next();
                count = Integer.parseInt(customOption);
                for(int i = 0; i<count; i++){
                    MainMeal = drinksFactory.getDrinks("Water",MainMeal);
                }

                //Ordering Coffee
                System.out.println("Select the number of Coffee You want:");
                customOption = sc.next();
                count = Integer.parseInt(customOption);
                for(int i = 0; i<count; i++){
                    MainMeal = drinksFactory.getDrinks("Coffee",MainMeal);
                }

                //Ordering Coke
                System.out.println("Select the number of Coke You want:");
                customOption = sc.next();
                count = Integer.parseInt(customOption);
                for(int i = 0; i<count; i++){
                    MainMeal = drinksFactory.getDrinks("Coke",MainMeal);
                }

                System.out.print("\nThank you for ordering\n");
                MainMeal.getDetails();
                System.out.println("Price : " + MainMeal.price());
            }
            default -> {
                System.out.println("Invalid Option");
            }
        }
        return MainMeal;
    }
}
