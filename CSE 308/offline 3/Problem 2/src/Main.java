import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String option;
        String customOption;
        String burger;
        String Appetizer;
        int count;
        Process procedure = new Process();
        Burger MainMeal;
        System.out.println("Select an option from the list of Platters:\n" +
                "1. Beef burger with French fry and cheese\n" +
                "2. Veggi Pizza with onion rings and Bottle of Water\n" +
                "3. A combo meal with Veggi burger, French Fry and Coke\n" +
                "4. A combo meal with Veggi burger, Onion Rings, Coffee and Water\n" +
                "5. A Beef buger only\n" +
                "6. Custom Option\n");
        option = sc.next();
        MainMeal = procedure.getBurger(option);


    }
}
