public class Process {
    Burger MainMeal;
    public Burger getBurger(String option){

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
            default -> {
                System.out.println("Invalid Option");
            }
        }
        return MainMeal;
    }
}
