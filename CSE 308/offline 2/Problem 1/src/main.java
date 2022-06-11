import java.util.Scanner;
import System.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Director director = new Director();
        SystemFactory sFactory = new SystemFactory();
        //List<IBuilder> builderList = new ArrayList<>();
        //List<Product> products = new ArrayList<>();
        Product p;
        IBuilder builder;
        String option;
        String connectivity;
        String system;
        int unitAMount;

        System.out.println("Enter Queue Management System option");
        System.out.println("""
                1.Deluxe: LCD panel with Raspberry Pi
                2.Optimal: Arduino Mega with LED matrix
                3.Poor: ATMega32 with LED matrix
                """);
        option = sc.next();
        if(option.equalsIgnoreCase("1")){
            system = "Deluxe";
        }else if(option.equalsIgnoreCase("2")){
            system = "Optimal";
        }else if(option.equalsIgnoreCase("3")){
            system = "Poor";
        }else{
            system = null;
            System.out.println("Invalid Option");
        }

        //system = sc.next();
        builder = sFactory.getBuilder(system);
        //builderList.add(builder);

        System.out.println("\nEnter communication channel: ");
        System.out.println("""
                1. Broadband (Wifi Module)
                2. Mobile Data
                """);

        option = sc.next();
        if(option.equalsIgnoreCase("1")){
            connectivity = "BroadBand";
        }else if(option.equalsIgnoreCase("2")){
            connectivity = "Mobile";
        }else{
            connectivity = null;
            System.out.println("Invalid Option");
        }

        System.out.println("\nEnter amount of display units :");
        unitAMount = Integer.parseInt(sc.next());

        director.construct(builder, connectivity, unitAMount);
        p = builder.getProduct();
        p.show();

    }
}
