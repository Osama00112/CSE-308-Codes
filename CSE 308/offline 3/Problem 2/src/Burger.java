public abstract class Burger {
    public String name = null;
    public abstract double price();
    void getDetails(){
        System.out.println("Burger Details\n" +
                name);
    }
}
